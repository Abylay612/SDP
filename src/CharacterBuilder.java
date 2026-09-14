public class CharacterBuilder {
    private String name;
    private String characterClass;
    private int health;
    private int mana;
    private int level;
    private String weapon;
    private String armor;

    public CharacterBuilder() {
        reset();
    }

    // Сброс состояния к базовым значениям
    public CharacterBuilder reset() {
        this.name = "Unknown Hero";
        this.characterClass = "Novice";
        this.level = 1;
        this.health = 100;
        this.mana = 50;
        this.weapon = "Fists";
        this.armor = "Cloth";
        return this;
    }

    public CharacterBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CharacterBuilder setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
        return this;
    }

    public CharacterBuilder setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException("Level must be at least 1!");
        }
        this.level = level;
        return this;
    }

    public CharacterBuilder setHealth(int health) {
        if (health <= 0) {
            throw new IllegalArgumentException("Health must be greater than 0!");
        }
        this.health = health;
        return this;
    }

    public CharacterBuilder setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana cannot be negative!");
        }
        this.mana = mana;
        return this;
    }

    public CharacterBuilder setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public CharacterBuilder setArmor(String armor) {
        this.armor = armor;
        return this;
    }

    public Character build() {
        validateCharacterState();
        return new Character(name, characterClass, level, health, mana, weapon, armor);
    }

    private void validateCharacterState() {
        if (this.name == null || this.name.trim().isEmpty()) {
            throw new IllegalStateException("Character construction failed: Name cannot be empty.");
        }
    }
}
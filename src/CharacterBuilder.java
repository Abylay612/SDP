public class CharacterBuilder {
    private String name;
    private String characterClass;
    private int health;
    private int mana;
    private int level;
    private String weapon;
    private String armor;

    public CharacterBuilder(Builder builder){
        this.name = builder.name;
        this.characterClass = builder.characterClass;
        this.health = builder.health;
        this.mana = builder.mana;
        this.level = builder.level;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public static class Builder{
        private String name;
        private String characterClass;
        private int health;
        private int mana;
        private int level;
        private String weapon;
        private String armor;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setCharacterClass(String characterClass){
            this.characterClass = characterClass;
            return this;
        }

        public Builder setHealth(int health){
            this.health = health;
            return this;
        }

        public Builder setMana(int mana){
            this.mana = mana;
            return this;
        }

        public Builder setLevel(int level){
            this.level = level;
            return this;
        }

        public Builder setWeapon(String weapon){
            this.weapon = weapon;
            return this;
        }

        public Builder setArmor(String armor){
            this.armor = armor;
            return this;
        }

        public CharacterBuilder build(){
            return new CharacterBuilder(this);
        }
    }
}
public class Character {
    private final String name;
    private final String characterClass;
    private final int health;
    private final int mana;
    private final int level;
    private final String weapon;
    private final String armor;

    public Character(String name, String characterClass, int health, int mana, int level, String weapon, String armor){
        this.name = name;
        this.characterClass = characterClass;
        this.health = health;
        this.mana = mana;
        this.level = level;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getName(){ return name; }
    public String getCharacterClass(){
        return characterClass;
    }
    public int getHealth(){
        return health;
    }
    public int getMana(){
        return mana;
    }
    public int getLevel(){
        return level;
    }
    public String getWeapon(){
        return weapon;
    }
    public String getArmor(){
        return armor;
    }

    @Override
    public String toString() {
        return "Character {" +
                "Name='" + name + '\'' +
                ", Class='" + characterClass + '\'' +
                ", Health=" + health +
                ", Mana=" + mana +
                ", Level=" + level +
                ", Weapon='" + weapon + '\'' +
                ", Armor='" + armor + '\'' +
                '}';
    }
}

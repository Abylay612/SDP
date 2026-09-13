public class Character {
    private String name;
    private String characterClass;
    private int health;
    private int mana;
    private int level;
    private String weapon;
    private String armor;

    public Character(String name, String characterClass, int health, int mana, int level, String weapon, String armor){
        this.name = name;
        this.characterClass = characterClass;
        this.health = health;
        this.mana = mana;
        this.level = level;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getName(){
        return name;
    }

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
}

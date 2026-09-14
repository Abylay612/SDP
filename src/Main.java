public class Main {
    public static void main(String[] args) {
        CharacterBuilder character1 = new CharacterBuilder.Builder()
                .setName("Thorin")
                .setCharacterClass("Warrior")
                .setLevel(10)
                .setHealth(150)
                .setMana(20)
                .setWeapon("Greatsword")
                .setArmor("Heavy Plate")
                .build();
        System.out.println(character1.getName() + " " + character1.getCharacterClass() + " "
                + character1.getLevel() + " " + character1.getHealth() + " " + character1.getMana() +
                " " + character1.getWeapon() + " " + character1.getArmor() + " " + character1.getArmor());
    }
}

public class CharacterDirector {
    public Character constructWarrior(CharacterBuilder builder) {
        return builder.reset()
                .setName("Thorin")
                .setCharacterClass("Warrior")
                .setLevel(10)
                .setHealth(150)
                .setMana(20)
                .setWeapon("Greatsword")
                .setArmor("Heavy Plate")
                .build();
    }

    public Character constructMage(CharacterBuilder builder) {
        return builder.reset()
                .setName("Gandalf")
                .setCharacterClass("Mage")
                .setLevel(12)
                .setHealth(80)
                .setMana(200)
                .setWeapon("Magic Staff")
                .setArmor("Silk Robe")
                .build();
    }
}

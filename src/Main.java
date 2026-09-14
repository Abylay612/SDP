public class Main {
    public static void main(String[] args) {
        CharacterBuilder builder = new CharacterBuilder();
        CharacterDirector director = new CharacterDirector();

        // 1. Creating a standard character via Director
        Character warrior = director.constructWarrior(builder);
        System.out.println("--- Preset Character (Director) ---");
        System.out.println(warrior);

        // 2. Creating a unique character directly via the Builder
        Character customRogue = builder.reset()
                .setName("Valeera")
                .setCharacterClass("Rogue")
                .setLevel(5)
                .setHealth(110)
                .setMana(60)
                .setWeapon("Daggers")
                .setArmor("Leather")
                .build();

        System.out.println("\n--- Custom Character (Builder) ---");
        System.out.println(customRogue);
    }
}

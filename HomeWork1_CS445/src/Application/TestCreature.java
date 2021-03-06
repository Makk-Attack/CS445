package Application;

public class TestCreature{
    private static int CREATURE_COUNT = 6;
    private static int THING_COUNT = 10;

    public static void main(String[] args){
        Thing[] anArrayOfThings;
        anArrayOfThings = new Thing[THING_COUNT];
        Creature[] anArrayOfCreatures = new Creature[CREATURE_COUNT];

        for(int i = 0; i < THING_COUNT; i++) {
            anArrayOfThings[i] = new Thing("SimpleThing");
        }

        anArrayOfCreatures[0] = new Ant("Filk");
        anArrayOfCreatures[1] = new Bat("Bartok");
        anArrayOfCreatures[2] = new Bat ("Fidget");
        anArrayOfCreatures[3] = new Bat ("Rouge");
        anArrayOfCreatures[4] = new Fly ("Minnow");
        anArrayOfCreatures[5] = new Tiger ("Tigger");

        for(int j = 0; j < CREATURE_COUNT; j++){
            anArrayOfThings[j] = anArrayOfCreatures[j];
        }

        System.out.println("Things:");
        System.out.println();

        for(int k = 0; k < THING_COUNT; k++){
            System.out.println(anArrayOfThings[k].toString());
        }

        System.out.println();
        System.out.println("Creatures:");
        System.out.println();

        for(int l = 0; l < CREATURE_COUNT; l++){
            System.out.println(anArrayOfCreatures[l].toString());
        }

        for(int m = 0; m < CREATURE_COUNT; m++){
            System.out.println();
            anArrayOfCreatures[m].eat(anArrayOfThings[6]);
            anArrayOfCreatures[m].eat(anArrayOfCreatures[1]);
            anArrayOfCreatures[m].whatDidYouEat();
            anArrayOfCreatures[m].move();
        }

    }
}
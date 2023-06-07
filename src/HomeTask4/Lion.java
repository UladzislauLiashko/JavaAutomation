package HomeTask4;

public class Lion extends Animals {
    public static void roar() {
        System.out.println("Roaaar!");
    }

    public static void hunt() {
        System.out.println("Noone can see lion");
        roar();
        System.out.println("Oh, no, he is here!");
    }

}
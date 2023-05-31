import HomeTask3.*;

public class Main {
    public static void main(String[] args) {
        Breed ginger = new Breed("Ginger", "longhaired", "No");
        Nickname alisa = new Nickname("Alisa", "Female");
        Age alisasAge = new Age(2, 20, "Teenager");
        Color orange = new Color("Orange", 1, "No");
        Cat alisaCat = new Cat(alisa, ginger, orange, alisasAge);

        System.out.println(alisaCat);
    }
}
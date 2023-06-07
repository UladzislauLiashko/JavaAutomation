package HomeTask3;

public class Cat extends FelisCatus {
    Nickname nickname;
    Breed breedName;
    Color colorName;
    Age ageNumber;

    public Cat(Nickname nickname, Breed breedName, Color colorName, Age ageNumber) {
        this.nickname = nickname;
        this.breedName = breedName;
        this.colorName = colorName;
        this.ageNumber = ageNumber;
        defineEnvironmentByFood("Meat");
    }

    @Override
    public String toString() {
        return  nickname + ",\n" +
                breedName + ",\n" +
                colorName + ",\n" +
                ageNumber + ",\n" +
                (isAlive ? "Your cat is alive!" : "Your cat is dead :(" )  + "\n" +
                "Your cat is living on/in " + getEnvironment();
    }
}

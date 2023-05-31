package HomeTask3;

public class Cat {
    Nickname nickname;
    Breed breedName;
    Color colorName;
    Age ageNumber;

    public Cat(Nickname nickname, Breed breedName, Color colorName, Age ageNumber) {
        this.nickname = nickname;
        this.breedName = breedName;
        this.colorName = colorName;
        this.ageNumber = ageNumber;
    }

    @Override
    public String toString() {
        return  nickname + ",\n" +
                breedName + ",\n" +
                colorName + ",\n" +
                ageNumber;

    }
}

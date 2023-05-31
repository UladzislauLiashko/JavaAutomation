package HomeTask3;

public class Age {
    int animalYears;
    int humanYears;
    String name; //молодая, зрелая, взрослая

    public Age(int animalYears, int humanYears, String name)  //конструктор
    {
        this.animalYears = animalYears;
        this.humanYears = humanYears;
        this.name = name;
    }

    public int getAnimalYears() {
        return animalYears;
    }

    public int getHumanYears() {
        return humanYears;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Counting in animal years, cat is " + animalYears + " years old" +
                ". Counting in human years, cat  " + humanYears + " years old" +
                ". And according to this you cat is a " + name;
    }
}
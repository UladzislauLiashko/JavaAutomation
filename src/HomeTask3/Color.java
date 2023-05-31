package HomeTask3;

public class Color {
    String name;
    int numberOfColors;
    String feature; //полосатая, пятнистая


    public Color(String name, int numberOfColors, String feature)  //конструктор
    {
        this.name = name;
        this.numberOfColors = numberOfColors;
        this.feature = feature;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfColors() {
        return numberOfColors;
    }

    public String getFeature() {
        return feature;
    }

    @Override
    public String toString() {
        return "Cat's color is '" + name + '\'' +
                ", Cat has " + numberOfColors + " number of colors" +
                ", How many color features does cat have? - " + feature;
    }
}

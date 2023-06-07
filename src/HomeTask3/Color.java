package HomeTask3;

public class Color implements hasDescription {
    private String name;
    private int numberOfColors;
    private String feature; //полосатая, пятнистая


    public Color(String name, int numberOfColors, String feature)  //конструктор
    {
        this.name = name;
        this.numberOfColors = numberOfColors;
        this.feature = feature;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Cat's color is '" + name + '\'' +
                ", Cat has " + numberOfColors + " number of colors";
    }

    @Override
    public void printDescription() {
        System.out.println("Do your animal have color features? -" + feature);
    }

    @Override
    public void printDefaultDescription() {
        System.out.println("Nothing here");
    }
}

package HomeTask3;

public class Nickname {
    String name;
    String nameSex; //типа зависимость пола и имени. больше сюда ничего не придумал

    public Nickname(String name, String nameSex)  //конструктор
    {
        this.name = name;
        this.nameSex = nameSex;
    }

    public String getName() {
        return name;
    }
    public String getNameSex() {
        return nameSex;
    }

    @Override
    public String toString() {
        return  "Cat's name is '" + name + '\'' +
                ". Cat's sex is '" + nameSex;
    }
}

package HomeTask3;

//это порода, если чтo :D
public class Breed {
    String name;
    String furFeature; //короткошёрстная, длинношёрстная, лысая
    String feature; //косогласие, плоская морда

    public Breed(String name, String furFeature, String feature)  //конструктор
    {
        this.name = name;
        this.furFeature = furFeature;
        this.feature = feature;
    }

    public String getName() {
        return name;
    }

    public String getFurFeature() {
        return furFeature;
    }

    public String getFeature() {
        return feature;
    }

    @Override
    public String toString() {
        return "Cat's breed is '" + name + '\'' +
                ". Cat is '" + furFeature + '\'' +
                ". Does it have breed features? - " + feature;
    }
}


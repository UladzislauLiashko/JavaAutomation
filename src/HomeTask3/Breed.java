package HomeTask3;

import javax.sound.midi.Soundbank;

//это порода, если чтo :D
public class Breed implements hasDescription {
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
                ". Cat is '" + furFeature + '\'';
    }

        public void printDescription() {
            System.out.println("Do your animal have breed features? - " + feature);
        }
    }



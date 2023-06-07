package HomeTask3;

public class Mammal extends Animal {
    boolean landLiving;
    boolean waterLiving;
    boolean airLiving;

    public String getEnvironment(){
        String mainEnvironment = "";
        if (airLiving) {
            mainEnvironment += "Air";
        } if (waterLiving) {
            mainEnvironment += " Water";
        } if (landLiving) {
            mainEnvironment += " Land";
        }
        return mainEnvironment.trim();
    }

    public void defineEnvironmentByFood(String food){
        if (food.contains("Fish")) {
            waterLiving = true;
        } if (food.contains("Meat")) {
            landLiving = true;
        } if (food.contains("Bird")) {
            airLiving = true;
        }
    }
}

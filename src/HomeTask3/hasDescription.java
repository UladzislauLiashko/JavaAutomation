package HomeTask3;

public interface hasDescription { //интерфейс вывода дополнительной информации
     void printDescription();

    default void printDefaultDescription() {
        System.out.println("No description");
    }
}

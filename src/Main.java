import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        userInformation();
        allPossibleVariables();
        whileCycle();
        forCycle();
    }

    static void userInformation() {
        //Написатþ программу, вýводāûуĀ информаøиĀ о вас (имā, фамилиā, профессиā) <--- так текст из презентации копируется
        String firstName = "Vlad";
        String lastName = "Leshko";
        String jobName = "QA";
        String wholeText = String.format("My name is %s %s and my current job is %s", firstName, lastName, jobName);
        System.out.println(wholeText);
    }

    static void allPossibleVariables() {
        //Обüāвитþ и проиниøиализироватþ переменнýе всех вам известнýх типов и вýвести их знаùениā на ÿкран.
        byte singleByte = 1;
        short singleShort = 2;
        int userAge = 30;
        long singleLong = 3;
        float singFloat = 4.5F;
        double outsideTemperature = 24.4;
        boolean testingIsFun = true;
        char myLetter = 'V';
        String firstName = "Vlad";
        String allVariables = String.format("Byte - %s; \nShort - %s; \nInteger - %s; \nLong - %s; \nFloat - %s; \nDouble - %s; \nBoolean - %s; \nChar - %s; \nString - %s", singleByte, singleShort, userAge, singleLong, singFloat, outsideTemperature, testingIsFun, myLetter, firstName);
        System.out.println(allVariables);
    }

    static void whileCycle() {
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        while (!str.contains("Exit") ) {
            System.out.print("Please enter something");
            str = scanner.nextLine();
        }
    }

    static void forCycle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d”, x, sum");
    }
}






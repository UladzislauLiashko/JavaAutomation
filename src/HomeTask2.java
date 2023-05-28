import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
//        whileCycle();
//        doubleForCycle();
//        absForCycle();
//        ifElseCycle();
//        massivDannih();
        switchCase();
    }

    static void whileCycle() {
        String str = "";
        Scanner scanner = new Scanner(System.in);
        while (!str.contains("Exit")) {
            System.out.print("Please enter something. Send 'Exit' to leave cycle ");
            str = scanner.nextLine();
        }
    }

    static void absForCycle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= Math.abs(x); i++) {
            sum += i;
        }
        if (x < 0) {
            sum = -sum;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
    }

    static void doubleForCycle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        if (x > 0) {
            for (int i = 0; i <= x; i++) {
                sum += i;
            }
        } else {
            for (int i = 0; i >= x; i--) {
                sum += i;
            }
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
    }

    static void ifElseCycle() {
        boolean isInCorrectValue = true;
        do {
            System.out.print("Please enter your score: ");
            int score = new Scanner(System.in).nextInt();
            if (score >= 70) {
                if (score <= 100) {
                    System.out.println("Congrats! You’ve passed the test!");
                    isInCorrectValue = false;
                }
                if (score > 100) {
                    System.out.println("Sorry, you’ve entered the wrong value.");
                }
            } else {
                if (score > 0) {
                    System.out.println("Sorry, you’ve failed the test.");
                    isInCorrectValue = false;
                }
                if (score < 0) {
                    System.out.println("Sorry, you’ve entered the wrong value.");
                }
            }
        } while (isInCorrectValue);
    }

    static void massivDannih() {
        String[] channels = new String[]{"BT", "ONT", "TNT", "Eurosport"};
        int channel = 0;
        do {
            System.out.print("Please enter your channel: ");
            channel = new Scanner(System.in).nextInt();
            if (channel <= channels.length && channel > 0) {
                System.out.println("Your channel is " + channels[channel - 1]);
            } else {
                System.out.println("Wrong channel, please enter 1-4");
            }
        }
        while (channel > 0);
        System.out.println("Your TV is switched off");
    }

    static void switchCase() {
        String name = "";
        String lastName = "";
        int dateOfBirth = 0;
        System.out.println("""
                ○ 1. Ввести имя
                ○ 2. Ввести фамилию
                ○ 3. Ввести год рождения
                ○ 4. Вывести информацию
                ○ 0. Выход\s""");
        System.out.println("Выберите пункт меню");
        int item = new Scanner(System.in).nextInt();
        if (item > 0) {
            switch (item) {
                case 1:
                    System.out.println("Введите имя");
                    name = new Scanner(System.in).nextLine();
                case 2:
                    System.out.println("Введите фамилию");
                    lastName = new Scanner(System.in).nextLine();
                case 3:
                    System.out.println("Введите дату рождения");
                    dateOfBirth = new Scanner(System.in).nextInt();
                case 4:
                    System.out.println("Ваше имя - " + name );
                    System.out.println("Ваша фамилия - " + lastName);
                    System.out.println("Дата рождения - " + dateOfBirth);
            }
        } else if ( item == 0) {
            System.out.println("Leaving program");
        }
    }
}


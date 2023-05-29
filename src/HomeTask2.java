import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
//        whileCycle();
//        doubleForCycle();
//        absForCycle();
//        ifElseCycle();
//        remoteController();
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

    //здесь попробовал два способа добавить негативные значения
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

    static void remoteController() {
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
        String dateOfBirth = "";
        String item = ""; //сделал стрингом, чтобы в случае ввода НЕ цифры у меня падала ошибка, как в случае, когда цифра вне диапазона
        do {
            System.out.println("""
                    ○ 1. Ввести имя
                    ○ 2. Ввести фамилию
                    ○ 3. Ввести год рождения (в формате DD/MM/YYYY)
                    ○ 4. Вывести информацию
                    ○ 0. Выход""");
            System.out.println("\nВыберите пункт меню");
            item = new Scanner(System.in).nextLine();
            switch (item) {
                case "1":
                    System.out.println("Введите имя");
                    name = new Scanner(System.in).nextLine();
                    break;
                case "2":
                    System.out.println("Введите фамилию");
                    lastName = new Scanner(System.in).nextLine();
                    break;
                case "3":
                    System.out.println("Введите дату рождения");
                    dateOfBirth = new Scanner(System.in).nextLine();
                    break;
                case "4":
                    System.out.println("Ваше имя - " + name);
                    System.out.println("Ваша фамилия - " + lastName);
                    System.out.println("Дата рождения - " + dateOfBirth + "\n");
                    break;
                case "0":
                    System.out.println("Leaving program\n");
                    break;
                default:
                    System.out.println("There is no such menu item\n");
            }
        } while (!item.equals("0"));
    }
}


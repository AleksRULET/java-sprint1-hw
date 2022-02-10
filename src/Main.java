import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker();

        printMenu();
        int userInput = checkInputInteger();

        while (userInput != 0) {
            if (userInput == 1) {
                tracker.addSteps(inputMonth(), inputDay(), inputSteps());

            } else if (userInput == 2) {
                tracker.getStatistic(inputMonth());

            } else if (userInput == 3) {
                tracker.changeGoal(inputNewGoal());

            }  else {
                System.out.println("Такой комманды нет");
            }

            printMenu();
            userInput = scanner.nextInt();
        }
        System.out.println("Программа завершена");
    }

    static void printMenu() {
        System.out.println("Выбирете действие:");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Напечатать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("0. Выйти из приложения");
    }

    static int checkInputInteger() {
        Scanner scanner = new Scanner(System.in);
        int Integer;
        while (true) {
            if (scanner.hasNextInt()) {
                Integer = scanner.nextInt();
                break;
            } else {
                System.out.println("Некорректный ввод. Введите число");
                scanner.next();
            }
        }
        return Integer;
    }

    static int inputMonth() {
        System.out.println("Введите номер месяца: ");
        int month = checkInputInteger();
        while (true) {
            if ((month <= 0) || (month > 12)) {
                System.out.println("Введите номер месяца от 1 до 12: ");
                month = checkInputInteger();
            } else {
                break;
            }
        }
        return month;
    }

    static int inputDay() {
        System.out.println("Введите день месяца: ");
        int day = checkInputInteger();
        while (true) {
            if ((day <= 0) || (day > 30)) {
                System.out.println("Введите день месяца от 1 до 30: ");
                day = checkInputInteger();
            } else {
                break;
            }
        }
        return day;
    }

    static int inputSteps() {
        System.out.println("Введите количество шагов за день: ");
        int stepsPerDay = checkInputInteger();
        while (true) {
            if (stepsPerDay <= 0) {
                System.out.println("Введите положительное чило: ");
                stepsPerDay = checkInputInteger();
            } else {
                break;
            }
        }
        return stepsPerDay;
    }
    static int inputNewGoal() {
        System.out.println("Введите новую цель: ");
        int newGoal = checkInputInteger();
        while (true) {
            if (newGoal <= 0)  {
                System.out.println("Введите положительное чило");
                newGoal = checkInputInteger();
            } else {
                break;
            }
        }
        return newGoal;
    }
}


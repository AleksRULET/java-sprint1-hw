import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker();

        printMenu();
        int userInput = Check.inputInteger();

        while (userInput != 0) {
            if (userInput == 1) {
                System.out.println("Введите номер месяца: ");
                int month = Check.inputInteger();
                while (true) {
                    if ((month <= 0) || (month > 12)) {
                        System.out.println("Введите номер месяца от 1 до 12: ");
                        month = Check.inputInteger();
                    } else {
                        break;
                    }
                }
                System.out.println("Введите день месяца: ");
                int day = Check.inputInteger();
                while (true) {
                    if ((day <= 0) || (day > 30)) {
                        System.out.println("Введите день месяца от 1 до 30: ");
                        day = Check.inputInteger();
                    } else {
                        break;
                    }
                }
                System.out.println("Введите количество шагов за день: ");
                int stepsPerDay = Check.inputInteger();
                while (true) {
                    if (stepsPerDay <= 0) {
                        System.out.println("Введите положительное чило: ");
                        stepsPerDay = Check.inputInteger();
                    } else {
                        break;
                    }
                }
                tracker.addSteps(month, day, stepsPerDay);

            } else if (userInput == 2) {
                System.out.println("Введите номер месяца: ");
                int month = Check.inputInteger();
                while (true) {
                    if ((month <= 0) || (month > 12)) {
                        System.out.println("Введите номер месяца от 1 до 12: ");
                        month = Check.inputInteger();
                    } else {
                        break;
                    }

                }
                tracker.getStatistic(month);
            } else if (userInput == 3) {
                System.out.println("Введите новую цель: ");
                int newGoal = Check.inputInteger();
                while (true) {
                    if (newGoal <= 0)  {
                        System.out.println("Введите положительное чило");
                        newGoal = Check.inputInteger();
                    } else {
                        break;
                    }
                }
                tracker.changeGoal(newGoal);


            }  else {
                System.out.println("Такой комманды нет");
            }

            printMenu();
            userInput = scanner.nextInt();
        }
        System.out.println("Программа завершена");
    }
    private static void printMenu() {
        System.out.println("Выбирете действие:");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Напечатать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("0. Выйти из приложения");
    }
}


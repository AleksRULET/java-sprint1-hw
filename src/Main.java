import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker();

        printMenu();
        int userInput = checkInputInteger(scanner);

        while (userInput != 0) {
            if (userInput == 1) {
                tracker.addSteps(inputMonth(scanner), inputDay(scanner), inputSteps(scanner));

            } else if (userInput == 2) {
                tracker.getStatistic(inputMonth(scanner));

            } else if (userInput == 3) {
                tracker.changeGoal(inputNewGoal(scanner));

            }  else {
                System.out.println("Такой комманды нет");
            }

            printMenu();
            userInput = scanner.nextInt();
        }
        System.out.println("Программа завершена.");
    }

    static void printMenu() {
        System.out.println("Выбирете действие:");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Напечатать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("0. Выйти из приложения.");
    }

    static int checkInputInteger(Scanner scanner) {
        int inputValue;
        while (true) {
            if (scanner.hasNextInt()) {
                inputValue = scanner.nextInt();
                break;
            } else {
                System.out.println("Некорректный ввод. Введите число");
                scanner.next();
            }
        }
        return inputValue;
    }

    static int inputMonth(Scanner scanner) {
        System.out.println("Введите номер месяца: ");
        int month = checkInputInteger(scanner);
        while (true) {
            if ((month <= 0) || (month > 12)) {
                System.out.println("Введите номер месяца от 1 до 12: ");
                month = checkInputInteger(scanner);
            } else {
                break;
            }
        }
        return month;
    }

    static int inputDay(Scanner scanner) {
        System.out.println("Введите день месяца: ");
        int day = checkInputInteger(scanner);
        while (true) {
            if ((day <= 0) || (day > 30)) {
                System.out.println("Введите день месяца от 1 до 30: ");
                day = checkInputInteger(scanner);
            } else {
                break;
            }
        }
        return day;
    }

    static int inputSteps(Scanner scanner) {
        System.out.println("Введите количество шагов за день: ");
        int stepsPerDay = checkInputInteger(scanner);
        while (true) {
            if (stepsPerDay <= 0) {
                System.out.println("Введите положительное чило: ");
                stepsPerDay = checkInputInteger(scanner);
            } else {
                break;
            }
        }
        return stepsPerDay;
    }
    static int inputNewGoal(Scanner scanner) {
        System.out.println("Введите новую цель: ");
        int newGoal = checkInputInteger(scanner);
        while (true) {
            if (newGoal <= 0)  {
                System.out.println("Введите положительное чило");
                newGoal = checkInputInteger(scanner);
            } else {
                break;
            }
        }
        return newGoal;
    }
}


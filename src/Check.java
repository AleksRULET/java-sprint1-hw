import java.util.Scanner;

public class Check {
    public static int inputInteger() {
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
}

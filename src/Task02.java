import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < n; i++) {
            result <<= 1;
        }
    }
}

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ჩაწერე რიცხვი: ");
        int n = scanner.nextInt();

        int sum = 0;


        for (int number = 2; number <= n; number += 2) {
            sum += number;
        }

        System.out.println("გამოიტანე რიცხვების ჯამი: " + sum);

        scanner.close();
    }
}

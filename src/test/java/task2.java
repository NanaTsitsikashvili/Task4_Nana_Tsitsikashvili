import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ ასობგერა: ");
        char ch = scanner.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " არის ხმოვანი");
                break;
            default:
                System.out.println(ch + " არის თანხმოვანი");
                break;
        }

        scanner.close();
    }
}
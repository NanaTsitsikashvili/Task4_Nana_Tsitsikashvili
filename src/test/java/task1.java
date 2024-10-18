import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ჩაწერეთ ქულა 0-100: ");
        int score = scanner.nextInt();

        String grade;

        if (score < 0 || score > 100) {
            grade = "შეცდომა, ჩაწერეთ სწორი რიცხვი";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("ქულა: " + grade);

        scanner.close();
    }
}

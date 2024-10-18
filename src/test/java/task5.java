import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int targetNumber = random.nextInt(50) + 1;
        int guess = 0;

        System.out.println("გამოიცანი რიცხვი:");


        while (guess != targetNumber) {
            System.out.print("ჩაწერე რიცხვი: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("დაბალია, ისევ სცადე!");
            } else if (guess > targetNumber) {
                System.out.println("მაღალია, ისევ სცადე!");
            }
        }

        System.out.println("თქვენ გამოიცანით რიცხვი!: " + targetNumber);
        scanner.close();
    }
}

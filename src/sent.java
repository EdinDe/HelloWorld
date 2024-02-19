import java.util.Scanner;

public class sent {
    public static void main(String[] args) {

        int sentinental = -1;
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("indtast et tal eller -1 for at afslutte");
        int tal = scanner.nextInt();

        while(tal!=sentinental) {

            sum += tal;
            tal = scanner.nextInt();

            }
        System.out.println("Summen af de valgte tal er " + sum);

        }

    }


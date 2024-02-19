import java.util.Scanner;

public class tidberegner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("hvor mange hele timer er der gået");
        int timer = input.nextInt();
        System.out.println("der er gået " + timer + " timer");


        System.out.println("hvor mange minutter er der gået");
        int minutter = input.nextInt();
        System.out.println("der er gået " + minutter + " minutter");

        System.out.println("hvor mange sekunder er der gået");
        int sekunder = input.nextInt();
        System.out.println("der er gået " + sekunder + " sekunder");


        System.out.println("hvor mange sekunder er der gået siden midnat");
        int sekunderSidenMidnaet = (timer * 60 * 60 + minutter * 60) + sekunder;
        System.out.println("der er gået " + sekunderSidenMidnaet + " sekunder siden midnat");

    }
}

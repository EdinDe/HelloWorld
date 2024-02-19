import java.util.Scanner;

public class bmi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast vægt");

        double vaegt = input.nextDouble();

        System.out.println("Indtast højde");

        double hojde = input.nextDouble();

        double BMI = vaegt / (hojde * hojde);
        System.out.println("Din bmi er " + vaegt / (hojde * hojde));

        //opgave 2
        if (BMI < 18.5) {
            System.out.println("Du er undervægtig");
        }

        if (BMI >= 18.5 && BMI <=25) {
            System.out.println("Du er normalvægtig");
        }

        if (BMI >= 25 && BMI <= 30) {
            System.out.println("Du er overvægtig");
        }

        if (BMI > 30) {
            System.out.println("Du er svært overvægtig");

        }

















    }
}

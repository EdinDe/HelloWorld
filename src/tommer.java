import java.util.Scanner;

public class tommer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast en længde i tommer");

        double inches = input.nextDouble();

        final double cmPrtom = 2.54;

        double tom = inches*cmPrtom;

        System.out.println("Der er " + inches*cmPrtom + " cm " + " på " + tom + " tommer");











    }
}

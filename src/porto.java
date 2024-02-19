import java.util.Scanner;

public class porto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int prisPrG = 0;
        System.out.println("hvad er vægten");
        int vægt = input.nextInt();

        if (vægt <=50 && vægt >0) {
            prisPrG= 25;
            System.out.println("prisen er " + prisPrG);

        } else if (vægt >50 && vægt <=250) {
            prisPrG= 50;
            System.out.println("prisen er " + prisPrG);
            
        } else if (vægt >250 && vægt <=2000) {
            prisPrG = 75;
            System.out.println("prisen er " + prisPrG);

        }else if (vægt <= 0 || vægt >2000){
            System.out.println("kan ikke sendes");
        }
        
    }
}

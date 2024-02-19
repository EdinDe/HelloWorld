import java.util.Random;

public class terningkast {

    public static void main(String[] args) {


        Random rand = new Random();

        int sum = 0;
        int forsøg = 0;

        while (!(sum==7)) {
            int terning1 = rand.nextInt(6) + 1;
            int terning2 = rand.nextInt(6) + 1;
            sum = terning2 + terning1;
            System.out.println(terning2 + " + " + terning1 + " = " + sum);
            forsøg++;




        }
    }
}

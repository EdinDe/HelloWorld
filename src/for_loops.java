public class for_loops {

    public static void main(String[] args) {

        int n = 4;
        //for loop
        for (int i = 1; i<=n; i++) {
            System.out.println("2 gange " + i + " = " + i * 2);
        }

        for (int i = 2; i <= 12; i = i + 2){
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 4; i <= 79; i = i + 15){
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 30; i >= -20; i = i -10){
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = -7; i <= 13; i = i +4){
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 97; i >= 82; i = i -3){
            System.out.print(i + " ");
        }
        System.out.println();

    }
}

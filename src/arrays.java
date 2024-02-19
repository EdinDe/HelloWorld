
public class arrays {
    public static void main(String[] args) {

        //eller int[] mynumb = {34, 40, 45, 50, 56, 64, 75, 117}//
        int[] arr = new int[]{34, 40, 45, 50, 56, 64, 75, 117};{
            for (int i =0 ; i < arr.length; i++){
                System.out.println(arr[i]);
            }
            //for at få mellemrum i konsolen
            System.out.println();
        }

        String[] strarray = new String[]{"Hej ", "med ", "dig "};{

            System.out.println(strarray[0] + strarray[1] + strarray[2]);
        }
        //for at få mellemrum i konsolen
        System.out.println();


        double[] mynumb = {3.4, 2.5, 1.2, 6.7};
        System.out.println(mynumb[2]);
        System.out.println(mynumb.length-1);















    }
}

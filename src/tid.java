public class tid {

    public static void main(String[] args) {
        //efter midnat
        int tidTimer = 11;
        int tidMinut = 11;
        int tidSekund = 45;

        int resultat = 11*60*60+11*60+45;


        System.out.println("timer: " + tidTimer + " minutter: " + tidMinut + " sekunder: " + tidSekund);

        System.out.println("Siden midnat er der gået " + resultat + " sekunder");

        //til midnat
        int tidTilMidnatT = 13;
        int tilTilMidnatM = 25;
        int tilTilMidnatS = 30;

        int tidTilbage = 13*60*60+25*60+30;

        System.out.println("indtil næste midnat er der " + tidTilbage + " sekunder");

        //forskellen mellem start og slut
        int nuTimer = 11;
        int nuMinutter = 39;
        int nuSekunder = 47;

        int forksellen = (11*60-11*60)+(39*60-11*60)+(47-45);

        System.out.println("det har taget mig " + forksellen + " sekunder at lave opgaven");









    }
}

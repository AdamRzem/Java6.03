public class mieszkanie {
    public static void main(String[] args) {
        int liczbaPomieszczen, pomieszczenia3x4, pomieszczenia2x3, pomieszczenia2x2, powPom3x4, powPom2x3, powPom2x2, powMieszkania;
        pomieszczenia3x4 = 2;
        pomieszczenia2x2 = 1;
        pomieszczenia2x3 = 1;

        powPom3x4 = 3*4;
        powPom2x2 = 2*2;
        powPom2x3 = 2*3;

        powMieszkania = pomieszczenia2x2*powPom2x2 + pomieszczenia2x3*powPom2x3 + pomieszczenia3x4*powPom3x4;
        System.out.println(pomieszczenia3x4);
        System.out.println(powPom3x4);
        System.out.println();

        System.out.println(pomieszczenia2x2);
        System.out.println(powPom2x3);
        System.out.println();

        System.out.println(pomieszczenia2x2);
        System.out.println(powPom2x2);
        System.out.println();

        System.out.println(powMieszkania);


        double powNaOsobe;
        powNaOsobe = powMieszkania/4;
        System.out.println(powNaOsobe);






    }
}

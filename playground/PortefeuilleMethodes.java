public class PortefeuilleMethodes {

    public static double calculerTotal(double[] prix) {
        double total = 0;
        for (int i = 0; i < prix.length; i++) {
            total += prix[i];
        }
        return total;
    }

    public static boolean estCher(double prix) {
        return prix > 200;
    }

    public static void afficherAction(String symbole, double prix) {
        if (estCher(prix)) {
            System.out.println(symbole + " : " + prix + " DH (cher)");
        } else {
            System.out.println(symbole + " : " + prix + " DH");
        }
    }

    public static void main(String[] args) {
        String[] symboles = {"AA1314", "AA1515", "AA1617"};
        double[] prix = {112.0, 215, 120.5};

        for (int i = 0; i < symboles.length; i++) {
            afficherAction(symboles[i], prix[i]);
        }

        System.out.println("Total : " + calculerTotal(prix));
    }
}
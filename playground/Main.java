import java.util.ArrayList;

public class Main {

    public static Action trouverPlusChere(ArrayList<Action> list){
        Action plusChere = list.get(0);
        for(Action a : list){
            if (a.getPrice()>plusChere.getPrice()) {
                plusChere=a;
            }
        }
        return plusChere;
    }
    public static void main(String[] args){
        ArrayList<Action> portfeuille = new ArrayList<>();
        Action a1 = new Action("A1314",11,125.50);
        Action a2 = new Action("A1315",20,253.7);
        Action a3 = new Action("A1316",15,120.36);
        Action a4 = new Action("A1317",12,300.00);

        portfeuille.add(a1);
        portfeuille.add(a2);
        portfeuille.add(a3);
        portfeuille.add(a4);


        double total = 0;
        for(Action a: portfeuille){
            total+=a.ValueActions();
        }
        System.out.println("total du pourtfeuille:"+total);

        Action plusChere = trouverPlusChere(portfeuille);
        System.out.println("l action la plus chere est :"+plusChere.getRef());

        portfeuille.remove(0);
        System.out.println("la taille du tableau est "+portfeuille.size());




    }
}

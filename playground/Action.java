public class Action {
    private String ref;
    private int nbr;
    private double price;

    public Action(String ref,int nbr,double price){
        this.ref=ref;
        this.nbr=nbr;
        this.price=price;
    }

    public String getRef(){return this.ref;}
    public int getNbr(){return this.nbr;}
    public double getPrice(){return this.price;}

    public double ValueActions(){return this.nbr*this.price ;}
}

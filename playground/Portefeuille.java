public class Portefeuille{
public static void main(String[] args){
String[] symboles={"AA1314","AA1515","AA1617"};
double[] prix={112.0,215,120.5};
double total=0;


for(int i=0;i<symboles.length;i++){
if(prix[i]>200){
System.out.println(symboles[i]+" : "+prix[i]+" DH (cher)");
}else{
System.out.println(symboles[i]+" : "+prix[i]+" DH");
}

total+=prix[i];
}

System.out.println("Total : "+total);
}

}
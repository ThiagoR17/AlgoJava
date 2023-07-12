import java.util.Scanner;

//converter metros para KM
// metros para milimetros 
public class Convermid {
    public static void main(String  []args){
        Scanner sc = new Scanner(System.in);
        double KM, milimetros, metros;
        System.out.println("Insira a quantida de metros:");
        metros = sc.nextDouble();
        KM = metros / 1000;
        milimetros = metros * 1000;
        System.out.println("kM:"  + KM);
        System.out.println("Milimetro:" + milimetros);


    
    }

    
}

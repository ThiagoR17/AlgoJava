import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Metodos {
    public static void main(String[] args) {
        ImprimiSelecioanado();
    }

    static void ImprimiSelecioanado(){
        String []  candidatos = {"THIAGO", "FABIANA", "JONAS", "LUCAS", "FABRICIO"};
        for(int indice = 0; indice<candidatos.length; indice++){ 
            System.out.println("O cadidato numero" + (indice+1)+ "é" + candidatos[indice]);

        }

    }

    static void Tentativas(String candidatos){
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu=atender();
            continuarTentando = !atendeu;

            if(continuarTentando)
            tentativas++;
            else
            System.out.println("CONTATO REALIZADO!");

        }while(continuarTentando && tentativas <3 );

        if(atendeu)
        System.out.println("CONSEGUIMOS CONTATO COM :" + candidatos + "NA" + tentativas + "TENTATIVA");

        
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void selecaoCand(){
        String []  candidatos = {"THIAGO", "FABIANA", "JONAS", "LUCAS", "FABRICIO", "VITOR", "LUCIANO", "TARCISIO",  "MESSI", "CRISTIANO"};
        int Candselecionados = 0;
        int Candatual = 0;
        double SalarioP = 2000.0;
        
        while(Candselecionados < 5 && Candatual < candidatos.length){
            String candidato = candidatos[Candatual];
            double SalarioB = valorPretendido();

            System.out.println("O cadidato" + candidato + "Solicitou este valor salario" + SalarioP);

            if(SalarioP >= SalarioB){
                System.out.println("O candidato"+ candidato + "foi selecionado para a vaga");
              Candselecionados++;
            }
            Candatual++;

        }
        
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void verificaCand(double SalarioB){
        double SalarioP = 2000.0;
          if(SalarioP > SalarioB){
            System.out.println("Liga para o candidato");
        }else if(SalarioB == SalarioP){
            System.out.println("BUSCA OUTRO CANDIDATO");
        }else{
            System.out.println("AGUARDANDO BUSCA DE CANDIDATOS");
        }
    

    }
    
}

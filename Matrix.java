import java.util.Random;
/*Fazer uma função que receba uma matriz e calcule a sua resposta e retorne. */
public class Matrix{


     static int [][] geraMatriz(int Z, int M){
        Random gera = new Random();
        int [][] matriz = new int [Z][M]; 
        for (int x = 0; x < matriz.length; x++){
            for(int f = 0; f < matriz[0].length;  f++){
                matriz[x][f] = gera.nextInt(100);
                
            }
        }
        return matriz;
    } 
    static void imprimeMatriz(int [] [] matriz){
        for(int x = 0; x < matriz.length; x++){
            for(int f = 0; f < matriz[0].length; f++){
                System.out.print(matriz[x][f]+ "\t");

            }
            System.out.print("\n");
        }
    }

    static int [][] transposta(int [][] matriz){
        int [][] matrizTransposta = new int[matriz[0].length][matriz.length];
        for (int x = 0; x < matrizTransposta.length; x++){
            for(int f = 0; f < matrizTransposta[0].length; f++){
                matrizTransposta[x][f] = matriz[f][x];

            }
        }
        return matrizTransposta;    
    }
    public static void main(String [] args ){
      int [][] matriz = geraMatriz(3, 4);
      imprimeMatriz(matriz);
      int [][] transposta = transposta(matriz);
      imprimeMatriz(transposta);
    }
}
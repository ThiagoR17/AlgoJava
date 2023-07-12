import java.util.Arrays;
import java.util.Random;

// Exercicio para gerar um array com numeros de menor para o maior//
public class Selection {
    public static void main(String [] args){
        int [] v = gerarVetor(10);
        selectionSort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void selectionSort(int[] v){
        for(int x = 0; x < v.length; x++){
            int menor = x;
            for (int j = x + 1; j < v.length; j++){
                if(v[j]< v[menor])
                  menor = j;
            }
            trocar(v, x, menor);
        }
    }
    private static void trocar (int[] v, int x, int menor){
        int aux = v[x];
        v[x] = v[menor];
        v[menor] = aux;
    }

    public static int[] gerarVetor(int n){
        int []v = new int[n];
        Random gerador = new Random();
        for(int x = 0; x < n; x++){
            v[x] = gerador.nextInt(20);

        }
        return v;

    }
    
}

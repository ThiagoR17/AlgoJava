import java.util.Scanner;

// Tipos de triangulo//

public class Tipostriangulo {
    public static void main(String[] args) {
        double a, b, c;
        double aux, a2, bc;
        Scanner rc = new Scanner(System.in);

        System.out.println("Digite o valor de a ");
        a = rc.nextDouble();

        System.out.println("Digite o valor de b ");
        b = rc.nextDouble();

        System.out.println("Digite o valor de c ");
        c = rc.nextDouble();

        if (b > a) {
            aux = a;
            a = b;
            b = aux;
        }
        if (c > a) {
            aux = a;
            a = c;
            c = aux;
        }
        a2 = Math.pow(a, 2);
        bc = Math.pow(a, 2) + Math.pow(c, 2);

        if (a >= b + c) {
            System.out.println("Não forma um triângulo");
        } else {
            if (a2 > bc) {
                System.out.println("Triângulo obtusângulo");
            } else if (a2 < bc) {
                System.out.println("Triângulo acutângulo");
            } else {
                System.out.println("Triângulo retângulo");
            }
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo isósceles");
            }
        }
    }
}

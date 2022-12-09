import java.util.Scanner;

public class list5_q3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro argumento:");
        double argumento1 = teclado.nextDouble();
        System.out.println("Digite o segundo argumento");
        double argumento2 = teclado.nextDouble();
        System.out.println("Digite o terceiro argumento");
        double argumento3 = teclado.nextDouble();
        teclado.close();
        double resultadoSoma = somar(argumento1, argumento2, argumento3);
        System.out.println(resultadoSoma);

    }

    public static double somar(double argumento1, double argumento2, double argumento3) {
        return (argumento1 + argumento2 + argumento3);
    }
}
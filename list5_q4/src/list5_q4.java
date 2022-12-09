import java.util.Scanner;

public class list5_q4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um argumento: ");
        double a = teclado.nextDouble();
        System.out.println(P_ou_N(a));
        teclado.close();

    }

    public static String P_ou_N(double a) {
        String b;
        if (a <= 0) {
            b = "N";
        } else {
            b = "P";
        }
        return b;

    }

}
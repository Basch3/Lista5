import java.util.Scanner;

public class list5_q9 {

    public static int reverse(int num) {
        String numero = "" + num;
        String oremun = "";
        for (int a = numero.length() - 1; a >= 0; a--) {
            oremun += numero.charAt(a);

        }
        return Integer.parseInt(oremun);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Digite um número:");
        int num = teclado.nextInt();
        System.out.println(" O número digitado ao contrário é: " + reverse(num));
        teclado.close();

    }

}
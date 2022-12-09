import java.util.Scanner;

public class list5_q8 {
    int numDigitado;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numDigitado = teclado.nextInt();
        teclado.close();
        System.out.println(" O número que você digitou tem " + tantosnumeros(numDigitado) + " digitos ");

    }
    public static int tantosnumeros(int a) {
        String digito = Integer.toString(a);
        return digito.length();
}
}
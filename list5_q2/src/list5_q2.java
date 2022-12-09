import java.util.Scanner;

public class list5_q2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        imprimirLinhas(n);

        sc.close();
    }

    public static void imprimirLinhas(int n) {
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
                System.out.print(j + "  "); 
           }
           System.out.println(" ");
        }
    }
}
import java.util.Scanner;
import java.util.Random;

public class list5_q10 {

    public static int jogodeCraps(int numeroDado) {
        Random sorteio = new Random();
        int primeiroDado = 0;
        int segundoDado = 0;
        primeiroDado = sorteio.nextInt(6) + 1;
        segundoDado = sorteio.nextInt(6) + 1;
        return primeiroDado + segundoDado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDados = 2;
        int numDigitado = 0;
        int ponto = 0;
        boolean teste = true;

        do {
            System.out.println("[9] para jogar os dados na mesa");
            System.out.println("[0] para sair da mesa de jogo");
            numDigitado = sc.nextInt();
            totalDados = jogodeCraps(numDigitado);

            if (numDigitado < 0 || numDigitado > 9) {
                System.out.println("Essa opção não é válida !!!");
            } else if (numDigitado == 9) {
                System.out.println(" A soma dos números dos dados é: " + totalDados);
                if (totalDados == 7 || totalDados == 11) {
                    System.out.println(" PARABÉNS, você é um vencedor");
                } else if (totalDados == 2 || totalDados == 3 || totalDados == 12) {
                    System.out.println(" Que tristeza, você é um grande perdedor /:");
                } else if (totalDados == 4 || totalDados == 5 || totalDados == 6 || totalDados == 8
                        || totalDados == 9 || totalDados == 10) {
                    if (teste) {
                        teste = false;
                        ponto = totalDados;
                    } else if (ponto == totalDados) {
                        System.out.println(" VITORIOSO !!!!");
                    }
                }
            }
        } while (numDigitado != 0);
        System.out.println(" Final de jogo, volte logo ao cassino Martins !");
        sc.close();

    }

}
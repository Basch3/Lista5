import java.util.Scanner;

public class list5_q5 {
        public static void main(String[] args) {
            double custo;
            double taxaImposto;
            double somaImposto;
    
            Scanner teclado = new Scanner(System.in);
            System.out.println("Qual é o valor do produto ?");
            custo = teclado.nextDouble();
            System.out.println(" Qual a porcentagem do imposto sobre o produto ?");
            taxaImposto = teclado.nextDouble();
            teclado.close();
            somaImposto = somaImposto(taxaImposto, custo);
            System.out.println(" O preço do produto com o imposto é R$: " + somaImposto);
    
        }
    
        public static double somaImposto(double taxaImposto, double custo) {
            double porcentagem = taxaImposto / 100;
            return custo + (custo * porcentagem);
        }
    }
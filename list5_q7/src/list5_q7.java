import java.util.Scanner;

public class list5_q7 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double valorPrestacao;
        boolean option = true;
        double total = 0;
        int count = 0;
        while (option==true) {
            System.out.println("Digite o valor da prestação: ");
            valorPrestacao = teclado.nextDouble();
            if (valorPrestacao!=0) {
                System.out.println("Digite o número de dias em atraso: ");
                int dias = teclado.nextInt();
                System.out.println("Valor a pagar: "+valorPagamento(valorPrestacao, dias));
                total += valorPagamento(valorPrestacao, dias);
                count++;
            } else {
                System.out.println("Quantidade de prestações: "+count+"\nValor Total de prestações pagas no dia: "+total);
                option = false;
            }
        }
    }

    public static double valorPagamento(double valor, int dias) {
        double valorPagar;
        if(dias==0){
            valorPagar = valor;
        }else{
            valorPagar = valor+((valor * 0.03)+(0.001 * dias));
        }
        return valorPagar;
    
    }

}
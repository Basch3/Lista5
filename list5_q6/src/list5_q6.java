import java.util.Scanner;

public class list5_q6 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int option;
        do {
            System.out.println("Digite as horas: ");
            int horas = teclado.nextInt();
            System.out.println("Digite os minutos: ");
            int mins = teclado.nextInt();
            conversor(horas, mins);
            System.out.println("Deseja continuar?\n1 - Sim\n2 - Não");
            option = teclado.nextInt();
        } while (option!=2);
        teclado.close();
    }

    public static void conversor(int horas, int mins) {
        if(horas>12){
            horas -= 12;
            imprimir(horas, mins, "P.M");
        }else{
            imprimir(horas, mins, "A.M");
        }
    }
    public static void imprimir(int horas, int mins, String fuso) {
        System.out.println(horas+":"+mins+" "+fuso);
    }
}
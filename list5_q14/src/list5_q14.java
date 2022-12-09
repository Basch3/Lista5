public class list5_q14 {
    public static void main(String[] args) throws Exception {
        quadradoMagico();
    }

    public static void quadradoMagico() {
        int n = 3;
        int[][] quadrado = new int[n][n];

        int i = n / 2;
        int j = n - 1;

        for (int num = 1; num <= n * n;) {
            if (i == -1 && j == n) 
            {
                j = n - 2;
                i = 0;
            }
            else {
                if (j == n)
                    j = 0;

                if (i < 0)
                    i = n - 1;
            }
 
            if (quadrado[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            }
            else
                quadrado[i][j] = num++;

            j++;
            i--;
        }

        System.out.println("A Soma de todas as Linhas, Colunas e Diagonais é: "
                           + n * (n * n + 1) / 2 + ":");
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++)
                    System.out.print(quadrado[i][j] + " ");
                    System.out.println();
        }
    }
}
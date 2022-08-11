
import java.util.Scanner;
public class pergunta3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número correspondente ao mês: ");
        int mes = sc.nextInt();
        int n = 31;
        int k = 0;
        double menor = 1000000000;
        double maior = 0;
        double soma = 0;
        double mediamensal;

        int faturamentosuperior = 0;

        if(mes>12 || mes<1)
            System.out.println("Mes invalido");
        else
            switch( mes )
            {
                case 2:
                    n -=2;

                case 4: case 6: case 9: case 11:
                    n--;

            }
        double[] vetor = new double[n];
        int i;
        for (i=0; i<n; i++) {
            System.out.println("Informe o faturamento do " +(i+1) + "º " + "dia do mês " + mes + ":");
            vetor[i] = sc.nextDouble();
            if (vetor[i] == 0)
                k++;
            if(vetor[i] < menor)
                menor = vetor[i];
            if (vetor[i] > maior)
                maior = vetor[i];
            soma+= vetor[i];
        }
           mediamensal = soma/(n-k);

        for (i=0; i<n; i++) {
            if (vetor[i] > mediamensal)
               faturamentosuperior += 1 ;
        }
            System.out.println("O maior valor é: " + maior);
            System.out.println("O menor valor é: " + menor );
            System.out.println("O número de dias em que o valor de faturamento diário foi superior à média mensal é: " + faturamentosuperior );

    }
}

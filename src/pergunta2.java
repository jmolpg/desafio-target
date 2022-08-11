import java.util.Scanner;
import java.util.*;

/* Fibonacci */
public class pergunta2 {
    public static void main(String[] args) {
        int k = 0;
        while (k == 0) {
            int numero;
            int i = 0;
            int n1 = 0;
            int n2 = 1;
            int n3;
            System.out.println("Digite o número:\n");
            Scanner S = new Scanner(System.in);
            numero = S.nextInt();
            List<Integer> array = new ArrayList<Integer>(numero + 2);
            System.out.println(n1);
            System.out.println(n2);
            while (i < numero) {
                n3 = n1 + n2;
                array.add(n3);
                System.out.println(n3);
                n1 = n2;
                n2 = n3;
                i++;
            }

            boolean contem = array.contains(numero);

            if (contem)
                System.out.println("o número digitado está contido na sequência de Fibonacci");
            else
                System.out.println("o número digitado não está contido na sequência de Fibonacci");

        }
    }

}

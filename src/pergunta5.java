import java.util.Arrays;
import java.util.Scanner;
public class pergunta5 {
    public static void main(String[] args) {
        int j;
        Scanner b = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = b.nextLine();
        char[] charArray = palavra.toCharArray();
        String temporaria = "";
        int tamanho = charArray.length - 1;
        for (int i = tamanho; i >= 0; i--) {
            temporaria += charArray[i];
        }
        System.out.println(temporaria);
    }



    }


import java.util.Scanner;
public class a {

    /*01) Sejam informadas 5 notas no vetor "notas". Posteriormente acesse o mesmo vetor e 
    calcule a média aritmédia entre as notas. Mostre a média ao final. */

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);

        float[] notas = new float[5];

        for(int i=0; i<5; i++){
        System.out.println("Insira uma nota: \n");
        notas[i] = scanner.nextFloat();
        }

        float soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }   

        float media = soma/5;
        
        System.out.printf("A média das notas é: %.2f%n", media);
        
        scanner.close();
    }
}

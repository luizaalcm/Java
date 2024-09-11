import java.util.Scanner;

public class GlobalVariableExample{
    
    private static int globalCounter = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int choice; 
        do{
            System.out.println("Menu: ");
            System.out.println("1.Incrementar Contador");
            System.out.println("2.Decrementar Contador");
            System.out.println("3.Mostrar valor do Contador");
            System.out.println("4.Resetar Contador");
            System.out.println("5.Sair");

            System.out.println("Escolha uma opção: ");
            choice = scan.nextInt();

            switch (choice) {
            case 1:
                incrementCounter();
                break;
            case 2:
                decrementCounter();
                break;
            case 3:
                showCounter();
                break;
            case 4:
                resetCounter();
                break;
            case 5:
                System.out.println("Sair.");
                break;
            default:
            System.out.println("Opção inválida, tente novamente.");
                break;
            }

        }while (choice != 5);


    }

    private static void incrementCounter() {
        globalCounter++;
        System.out.println("Contador Incrementado!");
    }

    private static void decrementCounter() {
        globalCounter--;
        System.out.println("Contador Decrementado!");
    }

    private static void showCounter() {
        System.out.println("Contador Global = " + globalCounter);
    }
    
    private static void resetCounter() {
        System.out.println("Contador Resetado");
        globalCounter = 0;
    }



}

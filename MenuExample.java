import java.util.Scanner;

public class MenuExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: (1...5) ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                     addiction(scanner);
                    break;
                case 2:
                     subtraction(scanner);
                    break;
                case 3:
                     multiplication(scanner);
                    break;
                case 4:
                    division(scanner);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (choice != 5);
        
        scanner.close();
    }

    private static void addiction(Scanner scanner) {
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int num2= scanner.nextInt();
        int result = num1 + num2;
        System.out.println("Resultado da adição:" + result);
    }

    private static void subtraction(Scanner scanner) {
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int num2= scanner.nextInt();
        int result = num1 - num2;
        System.out.println("Resultado da subtração:" + result);
    }

    private static void multiplication(Scanner scanner) {
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int num2= scanner.nextInt();
        int result = num1 * num2;
        System.out.println("Resultado da multiplicação:" + result);
    }

    private static void division(Scanner scanner) {
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número");
        double num2= scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Não é possível dividir por 0.");
        } else {
        double result = num1 / num2;
        System.out.println("Resultado da divisão:" + result);
        }
    }


}


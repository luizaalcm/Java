import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private static List<String> livros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar um livro");
            System.out.println("2. Remover um livro");
            System.out.println("3. Listar todos os livros");
            System.out.println("4. Buscar livro por título");
            System.out.println("5. Sair");

            System.out.println("Escolha uma opção:");
            choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    addBook(scan); 
                    break;
                case 2:
                    removeBook(scan); 
                    break;
                case 3:
                    listBooks(); 
                    break;
                case 4:
                    searchBook(scan); 
                    break;
                case 5:
                    System.out.println("Sair.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (choice != 5);

        scan.close(); 
    }

    private static void addBook(Scanner scan) {
        System.out.println("Digite o nome do livro:");
        String livro = scan.nextLine(); 
        livros.add(livro); 
        System.out.println("\nLivro adicionado com sucesso!\n");
    }

    private static void removeBook(Scanner scan) {
        System.out.println("Digite o nome do livro para removê-lo:");
        String livro = scan.nextLine(); 
        if (livros.remove(livro)) { 
            System.out.println("\nLivro removido com sucesso!\n");
        } else {
            System.out.println("\nLivro não encontrado!\n");
        }
    }

    private static void listBooks() {
        if(livros.isEmpty()){
            System.out.println("\nLista Vazia!\n");
        } else{
            System.out.println("\nLista de livros:\n");
            for(String livro : livros){
                System.out.println("- " + livro);
            }
            System.out.println();
        }
    }

    private static void searchBook(Scanner scan) {
        System.out.println("Digite o nome do livro para buscá-lo:");
        String titulo = scan.nextLine(); 
        if (livros.contains(titulo)) {
            System.out.println("O livro " + titulo + " está cadastrado.");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueSimples {
    static ArrayList<String> produtos = new ArrayList<>();
    static ArrayList<Integer> quantidades = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch(opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    exibirEstoque();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while(opcao != 3);
    }

    static void exibirMenu() {
        System.out.println("\nControle de Estoque");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Exibir Estoque");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    static void adicionarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        produtos.add(nome);
        quantidades.add(quantidade);
        System.out.println("Produto adicionado com sucesso!");
    }

    static void exibirEstoque() {
        System.out.println("\nEstoque Atual:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i) + ": " + quantidades.get(i));
        }
    }
}

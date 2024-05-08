import java.util.Scanner;

public class App {
    
    // Preços dos produtos
    private static final double PRECO_CELULAR = 1500.0;
    private static final double PRECO_NOTEBOOK = 3500.0;
    private static final double PRECO_TECLADO = 200.0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0.0;
        int produtosEscolhidos = 0;
        
        System.out.println("Bem-vindo à Loja Online!");
        System.out.println("Escolha os produtos desejados:");
        System.out.println("1 - Celular (R$1500.00)");
        System.out.println("2 - Notebook (R$3500.00)");
        System.out.println("3 - Teclado (R$200.00)");
        System.out.println("Pressione 'S' para finalizar a compra.");
        
        while (true) {
            System.out.print("Escolha um produto (ou 'S' para sair): ");
            String escolha = scanner.nextLine();
            
            if (escolha.equalsIgnoreCase("S")) {
                break;
            }
            
            int opcao;
            try {
                opcao = Integer.parseInt(escolha);
                if (opcao < 1 || opcao > 3) {
                    System.out.println("Opção inválida!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida!");
                continue;
            }
            
            double preco = 0.0;
            switch (opcao) {
                case 1:
                    preco = PRECO_CELULAR;
                    break;
                case 2:
                    preco = PRECO_NOTEBOOK;
                    break;
                case 3:
                    preco = PRECO_TECLADO;
                    break;
            }
            totalCompra += preco;
            produtosEscolhidos++;
            System.out.println("Produto adicionado ao carrinho. Total atual: R$" + totalCompra);
        }
        
        if (produtosEscolhidos == 3) {
            totalCompra *= 0.8; // Aplicar desconto de 20% se os três produtos forem escolhidos
        }
        
        System.out.println("O total da compra é: R$" + totalCompra);
        System.out.println("Obrigado por comprar conosco!");
    }
}
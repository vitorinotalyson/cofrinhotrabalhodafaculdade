import cofrinho.Cofrinho;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while(true){
            System.out.println();
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar valor a uma moeda");
            System.out.println("2. Remover valor de uma moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total convertido para Reais");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Escolha a moeda para adicionar valor:");
                    System.out.println("1. Dólar");
                    System.out.println("2. Euro");
                    System.out.println("3. Real");
                    System.out.print("Escolha uma opção: ");
                    int escolhaMoeda = sc.nextInt();
                    System.out.print("Digite o valor a ser adicionado: ");
                    double valorAdicionar = sc.nextDouble();
                    switch (escolhaMoeda){
                        case 1:
                            cofrinho.adicionarValor("Dolar",valorAdicionar);
                            break;
                        case 2:
                            cofrinho.adicionarValor("Euro",valorAdicionar);
                            break;
                        case 3:
                            cofrinho.adicionarValor("Real",valorAdicionar);
                            break;
                        default:
                            System.out.println("Opção invalida.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Escolha a moeda para remover valor:");
                    System.out.println("1. Dólar");
                    System.out.println("2. Euro");
                    System.out.println("3. Real");
                    System.out.print("Escolha uma opção: ");
                    int escolhaMoedaRemover = sc.nextInt();
                    System.out.print("Digite o valor a ser removido: ");
                    double valorRemover = sc.nextDouble();
                    switch (escolhaMoedaRemover){
                        case 1:
                            cofrinho.removerValor("Dolar",valorRemover);
                            break;
                        case 2:
                            cofrinho.removerValor("Euro",valorRemover);
                            break;
                        case 3:
                            cofrinho.removerValor("Real",valorRemover);
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 3:
                    cofrinho.listagemMoedas();
                    System.out.println();
                    break;
                case 4:
                    System.out.printf("Total convertido para Reais: R$ %.2f",
                            cofrinho.totalConvertido());
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
                    

            }
            
        }

    }
}

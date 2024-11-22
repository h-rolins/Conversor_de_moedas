package principal;

import API.acessando_valor;
import com.google.gson.JsonObject;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String op = "";
        double valorReal;

        // Obter taxas de câmbio da API
        JsonObject taxasDeCambio = acessando_valor.obterTaxasDeCambio();
        if (taxasDeCambio == null) {
            System.err.println("Erro ao carregar as taxas de câmbio. Encerrando o programa.");
            return;
        }

        while (!op.equals("7")) {
            System.out.println("\n----------------CÂMBIO-----------------");

            System.out.print("Informe o valor em real que deseja converter: ");
            valorReal = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Informe para qual moeda deseja converter:");
            System.out.println("1 - Dólar Americano (USD)");
            System.out.println("2 - Dólar Canadense (CAD)");
            System.out.println("3 - Peso Argentino (ARS)");
            System.out.println("4 - Bolívar soberano (VES)");
            System.out.println("5 - Renminbi (CNY)");
            System.out.println("6 - Peso colombiano (COP)");
            System.out.println("7 - Sair");

            System.out.print("Escolha uma opção: ");
            op = scanner.nextLine();

            System.out.println("\n---------------------------------------");

            switch (op) {
                case "1":
                    double taxaUSD = taxasDeCambio.get("USD").getAsDouble();
                    System.out.printf("R$%.2f equivale a $%.2f (Dólar Americano)\n", valorReal, valorReal * taxaUSD);
                    break;
                case "2":
                    double taxaCAD = taxasDeCambio.get("CAD").getAsDouble();
                    System.out.printf("R$%.2f equivale a $%.2f (Dólar Canadense)\n", valorReal, valorReal * taxaCAD);
                    break;
                case "3":
                    double taxaARS = taxasDeCambio.get("ARS").getAsDouble();
                    System.out.printf("R$%.2f equivale a $%.2f (Peso Argentino)\n", valorReal, valorReal * taxaARS);
                    break;
                case "4":
                    double taxaVES = taxasDeCambio.get("VES").getAsDouble();
                    System.out.printf("R$%.2f equivale a Bs%.2f (Bolívar Soberano)\n", valorReal, valorReal * taxaVES);
                    break;
                case "5":
                    double taxaCNY = taxasDeCambio.get("CNY").getAsDouble();
                    System.out.printf("R$%.2f equivale a ¥%.2f (Renminbi)\n", valorReal, valorReal * taxaCNY);
                    break;
                case "6":
                    double taxaCOP = taxasDeCambio.get("COP").getAsDouble();
                    System.out.printf("R$%.2f equivale a COP%.2f (Peso Colombiano)\n", valorReal, valorReal * taxaCOP);
                    break;
                case "7":
                    System.out.println("Encerrando o programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}

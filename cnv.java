import java.util.Scanner;


public class cnv {
    public static void main(String[] args) {
        Scanner condicao = new Scanner(System.in);
        String op = "";
        double valorReal;

        while (!op.equals("7")) {
            System.out.println("\n----------------CÂMBIO-----------------");
            System.out.println("Informe o valor em real que deseja converter:");
            valorReal = condicao.nextDouble();
            condicao.nextLine();

            System.out.println("Informe para qual moeda deseja converter:");
            System.out.println("1 - Dólar Americano");
            System.out.println("2 - Dólar Canadense");
            System.out.println("3 - Peso Argentino - Argentina");
            System.out.println("4 - Bolívar soberano - Bolívia");
            System.out.println("5 - Renminbi - China");
            System.out.println("6 - Peso colombiano - Colômbia");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            op = condicao.nextLine();

            switch (op) {
                case "1":
                    System.out.println("Você escolheu converter para Dólar Americano.");
                    // Adicione aqui a lógica para conversão
                    break;
                case "2":
                    System.out.println("Você escolheu converter para Dólar Canadense.");
                    // Adicione aqui a lógica para conversão
                    break;
                case "3":
                    System.out.println("Você escolheu converter para Peso Argentino.");
                    // Adicione aqui a lógica para conversão
                    break;
                case "4":
                    System.out.println("Você escolheu converter para Bolívar soberano.");
                    // Adicione aqui a lógica para conversão
                    break;
                case "5":
                    System.out.println("Você escolheu converter para Renminbi.");
                    // Adicione aqui a lógica para conversão
                    break;
                case "6":
                    System.out.println("Você escolheu converter para Peso colombiano.");
                    // Adicione aqui a lógica para conversão
                    break;
                case "7":
                    System.out.println("Encerrando o programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }

        condicao.close();
    }
}

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CadastraServico {

    public static void main(String[] args) {
        List<Servico> servicos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("Código: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Descrição: ");
                String descricao = scanner.nextLine();

                System.out.print("Preço da hora: ");
                double precoHora = scanner.nextDouble();

                System.out.print("Quantidade de horas: ");
                int qtdeHora = scanner.nextInt();
                scanner.nextLine();

                Servico servico = new Servico(
                    codigo,
                    descricao,
                    precoHora,
                    qtdeHora
                );
                servicos.add(servico);

                System.out.print("Deseja adicionar mais um serviço? (s/n): ");
                String resposta = scanner.nextLine();
                if (!resposta.equalsIgnoreCase("s")) {
                    continuar = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine();
            }
        }

        double total = 0;
        System.out.println(
            "Código Descrição Valor da hora Qtde Hora Valor do serviço"
        );
        for (Servico servico : servicos) {
            System.out.println(servico);
            total += servico.calcularValor();
        }
        System.out.println("Total " + String.format("%.2f", total));
    }
}

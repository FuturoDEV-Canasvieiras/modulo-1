import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite uma opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você Escolheu Domingo.");
                break;
            case 2:
                System.out.println("Opção 2.");
                break;
            case 3:
                System.out.println("Opção 3.");
                break;
            default:
                System.out.println("Opção informada inválida. Informe um valor correto, conforme opções.");
        }
    }
}
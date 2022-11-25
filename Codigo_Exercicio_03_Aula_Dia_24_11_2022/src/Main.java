import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaração das Variáveis do programa
        String nome;
        int idade;

        // Instância do objeto Scanner, para poder receber o que o usuário digitar
        Scanner teclado = new Scanner(System.in);

        // Impressão de texto no terminal
        System.out.printf("Digite o nome do aluno: ");
        nome = teclado.next(); // Salvando na variável nome, o texto que o usuário irá digitar

        // Impressão de texto no terminal
        System.out.printf("Digite a idade do aluno: ");
        idade = teclado.nextInt(); // Salvando na variável idade, o número inteiro que o usuário irá digitar

        // Estrutura condicional para direcionar a sala do aluno
        if (idade == 7) {
            System.out.println("O aluno " + nome + " foi direcionado para a turma 1. Para maiores de 7 anos.");
        } else if (idade == 8) {
            System.out.println("O aluno " + nome + " foi direcionado para a turma 2. Para maiores de 8 anos.");
        } else if (idade == 9) {
            System.out.println("O aluno " + nome + " foi direcionado para a turma 3. Para maiores de 9 anos.");
        } else if (idade == 10) {
            System.out.println("O aluno " + nome + " foi direcionado para a turma 4. Para maiores de 10 anos.");
        } else if (idade == 11) {
            System.out.println("O aluno " + nome + " foi direcionado para a turma 5. Para maiores de 11 anos.");
        } else if (idade == 12) {
            System.out.println("O aluno " + nome + " foi direcionado para a turma 6. Para maiores de 12 anos.");
        } else if (idade == 13) {
            System.out.println("O aluno " + nome + "foi direcionado para a turma 7. Para maiores de 13 anos.");
        } else if (idade == 14) {
            System.out.println("O aluno " + nome + "foi direcionado para a turma 8. Para maiores de 14 anos.");
        } else {
            System.out.println("Idade inválida!");
        }
    }
}
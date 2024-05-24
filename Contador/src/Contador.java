import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Substitua ?? por nextInt()

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Substitua ?? por nextInt()

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem = parametroDois - parametroUm;
        System.out.println(contagem);
        // Validação e lógica de contagem serão implementadas aqui
    }
}

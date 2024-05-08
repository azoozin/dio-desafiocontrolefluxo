import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro:");
        int parametroUm = Integer.parseInt(terminal.nextLine());
        System.out.println("Digite o segundo parametro:");
        int parametroDois = Integer.parseInt(terminal.nextLine());

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro.");
            e.printStackTrace();
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException(
                    "Primeiro parametro maior que o segundo. " + "Valor parametroUm: " + parametroUm
                            + " Valor parametroDois: " + parametroDois);
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}

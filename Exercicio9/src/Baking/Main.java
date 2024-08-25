package Baking;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DataBaking cliente;
        System.out.println("Vamos criar sua conta!");

        System.out.println("Informe o numero da conta.");
        int conta = scanner.nextInt();

        System.out.println("Informe o Nome do Cliente. ");
        scanner.nextLine();
        String nomeCLiente = scanner.nextLine();

        System.out.println("Deseja fazer um deposito inicial: s/n ");
        String response = scanner.next();

        if (response.equals("s")) {
            System.out.println("Informe o Deposito inicial.");
            double inicialDeposito = scanner.nextDouble();
            cliente = new DataBaking(conta, nomeCLiente, inicialDeposito);
        } else {
            cliente = new DataBaking(conta, nomeCLiente);
        }
        double saldo;
        int operantion;
        int i = 0;

        while (i < 2) {
            System.out.println("Bem vindo informe a operação que deseja fazer: ");
            System.out.println("1= Add Saldo.");
            System.out.println(" ");
            System.out.println("2= Diminuir Saldo.");
            System.out.println(" ");
            System.out.println("3= Alterar nome de cliente ");
            System.out.println(" ");
            System.out.println("4= Finalizar serviço. ");
            operantion = scanner.nextInt();
            if (operantion == 1) {
                System.out.println("Informe o valor a ser add: ");
                saldo = scanner.nextDouble();
                System.out.println("Saldo atual é: R$ " + cliente.addSaldo(saldo));

            } else if (operantion == 2) {
                System.out.println("Informe o valor a ser removido: ");
                saldo = scanner.nextDouble();
                System.out.println("Saldo atual é: R$ " + cliente.removeSaldo(saldo));
            } else if (operantion == 3) {
                System.out.println("Informe o novo nome: ");
                scanner.nextLine();
                String nome = scanner.nextLine();
                cliente.setNameClient(nome);
                System.out.println("Nome alterado para: " + cliente.getNameClient());
            } else if (operantion == 4) {
                System.out.println("Até mais!");
                System.out.println(cliente.toString());
                scanner.close();
                i = 3;

            }

        }
    }
}

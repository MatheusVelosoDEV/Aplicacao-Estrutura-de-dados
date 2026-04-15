package AplicacaoBanco;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");

        double limite = sc.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while(sair != 0){
            System.out.println("Digite a descrição da compra: ");
            String descricao = sc.next();

            System.out.println("Digite o valor da compra: ");
            double valor = sc.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean aprovada = cartao.lancaCompra(compra);

            if(aprovada){
                System.out.println("Compra realizada!");
                System.out.println("Deseja 0 para sair ou 1 para continuar");
                sair = sc.nextInt();
            } else {
                System.out.println("Saldo insuficiente! Encerrando...");
                break;
            }
        }

        Collections.sort(cartao.getCompras()); //ordena a lista pelo toString

        System.out.println("\nCompras realizadas: ");
        for(Compra c : cartao.getCompras()){
            System.out.println(c); // chama o metodo toString
        }

    }
}

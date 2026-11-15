package principal;

import model.Conta;
import model.Data;

public class Principal {

    public static void main(String[] args) {

        Data data = new Data(15, 11, 2026);

        Conta conta = new Conta(
                "Icaro Jose",
                12345,
                "001",
                1000.0,
                data
        );

        conta.depositar(500);

        conta.sacar(200);

        System.out.println(conta.recuperaDadosParaImpressao());

        System.out.println("Rendimento: R$ " + conta.calcularRendimento());
        

    }
}
package Default;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Felipe Mevel");

        IConta cc = new ContaCorrente(cliente);
        IConta poup = new ContaPoupanca(cliente);

        cc.depositar(150);
        cc.transferir(100, poup);

        cc.imprimirExtrato();
        poup.imprimirExtrato();
    }
}

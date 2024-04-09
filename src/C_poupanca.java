public class C_poupanca extends Conta{
    public C_poupanca(Double saldo,Agencia agencia, Cliente cliente){
        super(saldo, agencia, cliente);
    }

    @Override public void tipo(){
        System.out.println("Tipo de conta: Poupança");
    }
}
public class C_corrente extends Conta {
    public C_corrente(Double saldo,Agencia agencia, Cliente cliente){
        super(saldo, agencia, cliente);
    }

    @Override public void tipo(){
        System.out.println("Tipo de conta: Corrrente");
    }
}
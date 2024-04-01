public class Conta {
    private Double saldo;
    Cliente cliente;
    Agencia agencia;

    //Get and Set
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    Conta(Double saldo){
        this.saldo=saldo;
    }
    //Construtor
    Conta(){

    }

    //Metodos
    void sacar(Double valor){
        if(this.saldo<valor){
            System.out.println("Você sacau um valor maior que seu Salda\nVocê está em debito!!!");
        }
        this.saldo=this.saldo-valor;
    }

    void recarga(){
        this.saldo=this.saldo-20.0;
    }

    void recarga(Double valor){
        this.saldo=this.saldo-valor;
    }

    void deposito(Double valor){
        this.saldo=this.saldo+valor;
    }

    void consultar(){
        System.out.println("___________________________");
        System.out.println("--------- Consulta --------");
        System.out.println("Agência:"+agencia.getCodigo()+"\nCliente"+cliente.getNome()+"\nSaldo: R$"+this.saldo+"0");
    }
}
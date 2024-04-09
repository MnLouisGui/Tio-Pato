public class Conta {
    private Double saldo;
    private Cliente cliente;
    private Agencia agencia;

    static int contador;
    int codigo;

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

    Conta(){

    }

    public Conta(Double saldo, Agencia agencia, Cliente cliente){
        this.saldo=saldo;
        this.agencia=agencia;
        this.cliente=cliente;
        contador++;  
        this.codigo=this.codigo+contador; 
    }

    //Metodos
    public void tipo(){

    }

    void sacar(Double valor){
        if(this.saldo<valor){
            System.out.println("Você sacau um valor maior que seu Saldo\nVocê está em debito!!!");
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

    void consultar(Conta poupança, Cliente cli){
        System.out.println("___________________________");
        System.out.println("--------- Consulta --------");
        System.out.println("Numero: "+this.codigo+"\nAgência:"+agencia.getCodigo()+"\nCliente: "+this.cliente.getNome()+"\nCpf: "+cli.getCad_unico());
        this.tipo();
        System.out.println("Saldo: R$"+this.saldo+"0"+"\nSaldo na poupança: "+poupança.saldo+"0");
    }
    void transferir(Conta destino, Double valor){
        this.tipo();
        destino.saldo=destino.saldo+valor;
        this.saldo=this.saldo-valor;
    }
}
public class Conta {
    private Double saldo;
    private Cliente cliente;
    private Agencia agencia;

    static int contador;
    int codigo;

    // Códigos ANSI para cores
    public static final String ANSI_RESET = "\u001B[0m";   // Reseta a cor
    public static final String ANSI_GREEN = "\u001B[32m";  // Verde
    public static final String ANSI_RED = "\u001B[31m";    // Vermelho

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

    public Conta(Double saldo, Agencia agencia, Cliente cliente){
        this.saldo=saldo;
        this.agencia=agencia;
        this.cliente=cliente;  
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
        cliente.adicionarTransacao(ANSI_RED+"Saque", valor);
    }

    void recarga(){
        this.saldo=this.saldo-20.0;
        cliente.adicionarTransacao(ANSI_RED+"Recarga", 20.0);
    }

    void recarga(Double valor){
        this.saldo=this.saldo-valor;
        cliente.adicionarTransacao(ANSI_RED+"Recarga", valor);
    }

    void deposito(Double valor){
        this.saldo=this.saldo+valor;
        cliente.adicionarTransacao(ANSI_GREEN+"Depósito", valor); 
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
        // Determinar o tipo da conta destino
        String tipoContaDestino = (destino instanceof C_corrente) ? ANSI_GREEN+"Conta Corrente" : ANSI_RED+"Conta Poupança";

        // Adicionar a transação ao extrato
        this.cliente.adicionarTransacao("Transferência para " + tipoContaDestino, valor);
    }
}
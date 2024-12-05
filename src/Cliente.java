import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cad_unico;
    private String senha;
    private ArrayList<Transacao> extrato;
    static int contador;
    int verificador;
    int codigo;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCad_unico() {
        return this.cad_unico;
    }
    public String setCad_unico(String cad_unico) {
        return this.cad_unico = cad_unico;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente(String nome){
        this.nome=nome;
        this.codigo = ++contador;
        this.extrato = new ArrayList<>();
    }

        // Método para validar senha
    public boolean validarSenha(String senhaInformada) {
        return this.senha.equals(senhaInformada);
    }
    
    
    public boolean validarCpf(String cpfInformada) {
        return this.cad_unico.equals(cpfInformada);
    }

    public void adicionarTransacao(String tipo, double valor) {
        Transacao transacao = new Transacao(tipo, valor);
        extrato.add(transacao);
    }

    public void imprimirExtrato() {
        System.out.println("--------- Extrato de Transações ---------");
        if (extrato.isEmpty()) {
            System.out.println("Nenhuma transação realizada.");
        } else {
            for (Transacao transacao : extrato) {
                System.out.println(transacao);
            }
        }
        System.out.println("-----------------------------------------");
    }
}

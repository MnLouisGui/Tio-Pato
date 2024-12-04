public class Cliente {
    private String nome;
    private String cad_unico;
    private String senha;
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

    Cliente(String nome){
        this.nome=nome;
        contador++;  
        this.codigo=this.codigo+contador; 
    }

        // Método para validar senha
    public boolean validarSenha(String senhaInformada) {
        return this.senha.equals(senhaInformada);
    }
    
    
    public boolean validarCpf(String cpfInformada) {
        return this.cad_unico.equals(cpfInformada);
    }
}

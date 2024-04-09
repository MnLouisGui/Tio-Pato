public class Cliente {
    private String nome;
    private String cad_unico;
    static int contador;
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

    Cliente(String nome){
        this.nome=nome;
        contador++;  
        this.codigo=this.codigo+contador; 
    }

}

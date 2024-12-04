public class Cliente_p_fisica extends Cliente{
    private String cpf;

    public void setCpf(String cpf) {
       this.cpf=cpf;
    }

    public String getCad_unico(){
        return super.setCad_unico(this.cpf);
    }
    
    public Cliente_p_fisica(String nome){
        super(nome);
    }

    @Override
    public boolean validarCpf(String cpfInformada) {
        return this.cpf.equals(cpfInformada);
    }
}

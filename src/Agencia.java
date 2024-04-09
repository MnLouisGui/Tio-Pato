public class Agencia {
    int codigo;
    static int contador;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }

    Agencia(){
        contador++;  
        this.codigo=this.codigo+contador;
    }
}

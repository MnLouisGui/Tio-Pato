import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
    private String tipo;
    private double valor;
    private LocalDateTime dataHora; 

    // Códigos ANSI para cores
    public static final String ANSI_RESET = "\u001B[0m";   // Reseta a cor
    
    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = LocalDateTime.now(); 
    }

    // Método para formatar
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return tipo + " - Valor: R$" + String.format("%.2f", valor) + " - Data/Hora: " + dataHora.format(formatter)+ANSI_RESET;
    }
}

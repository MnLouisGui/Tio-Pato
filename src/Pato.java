import java.util.*;
import java.lang.*;

public class Pato {
    public static void main(String[] args) throws InterruptedException{
        Conta conta1=new Conta(0.0);
        Conta conta2=new Conta();
        Cliente cliente1=new Cliente();
        Agencia agencia1=new Agencia();
        
        Boolean on=false;
        int login=0;
        agencia1.setCodigo(1001);
        cliente1.setNome("Ribamar");
        
        conta1.setCliente(cliente1);
        conta1.setAgencia(agencia1);

        Scanner scanner=new Scanner(System.in);
        System.out.println("________ Duck Bank _______");
        while(on==false){
            System.out.println("__________________________");
            System.out.println("---------- Login ---------");
            System.out.println("Olá "+cliente1.getNome()+", qual conta deseja acessar?");
            System.out.println("1.Conta 1\n2.Conta 2");
            int op=scanner.nextInt();
            switch(op){
                case 1:
                    login=1;
                    on=true;
                    break;
                case 2:
                    login=2;
                    on=true;
                    break;
                default:
                    on=false;
                    System.out.println("Opção invalida");
            }
        }
        while (on==true) {
            System.out.println("__________________________");
            System.out.println("---------- Menu ----------");
            System.out.println("1.Sacar\n2.Recarga\n3.Deposito\n4.Consultar\n5.Deslogar");
            int op=scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("___________________________");
                    System.out.println("---------- Sacar ----------");
                    System.out.println("Cliente: "+cliente1.getNome());
                    System.out.println("Agência: "+agencia1.getCodigo());    
                    System.out.println("Quanto deseja sacar?");
                    Double sacar=scanner.nextDouble();
                    System.out.print("Sacando R$"+sacar+"0");
                    Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
                    System.out.println("Saque Feito!!!");
                    Thread.sleep(1500);
                    conta1.sacar(sacar);
                    Thread.sleep(4000);
                    break;
                case 2:
                    System.out.println("___________________________");
                    System.out.println("--------- Recarga ---------");
                    System.out.println("Como deseja recarregar?\n1.R$20,00\n2.Outro Valor");
                    op=scanner.nextInt();
                    switch (op) {
                        case 1:
                            System.out.print("Recarregando R$20.00");
                            Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
                            System.out.println("Recarga Feita!!!");
                            Thread.sleep(1500);
                            conta1.recarga();
                            break;
                        case 2:
                            System.out.println("Quanto deseja recarregar?");
                            Double valor=scanner.nextDouble();
                            System.out.print("Recarregando R$"+valor+"0");
                            Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
                            System.out.println("Recarga Feita!!!");
                            Thread.sleep(1500);
                            conta1.recarga(valor);
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("___________________________");
                    System.out.println("--------- Deposito --------");
                    System.out.println("Quanto deseja depositar?");
                    Double valor=scanner.nextDouble();
                    System.out.print("Depositando R$"+valor+"0");
                    Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
                    System.out.println("Deposito Feito!!!");
                    Thread.sleep(1500);
                    conta1.deposito(valor);

                    break;
                case 4:
                    conta1.consultar();
                    System.out.println("1.Voltar");
                    op=scanner.nextInt(); 
                    break;
                case 5:
                    login=0;
                    on=false;
                    break;
                default:
                    System.out.println("Opção errada");
                    break;
            }
        }
    }
}

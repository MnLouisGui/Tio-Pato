import java.util.*;

public class Pato {
    public static void main(String[] args) throws InterruptedException{

        Conta conta1=new C_corrente(1000.0, null, null);//poli
        Conta conta2=new C_poupanca(1000.0, null, null);//poli
        Cliente cliente1=new Cliente_p_fisica(null);//poli
        Cliente_p_fisica fisico=(Cliente_p_fisica) cliente1;
        fisico.setCpf("612.131.131-51");
        Agencia agencia1=new Agencia();
        
        Boolean on=true;
        cliente1.setNome("Ribamar");
        
        conta1.setCliente(cliente1);
        conta1.setAgencia(agencia1);

        Scanner scanner=new Scanner(System.in);
        System.out.println("________ Duck Bank _______");
        while (on==true) {
            System.out.println("__________________________");
            System.out.println("---------- Menu ----------");
            System.out.println("1.Sacar\n2.Recarga\n3.Deposito\n4.Consultar\n5.Transferir\n6.Deslogar");
            int op=scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("___________________________");
                    System.out.println("---------- Sacar ----------");
                    System.out.println("Cliente: "+cliente1.getNome());
                    System.out.println("Agência: "+agencia1.getCodigo());
                    conta1.tipo();    
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
                    conta1.tipo();
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
                    conta1.tipo();
                    System.out.println("Quanto deseja depositar?");
                    Double valor=scanner.nextDouble();
                    System.out.print("Depositando R$"+valor+"0");
                    Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
                    System.out.println("Deposito Feito!!!");
                    Thread.sleep(1500);
                    conta1.deposito(valor);

                    break;
                case 4:
                    conta1.consultar(conta2, cliente1);
                    System.out.println("1.Voltar");
                    op=scanner.nextInt(); 
                    break;
                case 5:
                    System.out.println("___________________________");
                    System.out.println("------ Transferencia ------"); 
                    System.out.println("Para qual conta deseja Trasnferir?\n1.Corrente para Poupança\n2.Poupança para Corrente");
                    op=scanner.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Quanto deseja transferir?");
                            valor=scanner.nextDouble();
                            System.out.print("Transferindo R$"+valor+"0");
                            Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
                            System.out.println("Transferência feita para Conta Poupança!!!");
                            Thread.sleep(1500);
                            Conta destino=conta2;
                            conta1.transferir(destino, valor);
                            Thread.sleep(1500);
                            break;
                        case 2:
                            System.out.println("Quanto deseja transferir?");
                            valor=scanner.nextDouble();
                            System.out.print("Transferindo R$"+valor+"0");
                            Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
                            System.out.println("Transferência feita para Conta Corrente!!!");
                            Thread.sleep(1500);
                            destino=conta1;
                            conta2.transferir(destino, valor);
                            Thread.sleep(1500);
                            break;
                        default:
                            System.out.println("Opção errada");
                            break;
                    }

                    break;
                case 6:
                    on=false; 
                    break;
                default:
                    System.out.println("Opção errada");
                    break;
            }
        }
    }
}

import java.util.*;

public class Pato {
    // Códigos ANSI para cores
    public static final String ANSI_RESET = "\u001B[0m";   // Reseta a cor
    public static final String ANSI_GREEN = "\u001B[32m";  // Verde
    public static final String ANSI_RED = "\u001B[31m";    // Vermelho
    public static void main(String[] args) throws InterruptedException{
        
        // Criação de contas
        Conta conta1 = new C_corrente(1000.0, null, null); // poli
        Conta conta2 = new C_poupanca(1000.0, null, null); // poli
        
        // Adicionando as contas ao ArrayList

        Cliente cliente1=new Cliente_p_fisica(null);//poli
        Cliente_p_fisica fisico=(Cliente_p_fisica) cliente1;
        Agencia agencia1=new Agencia();
        
        Boolean on=false;

        conta1.setCliente(cliente1);
        conta2.setCliente(cliente1);
        conta1.setAgencia(agencia1);

        Scanner scanner=new Scanner(System.in);
        System.out.println("__________ Duck Bank _________");
        System.out.println("---------- Cadastro ----------\nQual é o seu nome?");
        String nome=scanner.nextLine(); 
        cliente1.setNome(nome);
        System.out.println("Qual é o seu CPF?");
        String cpf=scanner.nextLine(); 
        fisico.setCpf(cpf);
        System.out.println("Crie uma senha:");
        String senha=scanner.nextLine(); 
        cliente1.setSenha(senha);

        while (on==false) {
            System.out.println("___________________________");
            System.out.println("---------- Login ----------");
            System.out.println("digite seu CPF:");
            cpf = scanner.nextLine();
            System.out.println("digite sua senha:");
            senha = scanner.nextLine();
            System.out.print("Vericando");
            Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
            if (cliente1.validarCpf(cpf) && cliente1.validarSenha(senha)) {
                System.out.println(ANSI_GREEN +"Login realizado com sucesso!"+ANSI_RESET);
                Thread.sleep(2000);
                on=true;
            } else {
                System.out.println(ANSI_RED+"CPF ou senha inválidos."+ANSI_RESET);
                Thread.sleep(2000);
            }

        }
        while (on==true) {
            System.out.println("__________________________");
            System.out.println("---------- Menu ----------");
            System.out.println("1.Sacar\n2.Recarga\n3.Deposito\n4.Consultar\n5.Transferir\n6.Extrato\n7.Sair");
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
                    System.out.print(ANSI_RED +"Sacando R$"+sacar+"0");
                    Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
                    System.out.println("Saque Feito!!!"+ ANSI_RESET);
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
                            System.out.print(ANSI_RED+"Recarregando R$20.00");
                            Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
                            System.out.println("Recarga Feita!!!"+ANSI_RESET);
                            Thread.sleep(1500);
                            conta1.recarga();
                            break;
                        case 2:
                            System.out.println("Quanto deseja recarregar?");
                            Double valor=scanner.nextDouble();
                            System.out.print(ANSI_RED +"Recarregando R$"+valor+"0");
                            Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
                            System.out.println("Recarga Feita!!!"+ ANSI_RESET);
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
                    System.out.print(ANSI_GREEN +"Depositando R$"+valor+"0");
                    Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
                    System.out.println("Deposito Feito!!!"+ ANSI_RESET);
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
                            System.out.print(ANSI_RED+"Transferindo R$"+valor+"0");
                            Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
                            System.out.println("Transferência feita para Conta Poupança!!!"+ANSI_RESET);
                            Thread.sleep(1500);
                            Conta destino=conta2;
                            conta1.transferir(destino, valor);
                            Thread.sleep(1500);
                            break;
                        case 2:
                            System.out.println("Quanto deseja transferir?");
                            valor=scanner.nextDouble();
                            System.out.print(ANSI_GREEN+"Transferindo R$"+valor+"0");
                            Thread.sleep(750);System.out.print("."); Thread.sleep(750); System.out.print(".");Thread.sleep(750); System.out.print(".\n"); Thread.sleep(500);
                            System.out.println("Transferência feita para Conta Corrente!!!"+ANSI_RESET);
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
                    cliente1.imprimirExtrato();
                    Thread.sleep(4000);
                    break;
                case 7:
                    on=false; 
                    break;
                default:
                    System.out.println("Opção errada");
                    break;
            }
        }
    }
}

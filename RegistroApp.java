import java.util.ArrayList;
import java.util.Scanner;

public class RegistroApp {
    public static Scanner input;

    public static void menu(){
        System.out.println("----------------------");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Buscar Cliente");
        System.out.println("3. Alterar dados do cliente");
        System.out.println("4. Cadastrar produto");
        System.out.println("5. Buscar Produto");
        System.out.println("6. Alterar dados do produto");
        System.out.println("7. Venda");
        System.out.println("----------------------");
    }

    public static void CadastrarCliente(ArrayList<Cliente> clientes){

        System.out.println("Nome do cliente: ");
        String nomeCliente = input.nextLine(); 

        System.out.println("CPF(XXX.XXX.XXX-XX):");
        String cpf= input.nextLine();

        System.out.println("Contato (E-mail ou número de telefone no formato (XX)XXXX-XXXX):");
        String contato= input.nextLine();

        clientes.add(new Cliente(nomeCliente, cpf, contato));
        
    }

    public static void CadastrarProduto(ArrayList<Produto> produtos){

        System.out.println("Codigo:");
        int codigoProduto = input.nextInt();
        input.nextLine();

        System.out.println("Nome do produto: ");
        String nomeProduto = input.nextLine(); 

        System.out.println("Tipo:");
        String tipoProduto = input.nextLine();

        System.out.println("Valor:");
        double valorProduto = input.nextDouble();

        System.out.println("Quantidade:");
        int quantidadeProduto = input.nextInt();

        produtos.add(new Produto( nomeProduto, codigoProduto, tipoProduto, valorProduto, quantidadeProduto));

    }

    public static void BuscarProduto(ArrayList<Produto> produtos){
        final StringBuilder builder = new StringBuilder();

        for (int i = 0; i < produtos.size(); i++) {
            builder.append(i + 1);
            builder.append(". ");
            builder.append(produtos.get(i).getNomeProduto());
            builder.append('\n');
        }
        System.out.println(builder.toString());

        System.out.println("Qual produto deseja ver mais informacoes?");
        int escolhaProduto = input.nextInt();

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("\tCODIGO\t\tNOME\t\tQUANTIDADE\t\tTIPO\t\tVALOR");
        System.out.println(produtos.get(escolhaProduto-1));
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    public static void BuscarCliente(ArrayList<Cliente> clientes){
        final StringBuilder builder = new StringBuilder();

        for (int i = 0; i < clientes.size(); i++) {
            builder.append(i + 1);
            builder.append(". ");
            builder.append(clientes.get(i).getNomeCliente());
            builder.append('\n');
        }
        System.out.println(builder.toString());

        System.out.println("Qual cliente deseja ver mais informacoes?");
        int escolhaCliente = input.nextInt();

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("\t\tNOME \t\t\tCPF\t\t\t\tCONTATO");
        System.out.println(clientes.get(escolhaCliente-1));
        System.out.println("-----------------------------------------------------------------------------------------------");

    }

    public static void AlterarProduto(ArrayList<Produto> produtos){
        System.out.println("Produtos cadastrados: ");
        System.out.println(produtos.toString()); //MOSTRA TODOS OS PRODUTOS DSIPONIVEIS

        System.out.println("Qual produto deseja modificar: ");
        int escolhaProduto = input.nextInt();
        input.nextLine();

        Produto produto = produtos.get(escolhaProduto-1);
        System.out.println("O que voce deseja modificar? 1 - Nome / 2 - Codigo / 3 - Quantidade / 4 - Tipo / 5 - Valor");
        int resp = input.nextInt();
        input.nextLine();

        switch(resp){

            case 1: 
            System.out.println("-------------------------------------------------");
            System.out.println("Novo nome do produto: ");
            produto.setNomeProduto(input.nextLine());
            break;

            case 2:
            System.out.println("-------------------------------------------------");
            System.out.println("Novo codigo do produto: ");
            produto.setCodigoProduto(input.nextInt()); 
            break;

            case 3:
            System.out.println("-------------------------------------------------");
            System.out.println("Nova quantidade: ");
            produto.setQuantidadeProduto(input.nextInt());
            break;

            case 4:
            System.out.println("-------------------------------------------------");
            System.out.println("Novo tipo: ");
            produto.setTipoProduto(input.nextLine());
            break;

            case 5:
            System.out.println("-------------------------------------------------");
            System.out.println("Novo valor: ");
            produto.setValorProduto(input.nextDouble());
            break;

        }
    }

    public static void AlterarCliente(ArrayList<Cliente> clientes){
        System.out.println("Clientes cadastrados: ");
        System.out.println(clientes.toString()); //MOSTRA TODOS OS CLIENTES DSIPONIVEIS

        System.out.println("Qual cliente deseja modificar: ");
        int escolhaCliente = input.nextInt();
        input.nextLine();

        Cliente cliente = clientes.get(escolhaCliente-1);
        System.out.println("O que voce deseja modificar? 1 - Nome / 2 - CPF / 3 - Contato");
        int resp = input.nextInt();
        input.nextLine();

        switch(resp){

            case 1: 
            System.out.println("-------------------------------------------------");
            System.out.println("Novo nome do cliente: ");
            cliente.setNomeCliente(input.nextLine());
            break;

            case 2:
            System.out.println("-------------------------------------------------");
            System.out.println("Novo CPF do cliente: ");
            cliente.setCpf(input.nextLine()); 
            break;

            case 3:
            System.out.println("-------------------------------------------------");
            System.out.println("Novo contato: ");
            cliente.setContato(input.nextLine());
            break;
        }
    }

    public static void Venda(ArrayList<Cliente> clientes, ArrayList<Produto> produtos){

        
    }

    public static void main(String[] args){
        input = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        int menu = 1;
        while((menu>=1)&(menu<5)){
            menu();
            menu = input.nextInt();
            input.nextLine();
            switch(menu){

                case 1:
                CadastrarCliente(clientes);
                System.out.println("------------------------------------------");
                    break;
                
                case 2:
                BuscarCliente(clientes);
                    break;

                case 3:
                AlterarCliente(clientes);
                    break;

                case 4:
                CadastrarProduto(produtos);
                System.out.println("------------------------------------------");
                    break;

                case 5:
                BuscarProduto(produtos);
                    break;
                
                case 6:
                AlterarProduto(produtos);
                    break;

                case 7:
                System.out.println("------------------------------------------");
                Venda(clientes, produtos);
                System.out.println("------------------------------------------");
                    break;
            }
        }
    }
}
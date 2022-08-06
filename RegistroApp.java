import java.util.ArrayList;
import java.util.Scanner;

public class RegistroApp {
    public static Scanner input;

    public static void menu(){
        System.out.println("----------------------");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Buscar Cliente");
        System.out.println("3. Cadastrar produto");
        System.out.println("4. Buscar Produto");
        System.out.println("5. Passar Compra");
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
                CadastrarProduto(produtos);
                System.out.println("------------------------------------------");
                    break;

                case 4:
                BuscarProduto(produtos);
                    break;

                case 5:

                    break;
            }
        }
    }
}
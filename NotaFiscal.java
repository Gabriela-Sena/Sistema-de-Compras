public class NotaFiscal {
    int qtd;
    Double preco;
    Double valor;

    public void getFatura (int qtd, Double preco){
           valor=qtd*preco;
           System.out.println("Valor total da compra: " + valor);
    }
}

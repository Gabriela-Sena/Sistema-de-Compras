public class NotaFiscal extends Produto{

    private double valorTotal;

    public NotaFiscal(String nomeProduto, int codigoProduto, String tipoProduto, double valorProduto,
            int quantidadeProduto, double valorTotal) {
        super(nomeProduto, codigoProduto, tipoProduto, valorProduto, quantidadeProduto);
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "NotaFiscal [valorTotal=" + valorTotal + "]";
    }

}

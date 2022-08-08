public class Produto {

    private String nomeProduto;
    private int codigoProduto;
    private String tipoProduto;
    private double valorProduto;
    private int quantidadeProduto;
    double valor;
    
    public Produto(String nomeProduto, int codigoProduto, String tipoProduto, double valorProduto,
            int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.codigoProduto = codigoProduto;
        this.tipoProduto = tipoProduto;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return "\t" + codigoProduto + "\t\t" + nomeProduto + "\t\t" + quantidadeProduto 
        + "\t\t\t" + tipoProduto + "\t\t" + valorProduto;
    }

   

    
}

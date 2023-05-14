package entidades;

public class Produtos {
    private String nome;
    private double preco;
    private int qtdProduto;

    public Produtos(String nome, double preco, int qtdProduto) {
        this.nome = nome;
        this.preco = preco;
        this.qtdProduto = qtdProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
    public void adicionarProduto(int qtd){
        this.setQtdProduto(this.getQtdProduto() + qtd);
    }
    public void removerProduto(int qtd){
        if(this.getQtdProduto() > qtd){
        this.setQtdProduto(this.getQtdProduto() - qtd);
        } else {
            this.setQtdProduto(0);
            System.out.println("Quantidade a ser retirada é maior do que o estoque atual. Estoque foi zerado");
        }
    }
    public double valorTotal(){
        return (this.getPreco() * this.getQtdProduto());
    }

    @Override
    public String toString(){
        return String.format("Produto: %s, total de %d unidades com preço unitário de R$ %.2f, no total: R$ %.2f",
                this.getNome(),  this.getQtdProduto(), this.getPreco(), this.valorTotal());
    }
}

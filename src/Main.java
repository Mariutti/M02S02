import entidades.Produtos;

public class Main {
    public static void main(String[] args) {
        Produtos produto = new Produtos("bike", 850.5, 10);

        Produtos carro = new Produtos("carro", 75890.99, 5);

        System.out.println(produto.toString());
        carro.adicionarProduto(5);
        produto.setQtdProduto(10);

        produto.setPreco(1000.0);

        System.out.println(carro.toString());
    }
}
/*
TODO V Ex 1 - Crie um novo projeto no intelliJ para uma aplicação java.

TODO V Ex 2 - Crie um Package (pasta / pacote) com nome Entidades.

TODO V Ex 3 - Crie uma classe com o nome Produtos.

TODO V Ex 4 - Crie um novo arquivo (se não houver no projeto inicial) contendo um método main().

TODO V Ex 5 - No método main() instancie um objeto da classe produto

TODO V Ex 6 - O Programa vai receber o nome, preço e quantidade de certo produto.

TODO V Ex 7 - Adicionar produtos ao estoque.

TODO V Ex 8 - remover produtos do estoque.

TODO Ex 9 - Valor total do estoque.

TODO Ex 10 - Sobrescrever o método ToString() da classe produto para imprimir o produto no seguinte formato ex:
 “ TV, 900.00 R$, 10 unidades, Total: 9000.0 R$”
*/

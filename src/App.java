public class App {
    public static void main(String[] args){

        Estoque estoque = new Estoque();

        ProdutoDomestico produto1 =  new ProdutoDomestico("Prato", 10, 0.2, "Schmidt");
        estoque.addProduto(produto1);
        ProdutoDomestico produto2 =  new ProdutoDomestico("Aspirador", 100, 3, "Britania");
        estoque.addProduto(produto2);
        ProdutoGamer produto3 = new ProdutoGamer("Teclado", 500, "Rgb", 3);
        estoque.addProduto(produto3);
        ProdutoGamer produto4 = new ProdutoGamer("Mouse", 150, "One Color", 1);
        estoque.addProduto(produto4);
        ProdutoGamer produto5 = new ProdutoGamer("Monitor", 1000, "Led", 5);
        estoque.addProduto(produto5);


        estoque.ExibirPrecoComDesconto(null, 0);
        
    }
}

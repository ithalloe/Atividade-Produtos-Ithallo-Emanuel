import java.util.ArrayList;
import java.util.List;

public class Estoque{

private List<Produto> produtosDisponiveis;

public Estoque() {
    this.produtosDisponiveis = new ArrayList<>();
}

public List<Produto> getProdutosDisponiveis() {
    return produtosDisponiveis;
}

public void setProdutosDisponiveis(List<Produto> produtosDisponiveis) {
    this.produtosDisponiveis = produtosDisponiveis;
}
    public void addProduto(Produto produto) {
        produtosDisponiveis.add(produto);
    }

    public void rmvProduto(Produto produto) {
        produtosDisponiveis.remove(produto);
    }
    public void ExibirPrecoComDesconto(List<Produto> produtos,double porcentagem){
        for (Produto produto : produtosDisponiveis) {
            double precoComDesconto = produto.calcularDesconto(porcentagem);
            System.out.println("Produto: " + produto.getNome() + ", Preço com desconto: R$ " + String.format("%.2f", precoComDesconto) );
        }

    }
}

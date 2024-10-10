public class ProdutoGamer extends Produto {
    String luminosidade;
    double nvlAvaliacao;

    public ProdutoGamer(String nome, double preco, String luminosidade, double nvlAvaliacao) {
        super(nome, preco);
        this.luminosidade = luminosidade;
        this.nvlAvaliacao = nvlAvaliacao;
    }

    public String getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(String luminosidade) {
        this.luminosidade = luminosidade;
    }
    public double getNvlAvaliacao() {
        return nvlAvaliacao;
    }

    public void setNvlAvaliacao(double nvlAvaliacao) {
        this.nvlAvaliacao = nvlAvaliacao;
    }

    public double calcularDesconto(double porcentagem){

         if (nvlAvaliacao <= 2){
             return preco - ((( porcentagem + 10) / 100) * preco);
         }if( (nvlAvaliacao > 2) && (nvlAvaliacao < 4)) {
            return preco - ((( porcentagem + 7) / 100) * preco);
        }else if( (nvlAvaliacao > 4) && (nvlAvaliacao <= 5)){
            return preco - ((( porcentagem + 5) / 100) * preco);  
        }else{
            System.out.println("Nivel de avaliação invalida!");
            return preco;
        }
    }
}


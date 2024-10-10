public class Produto {
   
    private String nome;
    protected double preco;
    double porcentagem;
    
     public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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

    public  double calcularDesconto(double porcentagem){
        return preco - (( porcentagem / 100) * preco);
    }
}

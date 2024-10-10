public class ProdutoDomestico extends Produto {
    double pesoEmKg;
    String marca;

    public ProdutoDomestico(String nome, double preco, double pesoEmKg, String marca) {
        super(nome, preco);
        this.pesoEmKg = pesoEmKg;
        this.marca = marca;
    }
  
    public double getPesoEmKg() {
        return pesoEmKg;
    }

    public void setPeso(double pesoEmKg) {
        this.pesoEmKg = pesoEmKg;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
   
    public double calcularDesconto(double porcentagem){
        if (pesoEmKg < 2){
         return preco - ((( porcentagem + 3) / 100) * preco);
        }else{
            return preco - (( porcentagem) / 100) * preco;
        }
    }

}

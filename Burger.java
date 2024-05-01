
public class Burger implements IProduto {
	
	public String descricao;
    public double preco;
    public int gramas;
    
    
    public String getDescricao() {
        return descricao;
    }

    
    public void setDescricao(String descricao) {
     this.descricao = descricao;
    }

    
    public double getPreco() {
        return preco;
    }
    
   
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas){
        this.gramas = gramas;
    }

}

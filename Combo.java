public class Combo {
    Burger burger;
    Bebida bebida;
    Sobremesa sobremesa;

    public Combo(){
        this.burger = new Burger();
        this.bebida = new Bebida();
        this.sobremesa = new Sobremesa();
    }

    public void criarCombo (int tipo){
        if (tipo ==1 )
        {
          burger.setDescricao("X-Burger");
          burger.setPreco(25.90);
          burger.setGramas(350);
          sobremesa.setDescricao("Sorbet de Manga");
          sobremesa.setPreco(10.50);
          sobremesa.setTamanho("Grande");
          bebida.setDescricao("Suco de Laranja");
          bebida.setPreco(5.99);
          bebida.setMl(400);        
        }
        if (tipo == 2)
        {
            burger.setDescricao("Burger das Galaxias");
            burger.setPreco(39.9);
            burger.setGramas(550);
            sobremesa.setDescricao("Torta Holandesa");
            sobremesa.setPreco(12.00);
            sobremesa.setTamanho("Médio");
            bebida.setDescricao("Coca Cola");
            bebida.setPreco(8.50);
            bebida.setMl(600);        
        }

    }

    public void mostrarItensDoCombo()
    {
        double total = sobremesa.getPreco() + burger.getPreco() + bebida.getPreco();

        System.out.println("\n");
        System.out.println("Burguer: " +burger.getDescricao());
        System.out.println("Peso do burguer: " +burger.getGramas()+ " gramas");
        System.out.println("Preço: " +burger.getPreco());
        System.out.println("\n");
        System.out.println("Sobremesa: " +sobremesa.getDescricao());
        System.out.println("Tamanho: " +sobremesa.getTamanho());
        System.out.println("Preço: " +sobremesa.getPreco());
        System.out.println("\n");
        System.out.println("Bebida: " +bebida.getDescricao());
        System.out.println("Mililitros: " +bebida.getMl()+ "ml");
        System.out.println("Preço: " +bebida.getPreco());
        System.out.println("\n");
        System.out.println("Total: "+ total);


    }
}
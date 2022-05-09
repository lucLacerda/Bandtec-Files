

package exemplo.agregacao;


public class App {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho("c1");
        
        
        Produto uva = new Produto("uva","fruta",9.90);
        Produto melancia = new Produto("melancia","fruta",9.99);
        Produto abacaxi = new Produto("abacaxi","fruta",10.99);
        
        
        carrinho.adiciona(uva);
        carrinho.adiciona(melancia);
        carrinho.adiciona(abacaxi);
        
        System.out.println(carrinho.getQuantidade());
        
        
        
        
        
        
    }
    
}

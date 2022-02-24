
package br.com.sptech.projeto02;

/**
 *
 * @author Lucas Lacerda
 */
public class NumerosPares {
    public static void main(String[] args) {
        Integer cont = 0;
        do {
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
            cont ++;
            
        } while (cont <= 40);
    }
     
}

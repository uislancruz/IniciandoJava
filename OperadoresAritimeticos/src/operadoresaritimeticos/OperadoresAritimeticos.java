/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

/**
 *
 * @author uisla
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A media é igual a: " +m);*/
       
       //float v = 8.3f;
       //int ar = (int)Math.round(v);
        //System.out.println(ar);
        
       //para melhor entendimento, melhor sempre usar o round, pois ele faz arredondamento aritimeticos, ex: 8,5 = 9 ou 8,4 igual a 8
       // temos ciel que arredonda para cima e o floor que arredonda para baixo
        
       double ale = Math.random();
       int n = (int) (5 + ale * (10-5));
        System.out.println(n);
               
    }
    
}

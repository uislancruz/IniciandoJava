package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author uisla
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno:");
        float nota = teclado.nextFloat();
        /** System.out.println("A notaa é: " + nota); essa linha é um exemplo
         de como pode fazer o System, ou print ou println*/
        /**System.out.printf("A nota de %s é %.2f \n", nome, nota);*/ 
        System.out.format("A nota de %s é %.2f \n", nome, nota);
        /** o .2 é para casa decimais, pode ser .1 para um numero depois
         * da virgula, e assim sucessivamente.
         */
    }
        
}

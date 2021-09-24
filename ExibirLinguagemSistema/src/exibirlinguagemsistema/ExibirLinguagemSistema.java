
package exibirlinguagemsistema;

import java.util.*;

public class ExibirLinguagemSistema {

    
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("Minha linguagem é:");
        System.out.println (loc.getDisplayLanguage()); 
        System.out.println (loc.getLanguage());
      
    }
    
}

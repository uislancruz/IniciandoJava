
package exibirresolucaosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ExibirResolucaoSistema {

    public static void main(String[] args) {
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    System.out.println("Largura da tela = " + d.width);
    System.out.println("Altura da tela = " + d.height);
    }
    
}

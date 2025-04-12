
package solucion.isp;

/**
 *
 * @author L34215
 */
public class Test {
    public static void main(String[] args) {
        Perro p = new Perro();
        Cachalote c = new Cachalote();
        Aguila a = new Aguila();
        
        p.hablar();
        c.hablar();
        a.hablar();
        
        p.caminar();
        p.saltar();
        
        c.bucear();
        c.nadar();
        
        a.volar();
        a.aletear();  
    }
}

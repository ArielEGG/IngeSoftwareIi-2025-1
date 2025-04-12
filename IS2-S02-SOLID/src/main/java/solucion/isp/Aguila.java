
package solucion.isp;

/**
 *
 * @author L34215
 */
public class Aguila implements Animal,Ave{
    @Override
    public void comer(){
        System.out.println("Estoy tragando");
    }
    @Override
    public void hablar(){
        System.out.println("Cro Croa");
    }
    @Override
    public void dormir(){
        System.out.println("Aguila zzz");
    }
    @Override
    public void aletear(){
        System.out.println("Estoy aleteando mis alas");
    }
    @Override
    public void volar(){
        System.out.println("Estoy volando xd");
    }
    @Override
    public void caminar(){
        System.out.println("Estoy caminando");
    }
}

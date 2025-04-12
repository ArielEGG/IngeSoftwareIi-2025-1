
package solucion.isp;

/**
 *
 * @author L34215
 */
public class Conejo implements Animal,Mamifero{
    @Override
     public void comer(){
         System.out.println("Estoy tragando");
     }
     @Override
     public void hablar(){
         System.out.println("sonidos de conejo*");
     }
     @Override
     public void dormir(){
         System.out.println("Conejo zzz");
     }
     @Override
     public void nadar(){
         System.out.println("Estilo conejo xd");
     }
     @Override
     public void saltar(){
         System.out.println("Estoy saltando alto");
     }
     @Override
     public void caminar(){
         System.out.println("Estoy caminando");
     }
}

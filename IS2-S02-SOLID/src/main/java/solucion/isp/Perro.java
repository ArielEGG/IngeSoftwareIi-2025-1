
package solucion.isp;

/**
 *
 * @author L34215
 */
public class Perro implements Animal, Mamifero{
     @Override
     public void comer(){
         System.out.println("Estoy tragando");
     }
     @Override
     public void hablar(){
         System.out.println("Guau");
     }
     @Override
     public void dormir(){
         System.out.println("Perro zzz");
     }
     @Override
     public void nadar(){
         System.out.println("Estilo perrito xd");
     }
     @Override
     public void saltar(){
         System.out.println("Estoy saltando");
     }
     @Override
     public void caminar(){
         System.out.println("Estoy caminando");
     }
}

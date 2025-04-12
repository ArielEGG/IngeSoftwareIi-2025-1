
package solucion.isp;

/**
 *
 * @author L34215
 */
public class Cachalote implements Animal,Acuatico {
    @Override
     public void comer(){
         System.out.println("Estoy tragando");
     }
     @Override
     public void hablar(){
         System.out.println("Sonidos de cachalote*");
     }
     @Override
     public void dormir(){
         System.out.println("Cachalote zzz");
     }
     @Override
     public void bucear(){
         System.out.println("Estoy buceando");
     }
     public void nadar(){
         System.out.println("Estoy nadando en el awa");
     }
}

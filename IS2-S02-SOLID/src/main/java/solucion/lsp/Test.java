package solucion.lsp;

/**
 *
 * @author L34215
 */
public class Test {
    public static void main(String[] args) {
        Pato pato = new Pato();
        Pinguino pinguino = new Pinguino();
        ManejarVuelo mv = new ManejarVuelo();
        mv.hacerQueVuele(pinguino);
        pato.volar();
    }
}

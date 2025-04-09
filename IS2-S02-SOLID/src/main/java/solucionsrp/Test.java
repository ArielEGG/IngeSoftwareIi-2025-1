package solucionsrp;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** test ***");
        Reporte r = new Reporte("Anti-Ejemplo","No se cumple el principio SRP");
        GuardarReport gr = new GuardarReport();
        gr.guardarReporte(r,"MiReporte.txt");
        gr.enviarCorreo(r,"micorreo@ulima.edu.pe");
    }
}

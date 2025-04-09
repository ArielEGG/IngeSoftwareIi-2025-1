/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solucionsrp;

/**
 *
 * @author L34213
 */
public class GuardarReport {
    public void enviarCorreo(Reporte r, String email) {
        System.out.println("Enviando reporte a " + email);
    }
    public void guardarReporte(Reporte r, String txt){
        System.out.println("Guardando el reporte:" + txt);
    }
}

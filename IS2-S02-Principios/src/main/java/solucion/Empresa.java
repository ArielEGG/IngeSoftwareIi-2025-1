/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solucion;
public class Empresa {
    private Sucursal sucursal;

    public Empresa(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
    public void mostrarEmpleados() {
        
        for (Empleado emp : sucursal.getEmpleados() ) {
            System.out.println( emp );
        }
    }
}

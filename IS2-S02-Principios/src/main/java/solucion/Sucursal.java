/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solucion;

import java.util.ArrayList;
import java.util.List;
import solucion.Empleado;

/**
 *
 * @author L34213
 */
public class Sucursal {
    List<Empleado> empleados;
            
    public Sucursal() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado( Empleado emp) {
        empleados.add( emp );
    }
    
    public List<Empleado>
         getEmpleados() {
        return empleados;
    }

    
    
}


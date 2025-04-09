/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solucion;

import java.util.List;

/**
 *
 * @author L34213
 */
public class Impresion {
    public void muestraLibros(List<Libro> lista) {
        for(Libro l : lista) {
            System.out.println(l);
        }
    }
}

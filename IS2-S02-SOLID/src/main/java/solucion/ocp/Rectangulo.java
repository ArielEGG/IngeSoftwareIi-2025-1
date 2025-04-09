/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solucion.ocp;

/**
 *
 * @author L34213
 */
public class Rectangulo implements Figura {
    private double largo;
    private double ancho;
    
    public Rectangulo(double largo, double ancho) {
        this.ancho = ancho;
        this.largo = largo;
    }
    
    @Override
    public double calcularArea() {
        return largo * ancho;
    }
}

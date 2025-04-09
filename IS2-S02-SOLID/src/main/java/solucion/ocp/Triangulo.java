/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solucion.ocp;

/**
 *
 * @author L34213
 */
public class Triangulo implements Figura{
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }
}

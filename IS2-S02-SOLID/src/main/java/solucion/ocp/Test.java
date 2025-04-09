package solucion.ocp;

public class Test {
    
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(2,3);
        Figura circulo = new Circulo(4);
        Figura triangulo = new Triangulo(5,3);

        System.out.println("Area de rectangulo: " + rectangulo.calcularArea());
        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
        
        
    }
}


package programa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangulo extends Poligono {
    
    //ATRIBUTOS
    public double altura;
    public double ladoA;
    public double ladoB;
    public double ladoC;
    
    
    
    //MÉTODOS PERSONALIZADOS
    public void entradaDadosTriangulo() {
        
        Scanner valor = new Scanner(System.in);
        
        setQtdlados(3);
        System.out.println("");
        System.out.println("DADOS DE ENTRADA DO TRIÂNGULO:");
        System.out.print("   - Digite a altura: ");
        this.altura = valor.nextDouble();
        System.out.print("   - Digite o valor do Lado A(base do Triângulo): ");  
        this.ladoA = valor.nextDouble();
        System.out.print("   - Digite o valor do Lado B: ");
        this.ladoB = valor.nextDouble();
        System.out.print("   - Digite o valor do Lado C: ");
        this.ladoC = valor.nextDouble();
    }
    
    public int imprimir() {
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        System.out.println("");
        System.out.println("RESULTADO DA OPERAÇÃO: ");
        System.out.println("   - Forma: TRIÂNGULO");
        imprimirQtdLados();
        System.out.println("   - Altura: " + formatador.format(this.getAltura()));
        System.out.println("   - Lado A(base do Triângulo): " 
                + formatador.format(this.getLadoA()));
        System.out.println("   - Lado B: " + formatador.format(this.getLadoB()));
        System.out.println("   - Lado C: " + formatador.format(this.getLadoC()));
        calcularArea();
        System.out.println("\n\n\n\n");
        return 0;
    }
    
    
    @Override
    public void calcularArea() {
        double area;
        double perimetro;
        
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        perimetro = (this.getLadoA()+this.getLadoB()+this.getLadoC());
        System.out.println("   - Perímetro: " + formatador.format(perimetro));
        
        area = (this.ladoA * this.altura)/2;
        System.out.println("   - Área: " + formatador.format(area));
    }
    
    //MÉTODOS GETTERS e SETTERS
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

}

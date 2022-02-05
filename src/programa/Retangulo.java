
package programa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Retangulo extends Poligono {

    //ATRIBUTOS
    public double base;
    public double altura;
    
    //MÉTODOS PERSONALIZADOS
    public void entradaDadosRetangulo() {
        Scanner valor = new Scanner(System.in);
        
        setQtdlados(4);
        System.out.println("");
        System.out.println("DADOS DE ENTRADA DO RETÂNGULO:");
        System.out.print("   - Digite o valor da base: ");
        base = valor.nextDouble();
        System.out.print("   - Digte o valor da altura: ");
        altura = valor.nextDouble();
    }
    
    public int imprimir() {
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        System.out.println("");
        System.out.println("RESULTADO DA OPERAÇÃO: ");
        System.out.println("   - Forma: RETÂNGULO");
        imprimirQtdLados();        
        System.out.println("   - Base: " + formatador.format(this.getBase()));
        System.out.println("   - Altura: " + formatador.format(this.getAltura()));
        calcularArea();
        System.out.println("\n\n\n\n");
        return 0;
    }

    @Override
    public void calcularArea() {
        double area;
        double perimetro;
        
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        perimetro = (2*this.getBase()+2*this.getAltura());
        System.out.println("   - Perímetro: " + formatador.format(perimetro));
        area = (base * altura);
        System.out.println("   - Área: " + formatador.format(area));
    }
    
    //MÉTODOS GETTERS e SETTERS

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

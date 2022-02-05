
package programa;

import java.text.DecimalFormat;

public abstract class Poligono {
    
    //ATRIBUTOS
    public int qtdlados;
   
    
    //MÉTODOS PERSONALIZADOS
    public int imprimirQtdLados() {
        DecimalFormat formatador = new DecimalFormat("0");
        
        System.out.println("   - A quantidade de lados é: " + formatador.format(this.getQtdlados()));
        return 0;
    }

    public abstract void calcularArea();

    
    //MÉTODOS GETTERS e SETTERS
    public float getQtdlados() {
        return qtdlados;
    }

    public void setQtdlados(int qtdlados) {
        this.qtdlados = qtdlados;
    }

}

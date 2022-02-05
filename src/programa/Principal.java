
//PACOTE
package programa;

import java.util.Scanner;

//CLASSE PRINCPAL
public class Principal {
    
    //MÉTODO PARA VALIDAR A OPÇAO.
    static boolean OpcaoExiste (short operacao) {
       	boolean retorno = true;
    	if (operacao < 1 || operacao > 2) {
            System.out.println("");
       		System.out.println("ERRO: OPÇÃO INVÁLIDA! TENTE NOVAMENTE ...");
                System.out.println("\n\n\n\n");
       		retorno = false;
       	}
    	return retorno;
    }	 
    
    //MÉTODO PRINCIPAL.
    public static void main (String args[]){   
        //DECLARAÇÃO DAS VARIÁVEIS.
        short opcao;
        
        //INSTANCIANDO AS CLASSES
        Triangulo t = new Triangulo();
        Retangulo r = new Retangulo();
        Scanner valor = new Scanner(System.in);
        
        //ESTRUTURA DE REPETIÇÃO.
        do {
            System.out.println(" ____________________________________________");
            System.out.println("|        ((( CALCULADORA DE ÁREAS )))        |");
            System.out.println("|                                            |");
            System.out.println("|  DIGITE UMA OPÇÃO:                         |");  
            System.out.println("|  [1] - CALCULAR A ÁREA DE UM TRIÂNGULO     |");    
            System.out.println("|  [2] - CALCULAR A ÁREA DE UM RETÂNGULO     |");    
            System.out.println("|  [0] - SAIR                                |");
            System.out.println("|____________________________________________|");
            System.out.print("\nOPÇÃO: ");
            opcao = valor.nextShort();
             
            if (opcao == 0) {
            	System.out.println("CALCULADORA ENCERRADA !");
            	break;
            }             
            if (!OpcaoExiste(opcao)) {
            	continue;
            }
          
            if (opcao == 1){
                t.entradaDadosTriangulo();
                t.imprimir();
                
            }else if(opcao == 2) {
                r.entradaDadosRetangulo();
                r.imprimir();
            }
            
        } while (opcao != 0);
    }
}

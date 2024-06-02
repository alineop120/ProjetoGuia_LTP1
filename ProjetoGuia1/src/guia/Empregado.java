
package guia;

import java.text.DecimalFormat;//importa a classe DecimalFormat
import java.util.Scanner;//importa a classe Scanner

public class Empregado {//declaração do nome da classe publica

    /*Declaração dos atributos ou variáveis de instancia da classe*/
    public String nome;//nome do empregado
    public double salario, ir;
    public final float TXIR = 0.05f;

    /*Declaração da assinatura dos métodos de serviço*/
 
    /*Metodo para receber os valores das variáveis*/
    public void recebe() {//metodo void sem retorno
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do empregado :");
        nome = sc.nextLine();
        System.out.print("Digite o salário do empregado :");
        salario = sc.nextDouble();
    }

    /*Metodo para calcular imposto de renda*/

    public double calcIR() {//metodo com retorno em double
        return ir = (float) (this.salario * TXIR);

    }

    /*Metodo para mostrar os valores das variáveis*/
    public void mostra() {//metodo void sem retono

        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("\nNOME: " + nome + "\nSALÁRIO: " + df.format(salario)
                + "\nIR: " + df.format(calcIR()));
    }

}
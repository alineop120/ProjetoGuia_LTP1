
package guia;

import java.text.DecimalFormat;
import java.util.Scanner;


public abstract class Empregado //declaração do nome da classe publica 
{
    /*Declaração dos atributos ou variáveis de instancia da classe*/
    private String nome;//nome do empregado
    private double salario, ir;
    private final float TXIR = 0.05f;
    public Scanner sc = new Scanner(System.in);

    public Empregado(String nome) {
        this.nome = nome;
    }

    /*Declaração da assinatura dos métodos de serviço*/
    /*Metodo para receber os valores das variáveis*/
    public void recebe() //metodo void sem retorno
    {
        System.out.print("Digite o nome do empregado :");
        setNome(sc.nextLine());
        System.out.print("Digite o salário do empregado :");
        setSalario(sc.nextDouble());
    }

    /*Metodo para calcular imposto de renda*/
    public double calcIR() //metodo com retorno em double
    {
        return ir = (float) (this.getSalario() * getTXIR());
    }
    
    /*Metodo para calcular aumento de salario*/
    public void aumentaSalario(double aumento){
        this.salario = this.salario + aumento;
    }
    
    public abstract void bonusSalario(); // método abstrato
    
    /* Método sobrecarregado para aposentadoria */
    public boolean validaApo(int idade, int tServ) // Para o programador
    {
        if (idade >= 50 && tServ >= 30){
            System.out.println("Função: Programador/tSituação: Aposentado");
            return false;
        } else {
            System.out.println("Função: Programador/tSituação: Na ativa!");
            return true;
        }
    }
    
    public boolean validaApo(int tServ) // Para o executivo
    {
        if (tServ >= 30){
            System.out.println("Função: Executivo/tSituação: Aposentado");
            return false; // sem direito a bonificação         
        } else {
            System.out.println("Função: Executivo/tSituação: na ativa!");
            return true; // com direito a bonificação
        }
    }
    
    /*Metodo para mostrar os valores das variáveis*/
    @Override
    public String toString() //metodo void sem retono 
    {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return(String()+"\nNOME: " + getNome() + "\nSALÁRIO: " + df.format(getSalario())
                + "\nIR: " + df.format(calcIR()));
    }

    /*Metodo de acesso*/
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the ir
     */
    public double getIr() {
        return ir;
    }

    /**
     * @param ir the ir to set
     */
    public void setIr(double ir) {
        this.ir = ir;
    }

    /**
     * @return the TXIR
     */
    public float getTXIR() {
        return TXIR;
    }

    private String String() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String toStrng() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

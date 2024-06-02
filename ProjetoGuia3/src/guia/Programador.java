
package guia;

import javax.swing.JOptionPane;

public class Programador extends Empregado {
    private int horaExtra;
    private float valorHora, adicional;
    
    public Programador(String nome, int horaExtra, float valorHora){//construtor da subclasse
        super(nome);
        this.horaExtra=horaExtra;
        this.valorHora=valorHora;
    }
    
    @Override
    public void recebe(){
        super.recebe();//acessa o recebe da classe super
        System.out.print("nEntre com as horas trabalhadas:");
        setHoraExtra(sc.nextInt());
        System.out.print("Entre com o valor da Hora Extra: ");
        setValorHora(sc.nextFloat());
    }
    
    /**metodo que calcula o adicional de horas extras*/
    public void calcAdicional(){
        setAdicional(getHoraExtra() * getValorHora());
    }
    
    @Override
    public void mostra(){
        super.mostra();//acessa o mostra da classe super
        JOptionPane.showMessageDialog(null,"\nADICIONAL: "+df.format(getAdicional()));
    }

    /**
     * @return the horaExtra
     */
    public int getHoraExtra() {
        return horaExtra;
    }

    /**
     * @param horaExtra the horaExtra to set
     */
    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    /**
     * @return the valorHora
     */
    public float getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * @return the adicional
     */
    public float getAdicional() {
        return adicional;
    }

    /**
     * @param adicional the adicional to set
     */
    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }

   
}

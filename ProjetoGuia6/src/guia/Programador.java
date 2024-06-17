
package guia;


public class Programador extends Empregado{
    private int horaExtra;
    private float vlorHora,adicional;
    
    public Programador(String nome, int horaExtra, float vlorHora){
        super(nome);
        this.horaExtra=horaExtra;
        this.vlorHora=vlorHora;
        
       
    }
    
    @Override
    public void recebe(){
        super.recebe();
        System.out.print("\nDigite o nº de horas: ");
        setHoraExtra(sc.nextInt());
        System.out.print("Digite o valor de horas extras: ");
        setVlorHora(sc.nextFloat());
    }
    
    public void calcAdicional(){
        setAdicional(getVlorHora() * getHoraExtra());
    }
    
    @Override
    public void bonusSalario(){
        super.aumentaSalario(super.getSalario());
    }
    
    @Override
    public String toString(){
        return(super.toString()+"\nADICIONAL: "+df.format(getAdicional()));
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
     * @return the vlorHora
     */
    public float getVlorHora() {
        return vlorHora;
    }

    /**
     * @param vlorHora the vlorHora to set
     */
    public void setVlorHora(float vlorHora) {
        this.vlorHora = vlorHora;
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

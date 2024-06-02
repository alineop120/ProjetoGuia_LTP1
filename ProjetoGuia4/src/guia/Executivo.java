package guia;


public class Executivo extends Empregado {
    
    private float comisProd;
    
    
    public Executivo(String nome){
        super(nome);
    }  
    
    public void calcProducao(float txpr){
        setComisProd((float)(txpr * getSalario()));
    }
    
    public void bonusSalario(){
        aumentaSalario(getSalario() * 0.04);
    }
    
    public void mostra(){
        super.mostra();
        System.out.println("COMISSÃO PRODUTIVIDADE: "+getComisProd());
    }

    /**
     * @return the comisProd
     */
    public float getComisProd() {
        return comisProd;
    }

    /**
     * @param comisProd the comisProd to set
     */
    public void setComisProd(float comisProd) {
        this.comisProd = comisProd;
    }
    
    

}

package guia;


public class Executivo extends Empregado {
    
    private float comisProd;
    
    
    public Executivo(String nome){
        super(nome);
    }  
    
    public void calcProducao(float txpr){
        setComisProd((float)(txpr * getSalario()));
    }
    
    @Override
    public void bonusSalario(){
        aumentaSalario(getSalario() * 0.04);
    }
    
    @Override
    public String toString(){
        return(super.toStrng()+"\nCOMISSÃO PRODUTIVIDADE: "+getComisProd());
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


package guia;


public class Executivo extends Empregado {//subclasse de Empregado
    private float comisProd;
   
    public Executivo(String nome){//construtor da subclasse
        super(nome);
         
     }
  /** metodo para calcular a comissão de produtivida
     * @param txpr*/
    public void calcProducao(float txpr){
        setComisProd((float)(txpr * getSalario()));//o getsalario acessa o atributo privado 
  } 
  
    @Override
  public void mostra(){
      super.mostra();
      System.out.println("COMISSÃO: "+df.format(getComisProd()));//o getComisProd acessa o atributo privado
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

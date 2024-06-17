
package emp;

import java.util.Scanner;

public class Empresa {
    private String cnpj, nomEmp;
    
   
    public Empresa(String cnpj){
        this.cnpj=cnpj;
       
    }
    
    public void recebe(){
       Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nº do CNPJ: ");
        setCnpj(sc.next());
        System.out.print("Digite o nome da empresa: ");
        setNomEmp(sc.next());
    }
    
    @Override
     public String toString(){
        return("\nCNPJ: "+getCnpj()+"\tEMPRESA: "+getNomEmp());
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the nomEmp
     */
    public String getNomEmp() {
        return nomEmp;
    }

    /**
     * @param nomEmp the nomEmp to set
     */
    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }
     
     
}

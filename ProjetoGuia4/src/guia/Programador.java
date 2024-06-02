
package guia;


public class Programador extends Empregado{
    private int horaExtra;
    private float vlorHora,adicional;
    
    public Programador(String nome, int horaExtra, float vlorHora){
        super(nome);
        this.horaExtra=horaExtra;
        this.vlorHora=vlorHora;
        
       
    }
    
    public void recebe(){
        super.recebe();
        System.out.print("\nDigite o nº de horas: ");
        horaExtra = sc.nextInt();
        System.out.print("Digite o valor de horas extras: ");
        vlorHora = sc.nextFloat();
    }
    
    public void calcAdicional(){
        adicional = vlorHora * horaExtra;
    }
    
    public void bonusSalario(){
        super.aumentaSalario(super.getSalario());
    }
    
    public void mostra(){
        super.mostra();
        System.out.println("ADICIONAL: "+adicional);
    }
}

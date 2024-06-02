
package guia;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

/**
 * ESCOLA TÉCNICA DE BRASÍLIA - ETB
 * CURSO TÉCNICO DE INFORMÁTICA
 * LINGUAGEM TÉCNICA DE PROGRAMAÇÃO 1
 * DATA:08.05.2024
 * @author REGIS LIMA GT GUIA
 * DESENVOLVER A ETAPA 2 DO PROJETO GUIA
 */
public class TesteEmpregado {

   
    public static void main(String[] args) {
      
       
       boolean loop = true;
       Scanner sc = new Scanner(System.in);
       while(loop){
           System.out.println("\nMENU -->");
           System.out.println("1]Programador");
           System.out.println("2]Executivo");
           System.out.println("3]Encerrar");
           System.out.print("Opção: ");
           int op = sc.nextInt();
           switch(op){
               
               case 1:
               Programador prg = new Programador("",0,0);
               prg.recebe();
               prg.calcIR();
               prg.calcAdicional();
               prg.mostra();
               prg.aumentaSalario(300);
               prg.bonusSalario();
                System.out.println("\nDepois do aumento e bonus Programador ->!");
               prg.mostra();
               break;
               case 2:Executivo exe = new Executivo("");//instanciação da classe Empregado
               exe.recebe();
               exe.calcIR();
               exe.calcProducao(0.15f);
               exe.mostra();
               exe.aumentaSalario(500);
               exe.bonusSalario();
               System.out.println("\nDepois do aumento e bonus Executivo->!");
               exe.mostra();
               break;
               case 3:System.out.println("\nEncerrando!");
               System.exit(0);
               break;
               default:System.out.println("\nOpção errada!");
                   
           }
           
       }
       
    }
    
}

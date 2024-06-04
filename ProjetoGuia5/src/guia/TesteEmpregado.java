
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
public class TesteEmpregado
{
    public static void main(String[] args)
    {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while(loop)
        {
            System.out.println("\nMENU -->");
            System.out.println("1]Programador");
            System.out.println("2]Executivo");
            System.out.println("3]Encerrar");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            switch(op)
            {
                case 1:
                    Programador prg = new Programador("",0,0);
                    prg.recebe();
                    prg.calcIR();
                    prg.calcAdicional();
                    System.out.println(prg.toString());
                    prg.aumentaSalario(300);
                    boolean apoPrg = prg.validaApo(20); // valida a aposentadoria
                        if (apoPrg)
                        {
                            prg.bonusSalario();
                        }
                    System.out.println("\nDepois do aumento e bonus Programador ->!");
                    System.out.println(prg.toString());
                    break;
                case 2:
                    Executivo exe = new Executivo(""); //instanciação da classe Empregado
                    exe.recebe();
                    exe.calcIR();
                    exe.calcProducao(0.15f);
                    System.out.println(exe.toString());
                    exe.aumentaSalario(500);
                    boolean apoExe = exe.validaApo(20); // valida a aposentadoria
                        if (apoExe)
                            {
                                exe.bonusSalario();
                            }
                    exe.bonusSalario();
                    System.out.println("\nDepois do aumento e bonus Executivo->!");
                    System.out.println(exe.toString());
                    break;
                case 3:
                    System.out.println("\nEncerrando!");
                    System.exit(0);
                    break;
                default:System.out.println("\nOpção errada!");       
            }  
        }
        
    }
}

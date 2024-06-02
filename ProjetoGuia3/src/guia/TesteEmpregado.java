
package guia;

import java.util.Scanner;

/**
 * ESCOLA TÉCNICA DE BRASÍLIA - ETB CURSO TÉCNICO DE INFORMÁTICA LINGUAGEM
 * TÉCNICA DE PROGRAMAÇÃO 1
 * DATA:22.05.2024
 * @author REGIS LIMA GT GUIA DESENVOLVER A ETAPA 3 DO PROJETO GUIA
 */
public class TesteEmpregado {

    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {

            System.out.println("\nMENU ->");
            System.out.println("1]PROGRAMADOR");
            System.out.println("2]EXECUTIVO");
            System.out.println("3]ENCERRAR");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    Programador prg = new Programador("", 0, 0.0f);//instancia do objeto filho
                    prg.recebe();
                    prg.calcIR();
                    prg.calcAdicional();
                    prg.mostra();
                    break;
                case 2:
                    Executivo exe = new Executivo("");//instancia do objeto filho
                    exe.recebe();
                    exe.calcIR();
                    exe.calcProducao(0.1f);//valor da taxa informado externamente
                    exe.mostra();
                    break;
                case 3:
                    System.out.println("\nPrograma encerrado!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção errada! Volte ao menu.");

            }

        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_poo;

import java.io.IOException;

/**
 *
 * @author Kuik_Car
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Funcionarios func = new Funcionarios("Yago","123ab", "Cortador", 21, "03220310109", "Rua Sebast", "M", (float) 5.800, 1);
        
        /* arq.addFuncionario("Rafael de Carvalho", "senha12", arq.getNextCod(), "Supervisor", "19", "48382166881", "Rua Ana Rosa de Jesus, nº 64", "M", "5200.00", "Ativo", "2");
        
        int x = arq.getCode("Rafael de Carvalho");
        System.out.println(x);
        System.out.println(arq.getSalario(x));
        String[] s = arq.getFuncionario("Rafael de Carvalho");
        for(String sa : s){
            System.out.print(sa+" ; ");
        }*/
    }
    
}

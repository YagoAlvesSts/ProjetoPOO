/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_poo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Kuik_Car
 */
public class Arquivo {
    File f;
    FileReader fr;
    BufferedReader br;
    BufferedWriter bw;
    
    
    public void abrir() throws IOException{
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        bw = new BufferedWriter(new FileWriter(f,true));
    }
    
    public void escrever(String text) throws IOException{
        abrir();
        bw.write(text);
        bw.newLine();
        fechar();
    }
    
    public void fechar() throws IOException{
        bw.close();
        br.close();
        fr.close();
    }
}

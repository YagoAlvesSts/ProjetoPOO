/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_poo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author RafaCarvalho
 */
public class ArquivoFuncionario extends Arquivo{
    public ArquivoFuncionario(String url) throws FileNotFoundException, IOException {
        f = new File(url);
        if(!f.exists()){
            f.createNewFile();
            addFuncionario("ROOT", "admroot", "0", "Admin", "19", "48382166881", "Rua Ana Rosa de Jesus, nº 64", "M", "5200.00", "1", "3");
        }
    }
    
    //Retorna codigo. Se = 0, funcionario não encontrado
    public int getCodeByNome(String nome) throws IOException{
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[0].equalsIgnoreCase(nome))
                return Integer.parseInt(dados[2]);
        }
        fechar();
        return 0;
    }
    
    //INICIO DA ÁREA DE PESQUISA!
    
    public String getNomeByCode(int code) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code){
                res = dados[0];
            }
        }
        fechar();
        return res;
    }
    
    public int getCodeByCode(int code) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code){
                return Integer.parseInt(dados[2]);
            }
        }
        fechar();
        return 0;
    }
    
    public String getSenhaByCode(int code) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code){
                res = dados[1];
            }
        }
        fechar();
        return res;
    }
    
    public String getFuncaoByCode(int code) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code){
                res = dados[3];
            }
        }
        fechar();
        return res;
    }
    
    public String getIdadeByCode(int code) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code){
                res = dados[4];
            }
        }
        fechar();
        return res;
    }
    
    public String getCpfByCode(int code) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code){
                res = dados[5];
            }
        }
        fechar();
        return res;
    }
    
    public String getEndByCode(int code) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code){
                res = dados[6];
            }
        }
        fechar();
        return res;
    }
    
    public String getSexoByCode(int code) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code){
                res = dados[7];
            }
        }
        fechar();
        return res;
    }
    
    public String getSalarioByCode(int code) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code){
                res = dados[8];
            }
        }
        fechar();
        return res;
    }
    
    public String getSitByCode(int code) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code){
                res = dados[9];
            }
        }
        fechar();
        return res;
    }
    
    	public String getNomeByNome(String nome) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[0].equalsIgnoreCase(nome)){
                res = dados[0];
            }
        }
        fechar();
        return res;
    }
    
    public String getSenhaByNome(String nome) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[0].equalsIgnoreCase(nome)){
                res = dados[1];
            }
        }
        fechar();
        return res;
    }
    
    public String getFuncaoByNome(String nome) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[0].equalsIgnoreCase(nome)){
                res = dados[3];
            }
        }
        fechar();
        return res;
    }
    
    public String getIdadeByNome(String nome) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[0].equalsIgnoreCase(nome)){
                res = dados[4];
            }
        }
        fechar();
        return res;
    }
    
    public String getCpfByNome(String nome) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[0].equalsIgnoreCase(nome)){
                res = dados[5];
            }
        }
        fechar();
        return res;
    }
    
    public String getEndByNome(String nome) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[0].equalsIgnoreCase(nome)){
                res = dados[6];
            }
        }
        fechar();
        return res;
    }
    
    public String getSexoByNome(String nome) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[0].equalsIgnoreCase(nome)){
                res = dados[7];
            }
        }
        fechar();
        return res;
    }
    
    public String getSalarioByNome(String nome) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[0].equalsIgnoreCase(nome)){
                res = dados[8];
            }
        }
        fechar();
        return res;
    }
    
    // FIM DA ÁREA DE PESQUISA
    
    public String[] getFuncionarioByNome(String nome) throws IOException{
        String[] res = null;
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[0].equalsIgnoreCase(nome)){
                res = dados;
            }
        }
        fechar();
        return res;
    }
    
    public String[] getFuncionarioByCode(int code) throws IOException{
        String[] res = null;
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code){
                res = dados;
            }
        }
        fechar();
        return res;
    }
    
    public String getNextCod() throws IOException{
        int res =0;
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])>=res){
                res++;
            }
        }
        fechar();
        return String.valueOf(res);
    }
    
    public String getNomeByCpf(String cpf) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[5].equalsIgnoreCase(cpf)){
                res = dados[0];
            }
        }
        fechar();
        return res;
    }

    public String getSenhaByCpf(String cpf) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[5].equalsIgnoreCase(cpf)){
                res = dados[1];
            }
        }
        fechar();
        return res;
    }

    public String getFuncaoByCpf(String cpf) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[5].equalsIgnoreCase(cpf)){
                res = dados[3];
            }
        }
        fechar();
        return res;
    }

    public String getIdadeByCpf(String cpf) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[5].equalsIgnoreCase(cpf)){
                res = dados[4];
            }
        }
        fechar();
        return res;
    }

    public String getCpfByCpf(String cpf) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[5].equalsIgnoreCase(cpf)){
                res = dados[5];
            }
        }
        fechar();
        return res;
    }

    public String getEndByCpf(String cpf) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[5].equalsIgnoreCase(cpf)){
                res = dados[6];
            }
        }
        fechar();
        return res;
    }

    public String getSexoByCpf(String cpf) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[5].equalsIgnoreCase(cpf)){
                res = dados[7];
            }
        }
        fechar();
        return res;
    }

    public String getSalarioByCpf(String cpf) throws IOException{
        String res = "";
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[5].equalsIgnoreCase(cpf)){
                res = dados[8];
            }
        }
        fechar();
        return res;
    }

public String[] getFuncionarioByCpf(String cpf) throws IOException{
        String[] res = null;
        String s;
        abrir();
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(dados[5].equalsIgnoreCase(cpf)){
                res = dados;
            }
        }
        fechar();
        return res;
    }
    
     public void editarSituacao(int code) throws IOException{
        abrir();
        File temp = new File(f.getAbsolutePath()+".temp");
        BufferedWriter tempbw = new BufferedWriter(new FileWriter(temp, true));
        String s;
        
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code)
                dados[9]=String.valueOf(0);
            String linha="";
            for (String dado : dados) {
                linha = linha + dado + ";";
            }
            tempbw.write(linha);
            tempbw.newLine();
            tempbw.flush();
        }
        deletar();
        f.createNewFile();
        abrir();
        BufferedReader tempr = new BufferedReader(new FileReader(temp));
        while((s = tempr.readLine())!=null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        tempr.close();
        tempbw.close();
        temp.delete();
        fechar();
    }
     
     public void editarNome(int code,String novoNome) throws IOException{
        abrir();
        File temp = new File(f.getAbsolutePath()+".temp");
        BufferedWriter tempbw = new BufferedWriter(new FileWriter(temp, true));
        String s;
        
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code)
                dados[0]=novoNome;
            String linha="";
            for (String dado : dados) {
                linha = linha + dado + ";";
            }
            tempbw.write(linha);
            tempbw.newLine();
            tempbw.flush();
        }
        deletar();
        f.createNewFile();
        abrir();
        BufferedReader tempr = new BufferedReader(new FileReader(temp));
        while((s = tempr.readLine())!=null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        tempr.close();
        tempbw.close();
        temp.delete();
        fechar();
    }
    
    public void editarSenha(int code,String novaSenha) throws IOException{
        abrir();
        File temp = new File(f.getAbsolutePath()+".temp");
        BufferedWriter tempbw = new BufferedWriter(new FileWriter(temp, true));
        String s;
        
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code)
                dados[1]=novaSenha;
            String linha="";
            for (String dado : dados) {
                linha = linha + dado + ";";
            }
            tempbw.write(linha);
            tempbw.newLine();
            tempbw.flush();
        }
        deletar();
        f.createNewFile();
        abrir();
        BufferedReader tempr = new BufferedReader(new FileReader(temp));
        while((s = tempr.readLine())!=null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        tempr.close();
        tempbw.close();
        temp.delete();
        fechar();
    }
    
    public void editarFuncao(int code,String novaFuncao) throws IOException{
        abrir();
        File temp = new File(f.getAbsolutePath()+".temp");
        BufferedWriter tempbw = new BufferedWriter(new FileWriter(temp, true));
        String s;
        
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code)
                dados[3]=novaFuncao;
            String linha="";
            for (String dado : dados) {
                linha = linha + dado + ";";
            }
            tempbw.write(linha);
            tempbw.newLine();
            tempbw.flush();
        }
        deletar();
        f.createNewFile();
        abrir();
        BufferedReader tempr = new BufferedReader(new FileReader(temp));
        while((s = tempr.readLine())!=null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        tempr.close();
        tempbw.close();
        temp.delete();
        fechar();
    }
    
    public void editarIdade(int code,String novaIdade) throws IOException{
        abrir();
        File temp = new File(f.getAbsolutePath()+".temp");
        BufferedWriter tempbw = new BufferedWriter(new FileWriter(temp, true));
        String s;
        
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code)
                dados[4]=novaIdade;
            String linha="";
            for (String dado : dados) {
                linha = linha + dado + ";";
            }
            tempbw.write(linha);
            tempbw.newLine();
            tempbw.flush();
        }
        deletar();
        f.createNewFile();
        abrir();
        BufferedReader tempr = new BufferedReader(new FileReader(temp));
        while((s = tempr.readLine())!=null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        tempr.close();
        tempbw.close();
        temp.delete();
        fechar();
    }
    
    public void editarCpf(int code,String novoCpf) throws IOException{
        abrir();
        File temp = new File(f.getAbsolutePath()+".temp");
        BufferedWriter tempbw = new BufferedWriter(new FileWriter(temp, true));
        String s;
        
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code)
                dados[5]=novoCpf;
            String linha="";
            for (String dado : dados) {
                linha = linha + dado + ";";
            }
            tempbw.write(linha);
            tempbw.newLine();
            tempbw.flush();
        }
        deletar();
        f.createNewFile();
        abrir();
        BufferedReader tempr = new BufferedReader(new FileReader(temp));
        while((s = tempr.readLine())!=null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        tempr.close();
        tempbw.close();
        temp.delete();
        fechar();
    }
    
    public void editarEndereco(int code,String novoEndereco) throws IOException{
        abrir();
        File temp = new File(f.getAbsolutePath()+".temp");
        BufferedWriter tempbw = new BufferedWriter(new FileWriter(temp, true));
        String s;
        
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code)
                dados[6]=novoEndereco;
            String linha="";
            for (String dado : dados) {
                linha = linha + dado + ";";
            }
            tempbw.write(linha);
            tempbw.newLine();
            tempbw.flush();
        }
        deletar();
        f.createNewFile();
        abrir();
        BufferedReader tempr = new BufferedReader(new FileReader(temp));
        while((s = tempr.readLine())!=null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        tempr.close();
        tempbw.close();
        temp.delete();
        fechar();
    }
    
    public void editarSexo(int code,String novoSexo) throws IOException{
        abrir();
        File temp = new File(f.getAbsolutePath()+".temp");
        BufferedWriter tempbw = new BufferedWriter(new FileWriter(temp, true));
        String s;
        
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code)
                dados[7]=novoSexo;
            String linha="";
            for (String dado : dados) {
                linha = linha + dado + ";";
            }
            tempbw.write(linha);
            tempbw.newLine();
            tempbw.flush();
        }
        deletar();
        f.createNewFile();
        abrir();
        BufferedReader tempr = new BufferedReader(new FileReader(temp));
        while((s = tempr.readLine())!=null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        tempr.close();
        tempbw.close();
        temp.delete();
        fechar();
    }
    
    public void editarSalario(int code,String novoSalario) throws IOException{
        abrir();
        File temp = new File(f.getAbsolutePath()+".temp");
        BufferedWriter tempbw = new BufferedWriter(new FileWriter(temp, true));
        String s;
        
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code)
                dados[8]=novoSalario;
            String linha="";
            for (String dado : dados) {
                linha = linha + dado + ";";
            }
            tempbw.write(linha);
            tempbw.newLine();
            tempbw.flush();
        }
        deletar();
        f.createNewFile();
        abrir();
        BufferedReader tempr = new BufferedReader(new FileReader(temp));
        while((s = tempr.readLine())!=null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        tempr.close();
        tempbw.close();
        temp.delete();
        fechar();
    }
    
    public void editarNivel(int code,String novoNivel) throws IOException{
        abrir();
        File temp = new File(f.getAbsolutePath()+".temp");
        BufferedWriter tempbw = new BufferedWriter(new FileWriter(temp, true));
        String s;
        
        while((s = br.readLine())!=null){
            String[] dados = s.split(";");
            if(Integer.parseInt(dados[2])==code)
                dados[10]=novoNivel;
            String linha="";
            for (String dado : dados) {
                linha = linha + dado + ";";
            }
            tempbw.write(linha);
            tempbw.newLine();
            tempbw.flush();
        }
        deletar();
        f.createNewFile();
        abrir();
        BufferedReader tempr = new BufferedReader(new FileReader(temp));
        while((s = tempr.readLine())!=null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        tempr.close();
        tempbw.close();
        temp.delete();
        fechar();
    }
    
    //Adicionar construindo a string
    public void addFuncionario(String nome,String senha, String cod, String funcao, String idade, String cpf, String end, String sexo, String salario,String sit, String nivel) throws IOException{
        String s = nome+";"+senha+";"+cod+";"+funcao+";"+idade+";"+cpf+";"+end+";"+sexo+";"+salario+";"+sit+";"+nivel;
        escrever(s);
    }
    
    //Adicionar direto por String
    public void addFuncionario(String s) throws IOException{
        escrever(s);
    }
}

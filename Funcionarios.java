/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_poo;

import java.io.IOException;

/**
 *
 * @author yagoa
 */
public class Funcionarios {
    public String nome;
    public String senha;
    public int cod;
    public String funcao;
    public int idade;
    protected String cpf;
    public String end;
    public String sexo;
    private float salario;
    public int sit;
    public int nivel;
    
    ArquivoFuncionario arqfunc;
    
    public Funcionarios(String Nome,String Senha, String Funcao, int Idade, String CPF, String End, String Sexo, float Salario, int Nivel) throws IOException{
        this.arqfunc = new ArquivoFuncionario("funcionarios.txt");
        this.setSit(1); // funcionário ativo.
        this.nome = Nome;
        this.senha = Senha;
        this.funcao = Funcao;
        this.idade = Idade;
        this.cpf = CPF;
        this.end = End;
        this.sexo = Sexo;
        this.salario = Salario;
        this.nivel = Nivel;
        
        /*Escreve dados do funcionário em arquivo*/
        arqfunc.addFuncionario(this.nome, this.senha , String.valueOf(arqfunc.getNextCod()), this.funcao, String.valueOf(this.idade), this.cpf, this.end, this.sexo, String.valueOf(this.salario), String.valueOf(this.sit), String.valueOf(this.nivel));
    
    }
    
    public String[] consultarFuncNome(String Nome) throws IOException {
        /*LER DADOS DO ARQUIVO*/
        int code = arqfunc.getCodeByNome(Nome);
        
        try{
        if((Integer.parseInt(arqfunc.getSitByCode(code)) == 1) && (arqfunc.getNomeByNome(Nome).equalsIgnoreCase(Nome))){
            //System.out.println(arqfunc.getFuncionarioByNome(Nome));
            return arqfunc.getFuncionarioByNome(Nome);
            
        } 
        } catch (java.lang.NullPointerException exception){
            System.out.println("Nome não encontrado em registros!" + exception);
            //return null;
        }
        return null;
    }
    
    public String[] consultarFuncCPF(String CPF) throws IOException{
       String name = arqfunc.getNomeByCpf(CPF); //pega o nome pelo CPF
        int code = arqfunc.getCodeByNome(name); // Pega o código pelo nome
        
        /*Verifica e retorna dados do funcionário daquele respectivo código*/
        if((Integer.parseInt(arqfunc.getSitByCode(code)) == 1) && (arqfunc.getNomeByCode(code).equalsIgnoreCase(name))){
            return arqfunc.getFuncionarioByCode(code);
        } else{
            return null;
        }
    }
    
    public String[] consultarFuncCod(int Cod) throws IOException{
        int code = arqfunc.getCodeByCode(Cod); // recebe do arquivo o código
        
        if((Integer.parseInt(arqfunc.getSitByCode(code))== 1) && (Cod == code)){
            return arqfunc.getFuncionarioByCode(code);
        } else{
            return null;
        }
    }
    
    public boolean excluirFuncNome( String Nome) throws IOException{
        int code = arqfunc.getCodeByNome(Nome); // recebe do arquivo o código
        
        if((Integer.parseInt(arqfunc.getSitByCode(code))== 1) && (arqfunc.getNomeByNome(Nome).equalsIgnoreCase(Nome))){
            arqfunc.editarSituacao(code); //Funcionário demitido/desativado.
            return true;
            /*ESCREVE NOVA SITUAÇÃO EM ARQUIVO*/
        } else{
            return false;
        }
    }
    
    public boolean excluirFuncCPF( String CPF) throws IOException{
        String name = arqfunc.getNomeByCpf(CPF); //pega o nome pelo CPF
        int code = arqfunc.getCodeByNome(name); // Pega o código pelo nome
        
        /*Verifica e retorna dados do funcionário daquele respectivo código*/
        if((Integer.parseInt(arqfunc.getSitByCode(code)) == 1) && (arqfunc.getNomeByCode(code).equalsIgnoreCase(name))){
            arqfunc.editarSituacao(cod); //Funcionário demitido/desativado.
           return true;
            /*ESCREVE NOVA SITUAÇÃO EM ARQUIVO*/
        } else{
            return false;
        }
    }
    
    
    
    public boolean excluirFuncCod( int Cod) throws IOException{
        /*LER DADOS DO ARQUIVO*/
        if ((this.sit == 1) && (this.cod == Cod)){
            arqfunc.editarSituacao(cod); //Funcionário demitido/desativado.
            return true;/*ESCREVE NOVA SITUAÇÃO EM ARQUIVO*/
        } else{
            return false;
        }
        
    }
    
    public void alterarDados(String NovoNome,String NovaSenha,int Cod, String NovaFuncao, int NovaIdade, String NovoCPF,String NovoEnd, String NovoSexo, float NovoSalario, int NovoNivel) throws IOException{
        /*ALTERAR DADOS DO ARQUIVO*/
        
            arqfunc.editarNome(Cod, NovoNome);
            arqfunc.editarSenha(Cod, NovaSenha);
            arqfunc.editarFuncao(Cod, NovaFuncao);
            arqfunc.editarIdade(Cod, String.valueOf(NovaIdade));
            arqfunc.editarCpf(Cod, NovoCPF);
            arqfunc.editarEndereco(Cod, NovoEnd);
            arqfunc.editarFuncao(Cod, NovaFuncao);
            arqfunc.editarNivel(Cod, String.valueOf(NovoNivel));
            arqfunc.editarSalario(Cod, String.valueOf(NovoSalario));
            arqfunc.editarSexo(Cod, NovoSexo); 
        
    }
    
    
    
    
    public String getNome1() {
        return nome;
    }

    public void setNome1(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getSit() {
        return sit;
    }

    public void setSit(int sit) {
        this.sit = sit;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Funcionarios{" + "nome=" + nome + ", senha=" + senha + ", cod=" + cod + ", funcao=" + funcao + ", idade=" + idade + ", cpf=" + cpf + ", end=" + end + ", sexo=" + sexo + ", salario=" + salario + ", sit=" + sit + ", nivel=" + nivel +  '}';
    }
    
    
}

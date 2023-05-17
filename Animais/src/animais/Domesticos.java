/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author Escola
 */
public abstract class Domesticos {
    
     private String nome;
 private int idade;

    public Domesticos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    
    public String exibirDetalhes() {
        return "Animais Domésticos: " + "nome=" + nome + ", idade=" + idade + '.';
    }
 
}



    
    


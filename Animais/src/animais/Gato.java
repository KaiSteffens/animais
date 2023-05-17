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
public class Gato extends Domesticos{
    private Tipo tipo;

    public Gato(Tipo tipo, String nome, int idade) {
        super(nome, idade);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Gato{" + "tipo=" + tipo + '}';
    }

   
    }

    

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
public class Tigre extends Silvestre{
     private Tipo tipo;

    public Tigre(Tipo tipo, String raça, String habitat) {
        super(raça, habitat);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }



    @Override
    public String mostrarDetalhes() {
        return "" + super.mostrarDetalhes()+ ", tipo=" + tipo + '.';
    }

 
    
}

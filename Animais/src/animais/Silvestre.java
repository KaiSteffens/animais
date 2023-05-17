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
public abstract class Silvestre {
 private String raça;
 private String habitat;

    public Silvestre(String raça, String habitat) {
        this.raça = raça;
        this.habitat = habitat;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

   
    public String mostrarDetalhes() {
        return "Animais Silvestres: " + "ra\u00e7a=" + raça + ", habitat=" + habitat + '.';
    }
 
}
 

  

    


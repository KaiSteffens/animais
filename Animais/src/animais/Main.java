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
public class Main {
    public static void main(String[] args) {
    
        Domesticos cão=new Cachorro(Tipo.CANINO, "Tobi", 10);
        Domesticos gato=new Gato(Tipo.FELINO, "Branquinho", 7);
        Silvestre tigre=new Tigre(Tipo.FELINO, "Tigre siberiano", " florestas de coníferas");
        Silvestre onça=new Onca(Tipo.FELINO, "Onça Pintada", "Floresta Amazônica");
        
        System.out.println(cão.exibirDetalhes());
        System.out.println(gato.exibirDetalhes());
        System.out.println(tigre.mostrarDetalhes());
        System.out.println(onça.mostrarDetalhes());
}
}

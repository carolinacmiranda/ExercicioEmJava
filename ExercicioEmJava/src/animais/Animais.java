/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;
import Classes.*;
/**
 *
 * @author Carol
 */
public class Animais {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Morcego
        Mamiferos morcego = new Mamiferos();
        morcego.setIdade(5);
        morcego.setTamanho(15);
        morcego.setAltura_voo(30);
        morcego.setCor_pelo("preto");
        morcego.som();
        System.out.println("Morcego");
        System.out.println("O Morcego tem "+morcego.getIdade() + " anos");
        System.out.println("Tem "+morcego.getTamanho() + " cm");
        System.out.println("Voa "+morcego.getAltura_voo() + " m");
        System.out.println("Tem pelo "+morcego.getCor_pelo());
        //Vaca
        Mamiferos vaca = new Mamiferos();
        vaca.setIdade(10);
        vaca.setTamanho(100);
        vaca.setCor_pelo("branco");
        System.out.println("");
        System.out.println("Vaca");
        System.out.println("A Vaca tem "+vaca.getIdade() + " anos");
        System.out.println("Tem "+vaca.getTamanho() + " cm");
        System.out.println("Tem pelo "+vaca.getCor_pelo());
        //Galinha
        Aves galinha = new Aves();
        galinha.setIdade(3);
        galinha.setTamanho(20);
        galinha.setCor_pena("vermelha");
        galinha.setAltura_voo(2);
        galinha.som();
        System.out.println("");
        System.out.println("Galinha");
        System.out.println("A Galinha tem "+galinha.getIdade() + " anos");
        System.out.println("Tem "+galinha.getTamanho() + " cm");
        System.out.println("Tem pena "+galinha.getCor_pena());
        System.out.println("Voa "+galinha.getAltura_voo() + " m");
        //Pato
        Aves pato = new Aves();
        pato.setIdade(7);
        pato.setTamanho(20);
        pato.setCor_pena("branca");
        pato.setAltura_voo(4);
        System.out.println("");
        System.out.println("Pato");
        System.out.println("O Pato tem "+pato.getIdade() + " anos");
        System.out.println("Tem "+pato.getTamanho() + " cm");
        System.out.println("Tem pena "+pato.getCor_pena());
        System.out.println("Voa "+pato.getAltura_voo() + " m");
    }
}

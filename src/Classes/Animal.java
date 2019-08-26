package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carol
 */
public class Animal {
    private int idade;
    private int tamanho;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public float getAltura_voo() {
        return altura_voo;
    }

    public void setAltura_voo(float altura_voo) {
        this.altura_voo = altura_voo;
    }
    public enum voa {s,n};
    private float altura_voo;
    public void som() {
        
    }
}

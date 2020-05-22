/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class VetorPar {

    private int[] numero;

    public VetorPar() {
        numero = new int[Integer.parseInt(JOptionPane.showInputDialog("Qual será o tamanho do vetor?"))];
    }

    public void mudarVetor(int n) {
        numero = new int[n];
    }

    public int getNumero(int i) {
        return numero[i];
    }

    public void setNumero(int i, int numero) {
        this.numero[i] = numero;
    }

    public String contarPar() {
        int cp = 0;
        String r = "Quem são os pares\n----------------------\n";

        for (int i = 0; i < getSize(); i++) {
            if (this.numero[i] % 2 == 0) {
                r += (i + 1) + "º " + this.numero[i] + "\n-----------------------\n";
                cp++;
            }
        }
        if (cp == 1) {
            r += "Existe apenas " + cp + " elemento par no vetor";//singular
        } else {
            r += "Existem  " + cp + " elementos pares no vetor";//plural

        }
        return r;
    }

    public int getSize() {
        return numero.length;
    }

    @Override
    public String toString() {
        String r = "Meu Vetor\n";
        for (int i = 0; i < getSize(); i++) {
            r += (i + 1) + "º " + this.numero[i] + "\n";
        }
        return r;

    }

}

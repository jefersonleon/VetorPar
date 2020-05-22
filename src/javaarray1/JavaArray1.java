/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarray1;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class JavaArray1 {

    public static void main(String[] args) {
       int vetor[] = new int[5];
       int i, cp; String resp = "Vetor Completo\n";
       cp=0; String resp1 = "Quem são os pares\n";
       for (i=0; i<vetor.length; i++){
           vetor[i] = Integer.parseInt(JOptionPane. showInputDialog("Digite um valor:"));
           if(vetor[i]%2==0){
               cp++;
               resp1+=(i+1)+"º "+vetor[i]+"\n";
           }
       }
       
        for (i=0; i<vetor.length; i++){
            resp += (i+1)+"º "+vetor[i]+"\n";
        }
        resp+="No vetor existe(m) "+cp +" elementos pares";
         JOptionPane. showMessageDialog(null,resp+"\n"+resp1 );
    }
    
}

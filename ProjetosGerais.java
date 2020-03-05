/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosgerais;

import javax.swing.JOptionPane;

/**
 *
 * @author yanferreira
 */
public class ProjetosGerais {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String num1, num2;
        int n1, n2, soma;
        
        num1 = JOptionPane.showInputDialog("Digite o primeiro número");
        n1 = Integer.parseInt(num1);
        
        num2 = JOptionPane.showInputDialog("Digite o segundo número");
        n2 = Integer.parseInt(num2);
        
        soma = n1+n2;
        
        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
        
    }
    
}

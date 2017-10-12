/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.company;
import javax.swing.JOptionPane ;
/**
 *
 * @author earl
 */
public class Denomination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name, cash, acc ;
        int n1, n2, a, b, c, d, e, f, g, h, i ;
        name = JOptionPane.showInputDialog("Enter your name: ");
        cash = JOptionPane.showInputDialog("Cash on hand: ");
        acc = JOptionPane.showInputDialog("Account No. ");
        n1 = Integer.parseInt(cash);
        n2 = Integer.parseInt(acc);
        
        a = n1/1000;
        b = a/500 ;
        c = b/200;
        d = n1/100;
        e = n1/50;
        f = n1/20;
        g = n1/10;
        h = n1/5;
        i = n1/1;
        
        JOptionPane.showMessageDialog(null,"\nYour Name: " + name + "\nCash on hand: " + cash + "\nAccount No: " + acc + "\nDenomination" + "\n1000 - " + a + "\n500 - " + b + "\n200 - " + c + "\n100 - " + d + "\n50 - " + e + "\n20 - " + f + "\n10 - " + g + "\n5 - " + h + "\n1 - " + i);
    }
    
}


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DavidG
 */
public class TablasR {
 public static void main(String[]args){
       int a;
       TablasMultip F=new TablasMultip();
       a=Integer.parseInt(JOptionPane.showInputDialog(null, "Numero"));
       int b=a;
       F.Multi(a,b);
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DavidG
 */
public class TablasMultip {
    int r=0;
     public void Multi(int n, int a){  
       r++;
       if(r<=10){
          System.out.println(a+"x"+r+"="+n);
          Multi(n+a,a);
       }else{
        if(n==0){
          System.out.println(n+"x"+r+"="+0);
        }
       }
     }
}

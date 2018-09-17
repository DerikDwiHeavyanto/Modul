/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author ASUS
 */
public class TugasPraktikumLanjutan {
   public static void z(){
        int z= 4;
        for (int a=1; a<=5; a++){
           if (a==1 || a==5){
               for (int b=1; b<=5; b++){
                   System.out.print("@");
                   
               }
           }
           else{
               for(int b=1;b<=5; b++){
                   
                  
                   if(b==z){
                       System.out.print("@");
                   }
                   else {
                       System.out.print(" ");
                    }
                   
             }z--;
        }
           System.out.println(" ");
        
    }
}
   public static void o(){
       for(int i=0;i<=3;i++){
           if (i==0 || i==3){
               System.out.println("@@@@");
               
           }else if(i>0 && i<3){
               System.out.println("@  @");
           }
       }
           
       }
          public static void l(){
              for (int i=0;i<=3;i++){
                  if(i==0)
                      System.out.println("@");
                  else if (i==1)
                      System.out.println("@@");
                  else if (i == 2)
                      System.out.println("@@@");
                  else
                      System.out.print("@@@@");
                              
              }
          }
public static void main(String[] args){
    o();
    System.out.println();
    System.out.println();
    System.out.println();
    l();
    System.out.println();
    System.out.println();
    System.out.println();
    z();
}
   }
    
   


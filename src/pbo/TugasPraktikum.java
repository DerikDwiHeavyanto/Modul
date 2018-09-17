/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TugasPraktikum {
    public static void LuasPermukaanBola(){
Scanner masukan= new Scanner(System.in);
System.out.println("Program Untuk Menghitung Luas Permukaan Bola");
System.out.print("Masukan nilai jari jari bola : ");
int r=masukan.nextInt();

//penghitungan
double lp=4*r*r*Math.PI;

System.out.print("Luas Permukaan Lingkaran dengan jari-jari "+r+" adalah : "+lp);
System.out.println();

    }public static void konversisuhu(){
        Scanner masukan= new Scanner(System.in);
        int a= 78;
       
        //penghitungan
        int r= a* 4/5 ;
        int f= a* 9/5 ;
        int k= a* 5/5 ;
        
        System.out.println("Konversi suhu dari 78 C ke ");
        System.out.println("Reamur = "+r+" R");
        System.out.println("farenheit = "+f+" F");
        System.out.println("kelvin = "+k+" K");
        
    }public static void BiodataDiri(){
        Scanner masukan=new Scanner(System.in);
        System.out.println("======Biodata Diri=======");
        System.out.println("Masukan Nama:");
        String a=masukan.next();
        System.out.println("Masukan NIS:");
        int b=masukan.nextInt();
        System.out.println("Masukan Tempat Lahir:");
        String c=masukan.next();
        System.out.println("Masukan Jenis Kelamin:");
        String d=masukan.next();
                System.out.println("Masukan Tanggal Lahir:");
               String g=masukan.next();
        System.out.println("Masukan Alamat di Malang:");
        String e=masukan.next();
        
        System.out.println("Masukan Motto Hidup:");
        String f= masukan.next();
        
        System.out.println("Nama            :"+a);
        System.out.println("NIS             :"+b);
        System.out.println("Tempat Lahir    :"+c);
        System.out.println("Tanggal Lahir   :"+g);
        System.out.println("Jenis Kelamin   :"+d);
        System.out.println("Alamat di Malang:"+e);
        System.out.println("Motto Hidup     :"+f);
        
        
        
        
    }
    
    
    
    public static void main(String[] args){
    Scanner masukan=new Scanner(System.in);
   System.out.println("Menu :");
   System.out.println("1. Luas Permukaan Bola ");
   System.out.println("2. Konversi Suhu ");
   System.out.println("3. Biodata Diri");
   System.out.print("Masukan pilihan Program: ");
   
   int a=masukan.nextInt();
   
   
   switch (a){
       case 1: LuasPermukaanBola();break;
       case 2: konversisuhu();break;
       case 3: BiodataDiri();break;
       default:
   
   }
    
     
    
 }   
}

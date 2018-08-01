/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.Console;
/**
 *
 * @author Indrachelsea
 */
public class NewClass {
    public static void main(String[] args){
     String nama;
        int usia;

        // membuat objek console
        Console con = System.console();

        // mengisi variabel nama dan usia dengan console
        System.out.print("Inputkan nama: ");
        nama = con.readLine();
        System.out.print("Inputkan usia: ");
        usia = Integer.parseInt(con.readLine());

        // mengampilkan isi variabel nama dan usia
        System.out.println("Nama kamu adalah: " + nama);
        System.out.println("Saat ini berusia " + usia + " tahun");
  //String nama; 
  //int usia; 
  //String alamat; 
  //Console code = System.console(); 
  //System.out.print("Inputkan nama anda: "); 
  //nama = code.readLine();
  //System.out.print("Inputkan usia: "); 
  //usia = Integer.parseInt(code.readLine()); 
  //System.out.print("Inputkan alamat anda: "); 
  //alamat = code.readLine(); 
  //System.out.println("Nama kamu adalah: "+nama); 
  //System.out.println("Saat ini berusia: "+usia+" tahun"); 
  //System.out.println("Alamat kamu berada di: "+alamat);
    //}  
}
}


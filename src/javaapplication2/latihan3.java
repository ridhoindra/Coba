/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.*;
import java.io.Console;
/**
 *
 * @author Indrachelsea
 */
public class latihan3 {
    public static void main(String[] args){
    String nama;
    int usia;
    String alamat;
    
    Console con = System.console();
    
    System.out.print("Inputkan nama anda: ");
    nama = con.readLine();
    System.out.print("Inputkan usia: ");
    usia = Integer.parseInt(con.readLine());
    System.out.print("Inputkan alamat anda: ");
    alamat = con.readLine();
    
    System.out.println("Nama kamu adalah: "+nama);
    System.out.println("Saat ini berusia: "+usia+" tahun");
    System.out.println("Alamat kamu berada di: "+alamat);
    
}
}    
            
        
    


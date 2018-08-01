/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Indrachelsea
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    double luas;
int alas, tinggi;
double dAlas,dTinggi;
// mebuat scanner baru
Scanner baca = new Scanner(System.in);
// Input
System.out.println("== Program hitung luas Segitiga ==");
System.out.print ("Input alas: ");
dAlas = baca.nextDouble();
//dAlas=alas;
System.out.print("Input tinggi: ");
dTinggi = baca.nextDouble();
//dTinggi=tinggi;
// proses
luas = Double.valueOf((dAlas * dTinggi) / 2);
// output
System.out.println("Luas = " + luas);
}
}

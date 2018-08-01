/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Indrachelsea
 */
public class Conversion05 {
 public static void main(String [] args){
short s = 9;
int i = 10;
float f = 11.1f;
double d = 12.2;
short x = (short) (s*i);
float y = (float) (f/d);
double z = (double) (x*y);
System.out.println("Nilai x = " +x);
System.out.println("Nilai y = " +y);
System.out.println("Nilai z = " +z);
}
}   


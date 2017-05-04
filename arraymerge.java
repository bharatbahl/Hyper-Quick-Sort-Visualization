/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Arrays;

/**
 *
 * @author adityangt
 */
public class arraymerge {   
   
    static int pp0[],pp1[],pp2[],pp3[];
    public static void main(String args[]){
        
       int p0[] = new int[SendArray9.arr9.length];
       int p1[] = new int[SendArray10.arr10.length];
       int p2[] = new int[SendArray11.arr11.length];
       int p3[] = new int[SendArray12.arr12.length];
       
       for(int i=0;i<SendArray9.arr9.length;i++)
           p0[i] = SendArray9.arr9[i];
       
       
       for(int i=0;i<SendArray10.arr10.length;i++)
           p1[i] = SendArray10.arr10[i];

   
       for(int i=0;i<SendArray11.arr11.length;i++)
           p2[i] = SendArray11.arr11[i];


       for(int i=0;i<SendArray12.arr12.length;i++)
           p3[i] = SendArray12.arr12[i];

       
       
       
       pp0 = new int[p0.length + p1.length];
       System.arraycopy(p0, 0, pp0, 0, p0.length);
       System.arraycopy(p1, 0, pp0, p0.length, p1.length);
       
       pp1 = new int[p2.length + p3.length];
       System.arraycopy(p2, 0, pp1, 0, p2.length);
       System.arraycopy(p3, 0, pp1, p2.length, p3.length);
       
       pp2 = new int[pp0.length + pp1.length];
       System.arraycopy(pp0, 0, pp2, 0, pp0.length);
       System.arraycopy(pp1, 0, pp2, pp0.length, pp1.length);
       
       /*System.out.println("P0");
       for(int i=0;i<pp0.length;i++){
           System.out.println(pp0[i]);
       }
       System.out.println("P1");
       for(int i=0;i<pp1.length;i++){
           System.out.println(pp1[i]);
       }
       System.out.println("P2");
       for(int i=0;i<pp2.length;i++){
           System.out.println(pp2[i]);
       }
       System.out.println("P3");
       for(int i=0;i<pp3.length;i++){
           System.out.println(pp3[i]);
       }*/
    
}}
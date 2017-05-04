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
public class swaparray21 {
    
    
    public static int fnsplitvalue1(int arr[],int med){
        int l = arr.length;
        int i;
        for(i=0;i<l;i++){
            if(arr[i]>med)
                break;
        }
        return i;
    }
   
    static int pp0[],pp1[],pp2[],pp3[];
    public static void main(String args[]){
        
       int p0[] = new int[SendArray5.arr5.length];
       int p1[] = new int[SendArray6.arr6.length];
       int p2[] = new int[SendArray7.arr7.length];
       int p3[] = new int[SendArray8.arr8.length];
       //System.out.println("OUTPUT from swap21");
       for(int i=0;i<SendArray5.arr5.length;i++){
           p0[i] = SendArray5.arr5[i];
           //System.out.println(p0[i]);
       }
       
       //System.out.println("OUTPUT from p1");
       for(int i=0;i<SendArray6.arr6.length;i++){
           p1[i] = SendArray6.arr6[i];
           //System.out.println(p1[i]);
       }
       
       //System.out.println("OUTPUT from p2");
       for(int i=0;i<SendArray7.arr7.length;i++){
           p2[i] = SendArray7.arr7[i];
           //System.out.println(p2[i]);
       }
       
       //System.out.println("OUTPUT from p3");
       for(int i=0;i<SendArray8.arr8.length;i++){
           p3[i] = SendArray8.arr8[i];
           //System.out.println(p3[i]);
       }
       
       int temp;
       if(p0.length%2==0)
           temp = ((p0.length)/2)-1;
       else 
           temp = (p0.length)/2;
       int median1 = p0[(int)(temp)];
       System.out.println("median1 = "+median1);
       
       if(p2.length%2==0)
           temp = ((p2.length)/2)-1;
       else 
           temp = (p2.length)/2;
       int median2 = p2[(int)(temp)];
       System.out.println("median2 = "+median2);
       
       
       int split1 = fnsplitvalue1(p0,median1);
       int split2 = fnsplitvalue1(p1,median1);
       int split3 = fnsplitvalue1(p2,median2);
       int split4 = fnsplitvalue1(p3,median2);
       
       
       int a1[] = Arrays.copyOfRange(p0,0, split1);
       int a2[] = Arrays.copyOfRange(p0,split1, p0.length);
       int a3[] = Arrays.copyOfRange(p1,0, split2);
       int a4[] = Arrays.copyOfRange(p1,split2, p1.length);
       int a5[] = Arrays.copyOfRange(p2,0, split3);
       int a6[] = Arrays.copyOfRange(p2,split3, p2.length);
       int a7[] = Arrays.copyOfRange(p3,0, split4);
       int a8[] = Arrays.copyOfRange(p3,split4, p3.length);
       
       
       
       pp0 = new int[a1.length + a3.length];
       System.arraycopy(a1, 0, pp0, 0, a1.length);
       System.arraycopy(a3, 0, pp0, a1.length, a3.length);
       
       pp1 = new int[a2.length + a4.length];
       System.arraycopy(a2, 0, pp1, 0, a2.length);
       System.arraycopy(a4, 0, pp1, a2.length, a4.length);
       
       pp2 = new int[a5.length + a7.length];
       System.arraycopy(a5, 0, pp2, 0, a5.length);
       System.arraycopy(a7, 0, pp2, a5.length, a7.length);
       
       pp3 = new int[a6.length + a8.length];
       System.arraycopy(a6, 0, pp3, 0, a6.length);
       System.arraycopy(a8, 0, pp3, a6.length, a8.length);
       
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
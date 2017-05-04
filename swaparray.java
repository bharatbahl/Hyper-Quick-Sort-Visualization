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
public class swaparray {
    
    
    public static int fnsplitvalue(int arr[],int med){
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
        int p0[] = new int[SendArray.arr.length];
        int p1[] = new int[SendArray2.arr2.length];
        int p2[] = new int[SendArray3.arr3.length];
        int p3[] = new int[SendArray4.arr4.length];
        //System.out.println("OUTPUT from swap");
       for(int i=0;i<SendArray.arr.length;i++){
           p0[i] = SendArray.arr[i];
           //System.out.println(p0[i]);
       }
            
       //System.out.println("OUTPUT from swap2");
       for(int i=0;i<SendArray2.arr2.length;i++){
           p1[i] = SendArray2.arr2[i];
          // System.out.println(p1[i]);
       }
       System.out.println("OUTPUT from swap3");
       for(int i=0;i<SendArray3.arr3.length;i++){
           p2[i] = SendArray3.arr3[i];
           //System.out.println(p2[i]);
       }
       //System.out.println("OUTPUT from swap4");
       for(int i=0;i<SendArray4.arr4.length;i++){
           p3[i] = SendArray4.arr4[i];
           //System.out.println(p3[i]);
       }
       int temp;
       if(p0.length%2==0)
           temp = ((p0.length)/2)-1;
       else 
           temp = (p0.length)/2;
       int median = p0[(int)(temp)];
       System.out.println(median);
       
       int split1 = fnsplitvalue(p0,median);
       int split2 = fnsplitvalue(p1,median);
       int split3 = fnsplitvalue(p2,median);
       int split4 = fnsplitvalue(p3,median);
       int a1[] = Arrays.copyOfRange(p0,0, split1);
       int a2[] = Arrays.copyOfRange(p0,split1, p0.length);
       int a3[] = Arrays.copyOfRange(p1,0, split2);
       int a4[] = Arrays.copyOfRange(p1,split2, p1.length);
       int a5[] = Arrays.copyOfRange(p2,0, split3);
       int a6[] = Arrays.copyOfRange(p2,split3, p2.length);
       int a7[] = Arrays.copyOfRange(p3,0, split4);
       int a8[] = Arrays.copyOfRange(p3,split4, p3.length);
       
       
       pp0 = new int[a1.length + a5.length];
       System.arraycopy(a1, 0, pp0, 0, a1.length);
       System.arraycopy(a5, 0, pp0, a1.length, a5.length);
       
       pp1 = new int[a3.length + a7.length];
       System.arraycopy(a3, 0, pp1, 0, a3.length);
       System.arraycopy(a7, 0, pp1, a3.length, a7.length);
       
       pp2 = new int[a2.length + a6.length];
       System.arraycopy(a2, 0, pp2, 0, a2.length);
       System.arraycopy(a6, 0, pp2, a2.length, a6.length);
       
       pp3 = new int[a4.length + a8.length];
       System.arraycopy(a4, 0, pp3, 0, a4.length);
       System.arraycopy(a8, 0, pp3, a4.length, a8.length);
       
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
       
       
       /*System.out.println("Split1");
       for(int i=0;i<a1.length;i++){
           System.out.println(a1[i]);
       }
       System.out.println("split1");
       for(int i=0;i<a2.length;i++){
           System.out.println(a2[i]);
       }
       System.out.println("Split2");
       for(int i=0;i<a3.length;i++){
           System.out.println(a3[i]);
       }
       System.out.println("split2");
       for(int i=0;i<a4.length;i++){
           System.out.println(a4[i]);
       }
       System.out.println("Split3");
       for(int i=0;i<a5.length;i++){
           System.out.println(a5[i]);
       }
       System.out.println("split3");
       for(int i=0;i<a6.length;i++){
           System.out.println(a6[i]);
       }
       System.out.println("Split4");
       for(int i=0;i<a7.length;i++){
           System.out.println(a7[i]);
       }
       System.out.println("split4");
       for(int i=0;i<a8.length;i++){
           System.out.println(a8[i]);
       }*/
    
    
}}
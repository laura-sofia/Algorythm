/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication73;

import java.util.*;

/**
 *
 * @author sveta
 */
public class JavaApplication73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Long>lis=new ArrayList<>();
        int tst=1;
        boolean first=true;
        boolean tr=true;
        while(tr){
            
            tr=false;
            long max=0;
            arr.clear();
            lis.clear();
        while (true){
            int a=scn.nextInt();
            if (a==-1)break;
            tr=true;
            long ans=1;
            for (int i=0;i<arr.size();i++){
                if(arr.get(i)>a)ans=Math.max(ans, lis.get(i)+1);
            }
            lis.add(ans);
            arr.add(a);
            max=Math.max(max, ans);
        }
        if (!tr)break;
        if (!first)System.out.println();
            else first=false;
        System.out.println("Test #"+tst+":\n maximum possible interceptions: "+max);
        tst++;
       // System.out.println();

        }
    }
    
}

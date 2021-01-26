import java.util.Scanner;

/**
 *
 * @author sveta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a;
        String s;
        while(true){
            
            try{
                s=scn.nextLine();
            //a=scn.nextInt();n(
             }catch(Exception e){break;};
             if (s.isEmpty())break;
             a=Integer.parseInt(s);
             //ways=new int[a+1][6];
             long res=asd(a,0);
             if (res==1)System.out.println("There is only 1 way to produce "+a+" cents change.");
             else System.out.println("There are "+res+" ways to produce "+a+" cents change.");
             
        }
        
    }
    public static int[] coins=new int[]{50,25,10,5,1};
    public static long[][] ways=new long[30001][6];
    public static long asd(int price, int j){
        
        if (price<0)return 0;
        if (price==0)return 1;
        
        if (ways[price][j]>0)return ways[price][j];
        long ans=0;
        for (int i=j;i<5;i++){
            
            ans+=asd(price-coins[i],i);
            
        }
        return ways[price][j]=ans;
    }
    
    
}
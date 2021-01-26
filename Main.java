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
            //a=scn.nextInt();
             }catch(Exception e){break;};
             if (s.isEmpty())break;
             a=Integer.parseInt(s);
             //ways=new int[a+1][6];
             System.out.println(asd(a,0));
        }
        
    }
    public static int[] coins=new int[]{50,25,10,5,1};
    public static int[][] ways=new int[8000][6];
    public static int asd(int price, int j){
        
        if (price<0)return 0;
        if (price==0)return 1;
        
        if (ways[price][j]>0)return ways[price][j];
        int ans=0;
        for (int i=j;i<5;i++){
            
            ans+=asd(price-coins[i],i);
            
        }
        return ways[price][j]=ans;
    }
    
}
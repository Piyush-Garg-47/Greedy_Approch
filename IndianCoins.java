import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        System.out.println(" indian coins ");
        Integer coins[]={1,2,5, 2000,500 , 100 , 50 ,20 , 10 };
        Arrays.sort(coins , Comparator.reverseOrder());
        int CountOfCoins = 0;
        int amount =973; 
       ArrayList<Integer> ans = new ArrayList<>(); 
       for (int i =0 ; i<coins.length;i++){
        if(coins[i]<=amount){
           while( coins[i]<=amount){
            CountOfCoins++;
            ans.add(coins[i]);
            amount -=coins[i]; 
           }
               }
       }
       System.out.println(" total amoutn of coins is = "+ CountOfCoins);
       for(int i=0; i <ans.size(); i++){
        System.out.print(ans.get(i)+" , ");
       }
       System.out.println();
    }
}

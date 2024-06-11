import java.util.*;
public class MaxiumLengthPair {
    public static void main(String[] args) {
        System.out.println("maxium lenght pair ");
        int pairs [][]={{5,24}, {39,60}, {5,28} , {27 , 40} ,{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int chainlength = 1;
        int ChainEnd= pairs[0][1];
         for (int i =0; i<pairs.length; i++){
            if(pairs[i][0] > ChainEnd){
                chainlength++;
                ChainEnd =pairs[i][1]; 
            }
         }
         System.out.println(" maxium chian lenght ="+ chainlength);
    }
}

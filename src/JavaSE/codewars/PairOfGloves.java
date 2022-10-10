package JavaSE.codewars;

import java.util.HashMap;
import java.util.Map;

public class PairOfGloves {
    public static void main(String[] args) {
        System.out.println(numberOfPairs(new String[]{}));
        System.out.println(numberOfPairs(new String[]{"red","red"}));
        System.out.println(numberOfPairs(new String[]{"red", "green", "blue"}));
        System.out.println(numberOfPairs(new String[]{"gray", "black", "purple", "purple", "gray", "black"}));
        System.out.println(numberOfPairs(new String[] {"red", "green", "blue", "blue", "red", "green", "red", "red", "red"}));
    }

    private static int numberOfPairs(String[] gloves){
        int numberOfPairs = 0;
        Map<Integer,Integer> checked = new HashMap<>();

        for(int i = 0 ; i < gloves.length-1 ; i++){
            for(int r = i + 1; r <= gloves.length-1 ; r++){
                if(checked.containsValue(i)|| checked.containsValue(r)){
                    continue;
                }
                if(gloves[i].equals(gloves[r])){
                    checked.put(i,i);
                    checked.put(r,r);
                    numberOfPairs++;
                }
            }
        }
        return numberOfPairs;
    }
}

package JavaSE.exOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExOne {
    public static void main(String[] args) {
        File file = new File("/Users/egorsverchkov/Desktop/JavaDev/JavaSE/JavaSE/src/JavaSE/exOne","01.txt");
        try(Scanner sc = new Scanner(file)){
            String str = sc.nextLine();
            int result = 0;
            for(char symbol : str.toCharArray()){
                if(symbol == '('){
                    result++;
                } else {
                    result--;
                }
            }
            System.out.println("Result is: " + result);
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}

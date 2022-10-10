package JavaSE.exFour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExFour {
    public static void main(String[] args) {
        File file = new File("/Users/egorsverchkov/Desktop/JavaDev/JavaSE/JavaSE/src/JavaSE/exFour", "04.txt");
        try (Scanner sc = new Scanner(file)) {
            String original = sc.nextLine();


            List<Character> originalList = new ArrayList<>();

            for(char s : original.toCharArray()){
                originalList.add(s);
            }

            int counter = 0;
            while(counter < 50000) {
                for (int i = 0; i < originalList.size() - 1; i++) {
                    if (originalList.get(i).toString().equalsIgnoreCase(originalList.get(i + 1).toString())) {
                        if (originalList.get(i) != originalList.get(i + 1)) {
                            originalList.remove(i + 1);
                            originalList.remove(i);
                            counter++;
                        }
                    }
                }
                if(originalList.size() == 9295){
                    System.out.println(originalList.size());
                    break;
                }
                System.out.println(originalList.size());
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


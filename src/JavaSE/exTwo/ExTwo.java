package JavaSE.exTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExTwo {
    public static void main(String[] args) {
        File file = new File("/Users/egorsverchkov/Desktop/JavaDev/JavaSE/JavaSE/src/JavaSE/exTwo","02.txt");
        int result = 0;
        try(Scanner sc = new Scanner(file)){
            while(sc.hasNextLine()){
                List<Integer> sides = new ArrayList<>();

                String st = sc.nextLine();
                String[] numsOfShape = st.split("x");
                for (String s : numsOfShape) {
                    sides.add(Integer.parseInt(s));
                }

                int l = sides.get(0);
                int w = sides.get(1);
                int h = sides.get(2);
                int box = 2*l*w+2*w*h+2*h*l;

                Collections.sort(sides);
                int first = sides.get(0);
                int second = sides.get(1);
                int abs = box + first * second;
                result = result + abs;
            }
            System.out.println(result);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}

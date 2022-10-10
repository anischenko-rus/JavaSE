package JavaSE.exThree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ExThree {

    public static void main(String[] args) {
        File file = new File("/Users/egorsverchkov/Desktop/JavaDev/JavaSE/JavaSE/src/JavaSE/exThree","03.txt");
        try (Scanner sc = new Scanner(file)) {
            ScPosition sp = new ScPosition();
            List<ScPosition> positionHouse = new ArrayList<>();
            String map = sc.nextLine();

            positionHouse.add(sp);
            int house = 1;
            for(char c : map.toCharArray()){
                if(c == '>'){
                    ScPosition newSantaPos  = new ScPosition(positionHouse.get(positionHouse.size() - 1).getX(),positionHouse.get(positionHouse.size() - 1).getY());
                    newSantaPos.goRight();
                    if(!positionHouse.contains(newSantaPos)){
                        house = house + 1;
                        positionHouse.add(newSantaPos);
                    } else {
                        positionHouse.add(newSantaPos);
                    }
                }

                if(c == '<'){
                    ScPosition newSantaPos  = new ScPosition(positionHouse.get(positionHouse.size() - 1).getX(),positionHouse.get(positionHouse.size() - 1).getY());
                    newSantaPos.goLeft();
                    if(!positionHouse.contains(newSantaPos)){
                        house = house + 1;
                        positionHouse.add(newSantaPos);
                    } else {
                        positionHouse.add(newSantaPos);
                    }
                }

                if(c == '^'){
                    ScPosition newSantaPos  = new ScPosition(positionHouse.get(positionHouse.size() - 1).getX(),positionHouse.get(positionHouse.size() - 1).getY());
                    newSantaPos.goUp();
                    if(!positionHouse.contains(newSantaPos)){
                        house = house + 1;
                        positionHouse.add(newSantaPos);
                    } else {
                        positionHouse.add(newSantaPos);
                    }
                }

                if(c == 'v'){
                    ScPosition newSantaPos  = new ScPosition(positionHouse.get(positionHouse.size() - 1).getX(),positionHouse.get(positionHouse.size() - 1).getY());
                    newSantaPos.goDown();
                    if(!positionHouse.contains(newSantaPos)){
                        house = house + 1;
                        positionHouse.add(newSantaPos);
                    } else {
                        positionHouse.add(newSantaPos);
                    }
                }
            }
            System.out.println(house);



        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}


class ScPosition{
    public ScPosition(){
        this.x = 0;
        this.y = 0;
    }
    public ScPosition(int x,int y){
        this.x = x;
        this.y = y;
    }
    private int x;
    private int y;

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void goLeft(){
        x = x - 1;
    }

    public void goRight(){
        x = x + 1;
    }

    public void goUp(){
        y = y + 1;
    }

    public void goDown(){
        y = y - 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScPosition that = (ScPosition) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "SantaPosition{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


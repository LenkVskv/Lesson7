package Lesson7;



/**
 * Created by Olenkaa on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Pair<String , Integer> pair= new Pair<>("Gryshevskogo",17);
        Integer i = pair.getLeft();
        String s = pair.getRight();
        System.out.println(i);
        System.out.print(s);


    }
}

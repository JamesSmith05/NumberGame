import java.util.Objects;
import java.util.Random;
import java.util.Scanner;



public class Main {

    public static Random rand = new Random();
    public static Scanner input = new Scanner(System.in);
    public static String[] nameStorage;

    public static void main(String[] args) {

    }

    public static String[] arrayMaker(){
        String nameStorage[] = new String[rand.nextInt(10)];
        return nameStorage;
    }

    public static String[] playerGuess(){
        System.out.println("where would you like to guess? ");
        int temp = input.nextInt();
        if (Objects.equals(nameStorage[temp],"Comp")||Objects.equals(nameStorage[temp],"Player")){
            System.out.println("Aww shucks");
        }
        return nameStorage;
    }
}

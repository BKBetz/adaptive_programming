package Sorter;
import java.util.Random;
import java.util.ArrayList;

public class ListGenerator {
    private ArrayList random_list = new ArrayList();

    public void setRandom_list(int size, int list_size) {
        Random random = new Random();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int x = 1; x <= list_size; x++) {
            StringBuffer code = new StringBuffer();
            for(int y = 1; y <= size; y++) {
                int rand_int = random.nextInt((letters.length())+ 0);
                char value = letters.charAt(rand_int);
                code.append(Character.toString(value));
            }
            random_list.add(code);
        }
    }

    public ArrayList getRandom_list() {
        return random_list;
    }
}

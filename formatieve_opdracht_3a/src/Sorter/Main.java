package Sorter;

public class Main {
    public static void main(String[] args) {
        ListGenerator rand_list = new ListGenerator();
        rand_list.setRandom_list(1,20);
        System.out.println(rand_list.getRandom_list());
    }
}

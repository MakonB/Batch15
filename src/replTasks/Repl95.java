package replTasks;

import java.util.Scanner;

public class Repl95 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        for (char i = start; i <= end; ++i) {
            System.out.print(i);

        }

    }
}
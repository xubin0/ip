import java.util.Scanner;
public class xb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello, I am xb!");
        System.out.println("What is your name?");
        String name = s.nextLine();
        System.out.print(name);
        System.out.println(", what can I do for you?");

        System.out.println("Bye. Hope to see you again soon!");
        s.close();

    }
}

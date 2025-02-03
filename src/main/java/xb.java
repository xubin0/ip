import java.util.Scanner;

public class xb {
    public static void main(String[] args) {
        String[] list = new String[100];
        Scanner s = new Scanner(System.in);
        System.out.println("Hello, I am xb!");
        System.out.println("What is your name?");
        String name = s.nextLine();
        System.out.print(name);
        System.out.println(", what can I do for you?(\"bye\" to exit, \"list\" to show list)");
        String echo;
        int itemCount = 0;
        while (true) {
            echo = s.nextLine();
            if (echo.equals("bye")) {
                break;
            }
            if (echo.equals("list")) {
                for (int i = 0; i < itemCount; i++) {
                    System.out.println((i + 1) + ". " + list[i]);
                }
                continue;
            }
            System.out.println("added: " + echo);
            list[itemCount] = echo;
            itemCount++;
        }

        System.out.println("Bye. Hope to see you again soon!");
        s.close();
    }
}

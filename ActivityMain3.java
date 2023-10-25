import java.util.*;

class ActivityMain3 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        print("Enter how many racket: ");
        int size = scn.nextInt();
        Racket[] racket = new Racket[size];
        int loop;
        for (loop = 0; loop < racket.length; loop++) {
            racket[loop] = new Racket();
        }
        println("");
        for (loop = 0; loop < racket.length; loop++) {
            int num = loop + 1;
            println("");
            System.out.print("Brand of the racket " + num + ":");
            String space = scn.nextLine();
            racket[loop].setBrand(scn.nextLine());
            println("");
            System.out.print("Category " + num + ":");
            racket[loop].setCategory(scn.nextLine());
            println("");
            System.out.print("Price " + num + ":");
            racket[loop].setPrice(scn.nextInt());
        }
        println("");
        System.out.println("\n");
        System.out.println("Entered racket:");
        for (loop = 0; loop < racket.length; loop++) {
            racket[loop].display();
        }
        println("");
        feedback n = new feedback();
        print("Enter your name: ");
        scn.nextLine();
        n.setName(scn.nextLine());
        print("Enter Feedback: ");
        String da = scn.nextLine();
        println("");
        n.f(da);

    }

    public static void print(Object a) {
        System.out.print(a);
    }

    public static void println(Object a) {
        System.out.println(a);
    }
}
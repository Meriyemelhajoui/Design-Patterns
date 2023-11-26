package Singleton;

public class main {
    public static void main(String[] args) {
       Journal j1= Journal.getInstance();
       Journal j2=Journal.getInstance();
        // Check if j1 and j2 refer to the same instance
        if (j1 == j2) {
            System.out.println("Singleton pattern works, both instances are the same.");
        } else {
            System.out.println("Singleton pattern failed, instances are different.");
        }


    }
}

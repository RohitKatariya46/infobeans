package assignment_6;

public class Practice_16 {

    public static void main(String[] args) {
        int a = 97;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) a + " ");
                a++;
            }
            System.out.println();
        }
    }
}

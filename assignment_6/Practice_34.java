package assignment_6;

public class Practice_34 {

    public static void main(String[] args) {
        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
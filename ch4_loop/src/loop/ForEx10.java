package loop;

// *
// **
// ***
// ****
// *****

public class ForEx10 {
    public static void main(String[] args) {

        for (int j = 5; j > 0; j--) {
            if (j > 1) {
                System.out.print(" ");

            } else {
                System.out.print("*");
            }
        }
        System.out.println();

        for (int j = 5; j > 0; j--) {
            if (j > 2) {
                System.out.print(" ");

            } else {
                System.out.print("*");
            }
        }
        System.out.println();

        for (int j = 5; j > 0; j--) {
            if (j > 3) {
                System.out.print(" ");

            } else {
                System.out.print("*");
            }
        }
        System.out.println();

        for (int j = 5; j > 0; j--) {
            if (j > 4) {
                System.out.print(" ");

            } else {
                System.out.print("*");
            }
        }
        System.out.println();

        for (int j = 5; j > 0; j--) {
            if (j > 5) {
                System.out.print(" ");

            } else {
                System.out.print("*");
            }
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > 5; j--) {
                // if (j > i) {
                // System.out.println(" ");
                // } else {
                // System.out.println("*");
                // }
                System.out.println(j > i ? " " : "*");
            }
            System.out.println();
        }

    }

}

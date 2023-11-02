package PatternPrgms;

public class StarPattern {
    public static void main(String[] args) {
        int size = 5; // Specify the size of the pattern
        
        // Loop to print the plus pattern
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == size / 2 + 1 || i == size / 2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
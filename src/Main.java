import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arry1[][] = new int[2][4];
        int arry2[][] = new int[2][4];
 
        System.out.println("first array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arry1[i][j] = sc.nextInt();
            }
        }
 
        System.out.println("second array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arry2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", arry1[i][j] * arry2[i][j]);
            }
            System.out.println();
        }
    }
}
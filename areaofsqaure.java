import java.util.Scanner;

public class areaofsqaure {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int side = sc.nextInt();
            int area = side * side;
            System.out.println(area);
        }
    }    
}

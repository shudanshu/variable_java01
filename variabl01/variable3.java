import java.util.*;
public class variable3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float pencil = sc.nextFloat();
            float pen = sc.nextFloat();
            float eraser = sc.nextFloat();
            float total = pencil + pen + eraser;
            System.out.println(total);
            System.out.println("18% tax:" + total);
        }
    }
}

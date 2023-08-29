import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args) {
        float base, height, area;
        System.out.println("Enter base of triangle");
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        System.out.println("Enter height of triangle");
        height = sc.nextFloat();
        area = (base * height) / 2;
        System.out.println("Area of the triangle is " + area);
    }
}

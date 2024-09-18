import java.util.*;

public class area_circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float r = sc.nextFloat();
        float PI = sc.nextFloat();

        float area = PI*r*r;
        System.out.println(area);
    }
}

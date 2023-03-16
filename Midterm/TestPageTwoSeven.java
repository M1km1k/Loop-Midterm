import java.util.*;

public class TestPageTwoSeven{

public static void main(String[] args) {
 
 int n;
 
 Scanner get = new Scanner(System.in);
 
 System.out.print("Enter the value of n: ");
 
 n = get.nextInt();
 
 PageTwoSeven p = new PageTwoSeven(n);
 p.display();



}
}
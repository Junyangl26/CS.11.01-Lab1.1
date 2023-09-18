import java.util.Scanner;
public class Pages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Question 2: Pages, Please enter your age: ");
        int z= scanner.nextInt();
        System.out.print ("Pages: " + page(z));
    }
    public static int page (int n) {return (int) ((100-n));}

}

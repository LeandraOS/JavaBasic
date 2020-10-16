import java.util.Scanner;

public class Hello {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    scan.close();
    System.out.println("Hello " + name);
  }
}

import java.util.Scanner;

public class switchcase {
  public static void main(String[] args) {
    System.out.println("switch case in java");
    Scanner scanner = new Scanner(System.in);
    int day = scanner.nextInt();
    // 
    switch(day){
      case 1:
        System.out.println("The day is saturday");
        break; // if i don't use break then all the case will be printed
      case 2:
      System.out.println("The day is sunday");
        break;
      case 3:
      System.out.println("The day is monday");
        break;
      case 4:
      System.out.println("The day is tuesday");
        break;
      case 5:
      System.out.println("The day is wednesday");
        break;
      case 6:
      System.out.println("The day is thursday");
        break;
      case 7:
      System.out.println("The day is friday");
        break;
      // default case
      default:
        System.out.println("The day you entered is not valid");
    }
    scanner.close();
  }
}

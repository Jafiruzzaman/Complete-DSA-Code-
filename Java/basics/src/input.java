import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    System.out.println("java inputs");
    // to take input you must have to import Scanner class
    Scanner sc = new Scanner(System.in);
    // byte
    System.out.println("Enter the byte value ");
    byte byteValue = sc.nextByte();
    System.out.println("The value is "+byteValue);
    // short
    System.out.println("Enter the short value ");
    short shortValue = sc.nextShort();
    System.out.println("The value is "+shortValue);

    // int
    System.out.println("Enter the int value ");
    int intValue = sc.nextInt();
    System.out.println("The value is "+intValue);

    // float
    System.out.println("Enter float value");
    float floatValue = sc.nextFloat();
    System.out.println("The value is "+floatValue);

    // long
    System.out.println("Enter the long value ");
    long longValue = sc.nextLong();
    System.out.println("The value is "+longValue);
    
    // double
    System.out.println("Enter double value");
    double doubleValue = sc.nextDouble();
    System.out.println("The value is "+doubleValue);

    // next
    System.out.println("Enter the first name");
    String charValue = sc.next();
    System.out.println("The value is "+charValue);

    // nextLine
    System.out.println("Enter full name");
    String fullName = sc.nextLine();
    System.out.println("The value is "+fullName);
    sc.close();
  }
}

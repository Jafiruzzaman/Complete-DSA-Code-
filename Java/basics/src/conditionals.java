public class conditionals {
    public static void main(String[] args) {
        System.out.println("conditionals in java");
        int age = 90;
//        if-else statement
        if (age>= 18){
            System.out.println("You are eligible to drive");
        }else
            System.out.println("you aren't eligible to drive");

//        if-elseif-else statement
        if (age<1){
            System.out.println("your age is not valid");
        } else if (age>=18 || age<=50) {
            System.out.println("your are adult now");
        }else if (age>80) {
            System.out.println("your are senior citizen");
        }else {
            System.out.println("Your age is out of range ");
        }
    }
}

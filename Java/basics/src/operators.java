public class operators {
  public static void main(String[] args) {
    System.out.println("Operators in java");
    // * 1. assignment operator
    int numOne =  10;
    // plus equals to(+=)
    numOne+=5;
    // minus equals to(-=)
    numOne-=2;
    // times equals to(*=)
    numOne*=2;
    // divide equals to(/=)
    numOne/=2;
    // modulo equals to(%=)
    numOne%=2;
    int numTwo = 20;
    // * 2. arithmetic operators are 
    // plus(+)
    System.out.println("the sum of 20 + 10 is "+(numOne+numTwo));
    // minus(-)
    System.out.println("the sum of 20 - 10 is "+(numOne-numTwo));
    // times(*)
    System.out.println("the sum of 20 * 10 is "+(numOne*numTwo));
    // divide(/)
    System.out.println("the sum of 20 / 10 is "+(numOne/numTwo));
    // modulo(%)
    System.out.println("remainder of  20 % 10 is "+(numTwo%numTwo));

    //  * 3. relational operator
    // greater than(>)
    System.out.println("is 20 > 10 is it true or false : "+(numTwo>numOne));
    // less than(<)
    System.out.println("is 20 < 10 is it true or false : "+(numTwo<numOne));
    // double equals to(==)
    System.out.println("is 20 == 10 is it true or false : "+(numTwo==numOne));
    // greater than or equal(>=)
    System.out.println("is 20 >= 10 is it true or false : "+(numTwo>=numOne));
    // less than or equal(<=)
    System.out.println("is 20 <= 10 is it true or false : "+(numTwo<=numOne));
    // not equals to(!=)
    System.out.println("is 20 == 10 is it true or false : "+(numTwo!=numOne));

    // * 4 logical operator

    // logical and (&&)
    System.out.println(numTwo>numOne || numTwo !=numOne);
    // logical or (||)
    System.out.println(numTwo>numOne && numTwo !=numOne);
    // logical not (!)
    System.out.println(!true);
    // * 5 bitwise operator
    // logical bitwise and (&)
    int a = 7;
    System.out.println(a&1);
    // logical bitwise or (|)
    System.out.println(a|1);
    // * 6. unary operator
    // increment
    int num = 10;
      // 1 prefix-increment
      ++num;
      // 2 postfix-increment
      num++;
    // decrement
      // 1 prefix-decrement
      --num;
      // 2 postfix-decrement
      num--;
      System.out.println(num);
  }
}

/*
 * Operators in java
 * 1. assignment operator
 * 2. arithmetic operator
 * 3. relational operator
 * 4. logical operator
 * 5. bitwise operator
 */
public class loop {
  public static void main(String[] args) {
    System.out.println("Loops in java");
    // for loop
    // syntax
    /*
     * for(initialization,condition,updation){
     * // code
     * }
     */
    System.out.println("using for loop");
    for(int i =0; i<=10;i++){
      System.out.println(i);
    }
    System.out.println("using while loop");
    // while loop
    /* 
    * initialization 
    * while(condition){
    * code
    * updation
    * }
    */
    int i = 0;
    while (i<=10) {
      System.out.println(i);
      i++; // if i don't increment then it will be an infinite loop
    }
    // do-while loop 

    /*
      do-while loop run atleast one time
     * syntax
     * do{
     * code
     * updation
     * }while(condition);
     */
    System.out.println("using do-while loop");
    do {
      System.out.println(i);
      i++;
    } while (i<=10);
    // for-each loop [use for array]
  }
}

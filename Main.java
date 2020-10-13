import java.util.Scanner;
/**
 * Take an exam percentage as a parameter and print out the associated letter grade
 * @ Gavin Sandhar 
 */
public class Main {
  // prints exam grade to screen
  public static void examGrade(int grade){
    // calculate grade and tell user
    if(grade < 50){
      System.out.println("Your grade is F");
    }
    if (grade > 50 && grade < 59){
      System.out.println("Your grade is D");
    }
    if (grade > 60 && grade < 69){
      System.out.println("Your grade is C");
    }
    if (grade > 70 && grade < 79){
      System.out.println("Your grade is B");
    }
    if (grade > 80){
      System.out.println("Your grade is A");
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // input scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user what their exam score was
    System.out.println("What was your exam grade");
    int grade = input.nextInt();

    examGrade(grade);
    
    
  }
}

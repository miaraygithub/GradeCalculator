import java.util.Scanner; //We're gonna need user input, better import scanner
public class GradeCalculator { //naming this program (class) GradeCalculator as instructed
       public static void main(String[] args) { //The big cahoona, the main method
           double userGrade; //This double is to store the user percentage input
           String userLetter; //This string is to store the user letter grade
           Scanner sc = new Scanner(System.in); //Scanner item named sc

           System.out.println("Please enter your grade: "); //Prompt user for their percentage grade
           userGrade = sc.nextDouble(); //scan for the next double and save it in userGrade
           sc.nextLine(); //deleting any leftovers from that input line

           if (userGrade >= 92) { //test if userGrade is 92 or above
               userLetter = "A."; //Assign letter grade to userLetter
           } else if (userGrade >= 89 && userGrade < 92) { //test if userGrade is between 89 and 92 (not inclusive on the upper bound)
               userLetter = "A-."; //Assign letter grade to userLetter
           } else if (userGrade >= 87 && userGrade < 89) { //test if userGrade is the range for B+
               userLetter = "B+."; //etc I dont want to keep typing the same thing over and over
           } else if (userGrade >= 82 && userGrade < 87) { //test if userGrade is in the range for B...
               userLetter = "B."; //etc
           } else if (userGrade >= 79 && userGrade < 82) { //etc...
               userLetter = "B-."; //etc
           } else if (userGrade >= 77 && userGrade < 92) { //etc...
               userLetter = "C+.";
           } else if (userGrade >= 72 && userGrade < 77) {
               userLetter = "C.";
           } else if (userGrade >= 69 && userGrade < 72) {
               userLetter = "C-.";
           } else if (userGrade >= 67 && userGrade < 69) {
               userLetter = "D+.";
           } else if (userGrade >= 60 && userGrade < 67) {
               userLetter = "D.";
           } else if (userGrade >= 0 && userGrade < 60) { //etc.
               userLetter = "F."; //etc.
           } else { //if the percentage is below zero:
               userLetter = "below zero, please enter a valid grade percentage."; //print error message
           }
       System.out.println("Your grade is " + userLetter); //print out the message with the user letter grade (or error message)
       }
}

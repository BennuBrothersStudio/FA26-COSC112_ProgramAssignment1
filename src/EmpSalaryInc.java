// import libraries
import java.util.Scanner;

public class EmpSalaryInc {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        // Declare variables
        String lastName, firstName;
        double currentSalary, percentagePayIncrease, newSalary;

        // Prompt for and read the employee's name
        System.out.print("Enter last name: ");
        lastName = cin.nextLine();

        System.out.print("Enter first name: ");
        firstName = cin.nextLine();

        // Get the salary and the percentage pay increase
        System.out.print("Enter current salary: ");
        currentSalary = cin.nextDouble();

        System.out.print("Enter percentage pay increase: ");
        percentagePayIncrease = cin.nextDouble();

        // Calculate the new salary
        newSalary = currentSalary + (currentSalary * percentagePayIncrease / 100);

        // Display the results
        System.out.println();
        System.out.println("Last name: " + lastName);
        System.out.println("First name: " + firstName);
        System.out.printf("Current salary: $%.2f%n", currentSalary);
        System.out.printf("Percentage pay increase: %.2f%%%n", percentagePayIncrease);
        System.out.printf("New salary: $%.2f%n", newSalary);

        cin.close();
    }
}

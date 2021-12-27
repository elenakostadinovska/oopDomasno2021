import java.util.Scanner;



   import java.util.Scanner;

    public class Glavna {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.print("Enter your First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter your last Name: ");
            String lastName = sc.nextLine();

            System.out.println("Your Info:\nAge: " + age + "\nFull Name: " + firstName + " " + lastName);
        }

    }
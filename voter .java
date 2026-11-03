import java.util.Scanner;

class Voter {
    public static void main(String[] args) {

        Scanner obj1 = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = obj1.nextLine();

        System.out.print("Enter the age: ");
        int age = obj1.nextInt();

        System.out.println("The name of the voter is " + name);
        System.out.println("The age of the voter is " + age);

        if (age >= 18) {
            System.out.println(name + " is eligible to vote");
        } else {
            System.out.println(name + " is not eligible to vote");
        }
    }
}
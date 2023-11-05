import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public void getUserAge() {
        String age;
        do {
            System.out.println("Please provide your age: ");
            age = scanner.nextLine();
        } while (!age.chars().allMatch(Character::isDigit));
        System.out.println("Your age is:" + age);
    }

    public int userInputInteger(String userInformation, String errorInformation) {
        boolean isInteger = false;
        int age = 0;
        do {
            try {
                System.out.println(userInformation);
                age = this.scanner.nextInt();
                isInteger = true;
            } catch (InputMismatchException exception) {
                System.out.println(errorInformation);
            }
        } while (!isInteger);
        return age;
    }

}

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input some input:");
        String input = scanner.nextLine();
        System.out.println("You entered:" + " " + input);

        boolean notNumeric = StringUtils.isNumeric(input);
        if (notNumeric) {
            System.out.println("This is a number");
        } else {
            System.out.println( input + " " + "is not a number");
        }

        System.out.println("Flipped case:" + " " + StringUtils.swapCase(input));

        System.out.println("Reversed:" + " " + StringUtils.reverse(input));

    }

}

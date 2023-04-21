import java.util.*;

class InvalidSymbol extends Exception {
    InvalidSymbol(String msg) {
        super(msg);
    }
}

class InvalidInputRange extends Exception {
    InvalidInputRange(String msg) {
        super(msg);
    }
}

class MaxMultiplierReachedException extends Exception {
    @Override
    public String getMessage() {
        return "Please Make Sure Your Input Is Less Than 7000";
    }
}

public class Exercise_6 {
    public static void main(String args[]) {
        // You have to create a custom calculator with following operations:
        // 1. + -> Addition
        // 2. - -> Subtraction
        // 3. * -> Multiplication
        // 4. / -> Division
        // which throws the following exceptions:
        // 1. Invalid input Exception ex: 8 & 9
        // 2. Cannot divide by 0 Exception
        // 3. Max Input Exception if any of the inputs is greater than 100000
        // 4. Max Multiplier Reached Exception - Don't allow any multiplication input to
        // be greater than 7000

        Scanner sc = new Scanner(System.in);

        int a, b;
        String op;

        while (true) {
            try {
                System.out.println("\nEnter Number : ");
                a = sc.nextInt();

                if (a > 100000) {
                    throw new InvalidInputRange("Invalid Input Range 100000");
                }

                System.out.println("\nEnter Number : ");
                b = sc.nextInt();

                if (b > 100000) {
                    throw new InvalidInputRange("Invalid Input Range 100000");
                }

                sc.nextLine();

                System.out.println("\n\nSelect The Operation : \n + \n - \n * \n \\ \n :::: ");
                op = sc.nextLine();

                switch (op) {
                    case "+" -> {
                        System.out.println("\n\n" + a + " + " + b + " = " + (a + b));
                    }
                    case "-" -> {
                        System.out.println("\n\n" + a + " - " + b + " = " + (a - b));
                    }
                    case "*" -> {

                        if (a > 7000) {
                            throw new MaxMultiplierReachedException();
                        } else if (b > 7000) {
                            throw new MaxMultiplierReachedException();
                        }

                        System.out.println("\n\n" + a + " * " + b + " = " + (a * b));
                    }
                    case "/" -> {
                        System.out.println("\n\n" + a + " / " + b + " = " + (a / b));
                    }
                    default -> {
                        throw new InvalidSymbol("Invalid Symbol Try Again");
                    }
                }
                break;

            } catch (InputMismatchException e) {
                System.out.println("Please Enter valid input");
                sc.next();
            } catch (InvalidInputRange e) {
                System.out.println(e);
            } catch (InvalidSymbol e) {
                System.out.println(e);
            } catch (ArithmeticException e) {
                System.out.println("Cannot Divide By Zero");
            } catch (MaxMultiplierReachedException e) {
                System.out.println(e);
            }
        }

    }

}

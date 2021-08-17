import services.Calculator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Initializing");
        
        Calculator calculator = new Calculator();

        Integer sumResult = calculator.addition(5, 3);
        Integer minusResult = calculator.subtraction(20, 10 );
        Integer multiResult = calculator.multiplication(2, 2);
        Integer diviResult = calculator.division(50, 2 );

        System.out.println("Addition: " + sumResult);
        System.out.println("Subtraction: " + minusResult);
        System.out.println("Multiplication: " + multiResult);
        System.out.println("Division: " + diviResult);
    
        System.out.println("Finishing");
    }
}

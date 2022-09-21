import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print("Введите первое число: ");
            calc.setA(input.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setSign(input.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setB(input.nextInt());

            System.out.println(calc.getA() + " " + calc.getSign() + " " + calc.getB() 
                    + " = " + calc.getResult());
            
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
        } while(!input.nextLine().equals("no"));
    }
}
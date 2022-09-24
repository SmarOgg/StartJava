import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean answerNo = false;
        boolean answerYes = false;

        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);;
        
        do {
            System.out.print("Введите первое число: ");
            calc.setA(input.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setSign(input.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setB(input.nextInt());

            System.out.println(calc.getA() + " " + calc.getSign() + " " + calc.getB() 
                    + " = " + calc.calculate());

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                String answer=input.next();
                switch (answer) {
                    case "yes":
                        answerYes = true;
                        break;
                    case "no":
                        answerNo = true;
                        break;
                }
            } while (!(answerYes ^ answerNo));

            answerYes = false;
        } while (!answerNo);
    }
}
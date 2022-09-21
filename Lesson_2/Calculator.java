public class Calculator {
    private int a;
    private int b;
    private char sign;
    private int result;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

    public int getResult() {
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                for (int i = 1; i <= b; i++, result *= a);
                break;
            case '%':
                result = a % b;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }

    public Calculator() {
        a = 0;
        b = 0;
        sign = '+';
        result = 0;
    }
}
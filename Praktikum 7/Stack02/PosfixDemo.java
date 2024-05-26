package Stack02;
public class PosfixDemo {
    public static void main(String[] args) {
       String infix = "5*4^(1+2)%3";
       System.out.println("infix: " + infix);
       String postfix = konversi(infix);
       System.out.println("Postfix: " + postfix);
       double result = evaluatePostfix(postfix);
        System.out.println("Result: " + result);
    }

    public static boolean isOperand(char c){
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')
                || (c >= '0' && c <= '9') || c == ' ' || c == '.' );
    }

    public static boolean isOperator(char c) {
        return (c == '^' || c == '%' || c == '*' || c == '-' || c == '+');
    }

    public static int getDerajat(char c){
        switch (c) {
            case '^' :
                return 3;
            case '%' :
                return 2;
            case '/' :
                return 2;
            case '*' :
                return 2;
            case '-' : 
                return 1;
            case '+' :
                return 1;
            default :
                return 0;
        }
    }

    public static String konversi(String infix) {
        Stack operator = new Stack(infix.length());
        String postfix = "";
        char c;

        for (int i = 0; i < infix.length(); i++){
            c = infix.charAt(i);

            if (isOperand(c)) {
                postfix = postfix + c;
            } else if (c == '(') {
                operator.push(c);
            } else if (c == ')') {
                while (operator.peek() != '(') { 
                    postfix = postfix + operator.pop();
                }
                
                operator.pop();
            }
            else if (isOperator(c)){
                while (!operator.isEmpty() && getDerajat(operator.peek()) >= getDerajat(c)){
                    postfix = postfix + operator.pop();
                }

                operator.push(c);
            }
        }

        while (!operator.isEmpty()) {
            postfix += operator.pop();
        }

        return postfix;
    }    

    public static double evaluatePostfix(String postfix) {
        Stack operands = new Stack(postfix.length());

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (isOperand(c)) {
                operands.push(c);
            } else if (isOperator(c)) {
                double operand2 = Character.digit(operands.pop(), 10);
                double operand1 = Character.digit(operands.pop(), 10);
                double result = performOperation(operand1, operand2, c);
                operands.push((char) result);
            }
        }

        return operands.pop();
    }

    private static double performOperation(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                return operand1 / operand2;
            case '%':
                if (operand2 == 0) {
                    throw new ArithmeticException("Modulo by zero!");
                }
                return operand1 % operand2;
            case '^':
                return Math.pow(operand1, operand2);
            default:
                throw new IllegalArgumentException("Invalid operator!");
        }
    }
}
    

    


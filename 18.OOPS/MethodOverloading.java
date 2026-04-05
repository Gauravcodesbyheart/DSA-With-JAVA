public class MethodOverloading {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        int result1 = calc.sum(2, 3);
        System.out.println(result1+" is the result of the sum of the two given numbers.");
        int result2=calc.sum(2, 3, 4);
        System.out.println(result2+" is the result of the sum of the three given numbers.");
        float result3=calc.sum(((float) 2.4), ((float) 3.6));
        System.out.println(result3+" is the result of the sum of the two given numbers.");
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float c, float d) {
        return c + d;
    }
}

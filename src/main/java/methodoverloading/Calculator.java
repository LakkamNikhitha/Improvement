package methodoverloading;

class Calculator {
    int add(int a, int b) {

        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double sub(double a,double b){
        return a-b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10.5, 20.5));
        System.out.println(calc.sub(10.5,5.5));
    }
}

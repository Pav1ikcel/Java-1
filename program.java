/*public class Main {
    public static void main(String[] args) {
        int n = 5; // Здесь можно указать нужное значение n
        
        int triangularNumber = calculateTriangularNumber(n);
        System.out.println("n-ое треугольное число для n = " + n + " равно: " + triangularNumber);
        
        long factorial = calculateFactorial(n);
        System.out.println("Факториал для n = " + n + " равен: " + factorial);
    }
    
    // Метод для вычисления n-ого треугольного числа
    public static int calculateTriangularNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    // Метод для вычисления факториала числа n
    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
*/


/*public class Main {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 1000:");
        printPrimeNumbers(1, 1000);
    }
    
    // Метод для проверки, является ли число простым
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    // Метод для вывода всех простых чисел в заданном диапазоне
    public static void printPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
*/




/*import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result = 0;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: недопустимая операция!");
                return;
        }
        
        System.out.println("Результат: " + result);
    }
}
*/
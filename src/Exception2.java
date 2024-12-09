import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Неправильный ввод. Введите допустимое целое число");
        } catch (ArithmeticException e) {
            System.out.println("Введите ненулевое целое число");
        } catch (InputMismatchException e){
            System.out.println("Введите целое число");
            myScanner.next(); 
        } finally {
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        Exception2 ex = new Exception2();
        ex.exceptionDemo();
    }
}
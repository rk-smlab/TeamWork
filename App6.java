import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class App6 {

  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int len = getNumberByUser("Введите количество элементов ");
    }
  public static int getNumberByUser(String text) {
    System.out.print(text);
    return input.nextInt();
  }
}

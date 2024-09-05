import java.util.Scanner;

public class Divider {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double[] numb = new double[11];
        System.out.println("Enter 11 numbers");
        for (int i =0; i < 11; i++){
            numb[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += numb[i];
        }
        double result = sum / numb[10];
        System.out.println("Results of dividing sum of first 10 numbers by the eleventh number: "+ result);
        scanner.close();
    }
}

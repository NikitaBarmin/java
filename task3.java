import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = 0;
        int n = 0;
        double answer = 0.0;
        System.out.println("Введите число, возводимое в степень");

        if (scanner.hasNextInt()) {
            x = scanner.nextInt();

            System.out.println("Введите целую степень от -15 до 15");

            if (scanner.hasNextInt()) {
                n = scanner.nextInt();

                if ((n > 15) || (n < -15)) {
                    System.out.println("Введены некорректные данные степени");
                    System.exit(0);
                }
            } else {
                System.out.println("Введите целые числа в качестве значений!");
                scanner.next();
            }
        }
        else {
            System.out.println("Введите целые числа в качестве значений!");
            scanner.next();
        }

        if(n == 0) {
            System.out.println("Ответ: 1");
        }
        if(n < 0){
            n+=1;
            answer = (1.0/x);
            while(n != 0){
                answer = answer / x;
                n +=1;
            }

        }
        if(n > 0) {
            answer = x;
            n -=1;
            while(n != 0){
                answer = answer * x;
                n -=1;
            }
        }

        System.out.println("Ответ:" + answer);
        scanner.close();
    }
}
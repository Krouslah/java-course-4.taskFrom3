
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String l = read();
        String[] array = split(l);
        int number = parse(array[1]);
        int sum = calculation(number);
        if (check(array[1]))
            System.out.print("Здарвствуй " + array[0] + "!" + " " + "Сумма цифр в числе = " + result(sum));
        else System.out.print("Проверьте, что введенные данные соответствуют условию задачи");
    }
    public static String read() {
        Scanner src = new Scanner(System.in);
        return src.nextLine();
    }

    public static String[] split(String l) {
        return l.split(" ");
    }

    public static boolean check(String l) {
        boolean pass;
        int number = Integer.parseInt(l);
        pass = number / 100 != 0 && number / 100000 == 0;
        return pass;
    }

    public static int calculation(int number) {
        int total;
        if (number==0)
            return 0;
        total = number%10;
        return total + calculation(number/10);
    }
    public static int parse (String l) {
        return Integer.parseInt(l);
    }
    public static String result (int sum){
        return switch (sum) {
            case 1 -> "один";
            case 2 -> "два";
            case 3 -> "три";
            case 4 -> "четыре";
            case 5 -> "пять";
            case 6 -> "шесть";
            case 7 -> "семь";
            case 8 -> "восемь";
            case 9 -> "девять";
            case 10 -> "десять";
            default -> String.valueOf(sum);
        };
    }
}
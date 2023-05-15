import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class level2 {

    public static void main(String[] args) {
    Adding();
    Num();
    Dreieck();
    shop();
    }
    //Алгоритм для нахождения суммы всех положительных чисел в массиве
    public static int Adding(){
        int[] add = {-22, 34, 28, -89, 4, 36, -12, -90, -3, 56, 78};
        int amount = 0;
        for (int number : add){
            if (number > 0){
                amount += number;
            }
        }
        return amount;
    }

    //Среднее арифметическое чисел из массива
    public static int Num(){
        int[] numbers = {34, 28, 4, 36, 56, 78};
        int amount = 0;
        for (int number : numbers){
            amount += number;
        }
        double Numms = amount / numbers.length;
        return (int) Numms;
    }

    //Уровень 2

    public static String Dreieck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый каттет");
        int K1 = scanner.nextInt();
        System.out.println("Введите второй каттет");
        int K2 = scanner.nextInt();
        System.out.println("Введите гипотинузу");
        int G = scanner.nextInt();

        int AmountOfKatets = K1 + K2;

        if (AmountOfKatets < G){
            System.out.println("Это треугольник");
        }else{
            System.out.println("Это не треугольник");
        }
        return null;
    }

    public static String shop(){
        int money = 1000;
        int pricePizza = 230;
        int priceGum = 26;
        double priceCandy = 2.5;

        int howManyPizza = money % pricePizza;
        double avaibleMoneyAfterBuyingPizza = money - (howManyPizza * pricePizza);

        int howManyGum = (int) (avaibleMoneyAfterBuyingPizza % priceGum);
        double avaibleMoneyAfterBuyingGum = avaibleMoneyAfterBuyingPizza - (howManyGum * priceGum);

        int howManyCandy = (int) (avaibleMoneyAfterBuyingGum % priceCandy);
        double change = avaibleMoneyAfterBuyingGum - (howManyCandy * priceCandy);

        System.out.println("Вы купили " + howManyPizza + " пицц.");
        System.out.println( "Вы купили " + howManyGum + " жувачек.");
        System.out.println("Вы купили " + howManyCandy + " конфет.");
        System.out.println("Ваша сдача " + change + " гривен.");

        return null;
    }
}

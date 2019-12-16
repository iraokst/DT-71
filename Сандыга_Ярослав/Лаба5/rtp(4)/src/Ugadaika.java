import java.util.Scanner;
import java.lang.Math;

public class Ugadaika {
    public static void main(String[] args) {

        int UnknownNumber, UserNumber, TrysCount = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("ЗАДАЧА: Угадать число (от 0 до 100).");

        UnknownNumber = (int)Math.floor(Math.random() * 100);

        do {
            TrysCount++;

            System.out.print("Введите ваше число: ");

            UserNumber = input.nextInt();

            if (UserNumber > UnknownNumber) {
                System.out.println("Моё число меньше. Попробуйте в диапазоне [" + (UnknownNumber) + "," + (UserNumber-UnknownNumber) + "]"  );

            }
            else if (UserNumber < UnknownNumber)
                System.out.println("Моё число больше. Попробуйте в диапазоне ["+ UserNumber+","+(100-UnknownNumber+UserNumber)+"]");

            else
                System.out.println("Вы угадали!");

        } while (UserNumber != UnknownNumber);

        System.out.println("Количество попыток: " + TrysCount);

    }
}
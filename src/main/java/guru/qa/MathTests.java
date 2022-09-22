package guru.qa;

public class MathTests {
    public static void main(String[] args) {

       /*
       1. Поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
       */

        byte tByte1 = 127;      // 8 бит (-128 / 127)
        byte tByte2 = 2;      // 8 бит (-128 / 127)
        short tShort1 = 32761;  // 16 бит (-32768 / 32767)
        short tShort2 = 7;  // 16 бит (-32768 / 32767)
        int tInt = 1613;       // 4 байта (2147483648 / 2147483647)
        double tDouble = 22.4; // 8 байт  (от ±4.9*10^-324 до ±1.7976931348623157*10^308)
        float tFloat = 2.7f;   // 4 байта -3.4*10^38 до 3.4*10^38

        // Переполнение для byte и short
        System.out.println("Переполнение для byte и short");
        System.out.println(tByte1 + tByte2);
        System.out.println(tShort1 + tShort2);

        //Попытка присвоить значение больше границы диапазона
        //byte tByte = 128;

        // Метематические операторы + - * / %
        System.out.println("Метематические операторы");
        System.out.println(tInt + 7);
        System.out.println(tDouble - 2);
        System.out.println(tDouble / 4);
        System.out.println(tInt * 10);
        System.out.println(tDouble % 6);

        //  Логические операторы > < >= <= == != !
        System.out.println("Логические операторы");
        System.out.println(22 > 2 && 6 <= 3); // false
        System.out.println(1 > 8 || 12 >= 12); // true
        System.out.println((2 * 5 == 40 / 2) && (7 % 2 == 3 / 2)); // false

        // Условный оператор
        System.out.println("Условный оператор");
        int number = 4;
        if(number < 5) {
            System.out.println("Число меньше, чем 5");
        } else if (number > 5) {
            System.out.println("Чилсо больше, чем 5");
        } else {
            System.out.println("Число равно 5");
        }

       /*
       2. Попробовать вычисления комбинаций типов данных (int и double)
       */
        System.out.println("Вычисления комбинаций типов данных (int и double)");
        int integer_test = 66;
        double double_test = 22.6;

        System.out.println(integer_test + double_test);
        System.out.println(integer_test - double_test);
        System.out.println(integer_test / double_test);
        System.out.println(integer_test * double_test);
        System.out.println(integer_test % double_test);
    }
}

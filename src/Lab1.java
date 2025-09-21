public class Lab1 {

    // =========== Задание 1 ==========

    //Задача №1: нахождение дробной части числа
    public double fraction(double x) {
        return Math.abs(x % 1.0);
    }

    //Задача №3: преобразование символа в соответствующее число
    public int charToNum(char x) {
        return (int) x - 48;
    }

    //Задача №5: проверка числа на двузначность
    public boolean is2Digits(int x) {
        return (x % 100 - x % 10 != 0 && x / 100 == 0);
    }

    //Задача №7: проверка на вхождение в указанный диапазон
    public boolean isInRange(int a, int b, int num) {
        return (a <= num & num <= b || a >= num & num >= b);
    }

    //Задача №9: проверка на равенство всех 3 чисел
    public boolean isEqual(int a, int b, int c) {
        return (a == b & a == c);
    }

    // =========== Задание 2 ==========
    //Задача №1: найти модуль числа
    public int abs(int x) {
        return x >= 0 ? (x) : (-x);
    }

    //Задача №3: вывести true - если x делится на 3 или 5, false - если оно делится и на 3, и на 5
    public boolean is35(int x) {
        return (x % 3 == 0 ^ x % 5 == 0);
    }

    //Задача №5: найти максимальное из 3 чисел
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    //Задача №7: найти сумму чисел x и y, вывести 20 если сумма попадает в диапазон от 10 до 19
    public int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    //Задача №9: вывести день недели из соответствующего числа
    public String day(int x) {
        return switch (x) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Это не день недели";
        };
    }

    // =========== Задание 3 ==========

    //Задача №1: вывести все числа от 0 до x включительно
    public String listNums(int x) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            s.append(i);
            s.append(" ");
        }
        return s.toString();
    }

    //Задача №3: вывести все четные числа от 0 до x включительно
    public String chet(int x) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            s.append(i);
            s.append(" ");
        }
        return s.toString();
    }

    //Задача №5: количество знаков в числе
    public int numLen(long x) {
        x = Math.abs(x);

        if (x == 0) return 1;

        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    //Задача №7: квадрат из звёздочек
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Задача №9: правосторонний треугольник из звёздочек
    public void rightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (x - i - 1 <= j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    // =========== Задание 4 ==========
}


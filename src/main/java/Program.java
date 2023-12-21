import java.util.*;

public class Program {

    private static Random random = new Random();

    /*
    Задача:
    1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    2. Создайте метод, в который передайте заполненный выше массив и с помощью Set
    вычислите процент уникальных значений в данном массиве
    и верните его в виде числа с плавающей запятой.
    Для вычисления процента используйте формулу:
    процент уникальных чисел = количество уникальный чисел * 100 / общее количество чисел в массиве.
     */
    private static void task1() {
        Integer[] array = new Integer[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 25);
        }
        processArray(array);
    }

    private static void processArray(Integer[] array) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(array));
        System.out.println("% уникальных чисел: " + (double) hashSet.size() * 100 / array.length);
    }

    private static void task2() {

        String str1 = "Hello!";
        String str2 = "GeekBrains";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        int size = random.nextInt(10, 21);
        System.out.println("Общее количество элементов: " + size);
        System.out.print("Случайные числа: ");
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(-9, 10);
            System.out.print(number + " ");
            hashSet.add(number);
            linkedHashSet.add(number);
            treeSet.add(number);
        }
        System.out.println();
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
    public static void main(String[] args) {

        task1();
        task2();

        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 5);
        fraction1.setDenominator(3);
        Fraction fraction3 = fraction1.plus(fraction2);
        Fraction fraction4 = Fraction.plus(fraction1, fraction2);

        System.out.println(fraction1);
        System.out.println(fraction2);
        System.out.println(fraction1 + " + " + fraction2 + " = " + fraction3);
        System.out.println(fraction1 + " + " + fraction2 + " = " + fraction4);

        HashSet<Fraction> hashSet1 = new HashSet<>();
        hashSet1.add(new Fraction(3, 4));
        hashSet1.add(new Fraction(1, 2));
        hashSet1.add(new Fraction(4, 5));
        hashSet1.add(new Fraction(-3, 12));
        hashSet1.add(new Fraction(3, 4));
        hashSet1.add(new Fraction(3, 4));

        System.out.println(hashSet1);

        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(3, 4);

        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());

        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
    }
}

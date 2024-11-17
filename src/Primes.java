public class Primes {

    public static void main(String[] args) {

        // Перебираем числа от 2 до 100 включительно

        for (int i = 2; i < 100; i++) {

            if (isPrime(i)) {  // Проверяем, является ли число простым

                System.out.println(i); // Выводим простое число

            }

        }

    }

    // Метод для определения, является ли число простым

    public static boolean isPrime(int n) {

        // Проверяем делимость на числа от 2 до sqrt(n)

        for (int i = 2; i < n; i++) {

            if (n % i == 0) { //остаток от деления на i

                return false; // Если n делится на i, то оно не простое

            }

        }

        return true; // Если делителей не найдено, то число простое

    }

}

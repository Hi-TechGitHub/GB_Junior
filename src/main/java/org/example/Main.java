package org.example;


import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double average = numbers.stream()
                .filter(num -> num % 2 == 0) // оставляем только четные числа
                .mapToInt(Integer::intValue) // преобразуем Integer в int
                .average() // вычисляем среднее значение
                .orElse(0); // если список пустой, то возвращаем 0
        System.out.println("Среднее значение всех четных чисел: " + average);
    }
}
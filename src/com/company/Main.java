package com.company;

import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static Math RandomStringUtils;

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число цифр для строки. Минимум - 60");
        int n = in.nextInt();
        in.close();

        GeneratorInt gi = new GeneratorInt(n);

        String randStringOfInt = gi.generate();

        char[] zeroToNine = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (char c: zeroToNine) {
            // Сколько % (percent) составляет число n1 от числа n2 (с округлением до меньшего целого)
            long n1 = randStringOfInt.chars().filter(num -> num == c).count();
            long n2 = randStringOfInt.length();
            long percent = (int) (((n1 * 100) / n2) + 0);
            System.out.println("Цифра - " + c + ". Встречается - " + n1 + " раз. " + "Это - " + percent + " %");
        }

    }
}

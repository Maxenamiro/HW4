package com.gmail.maxenamiro;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

	// Дан массив целых чисел вида — {0,5,2,4,7,1,3,19}.
	// Написать программу для подсчета количества нечетных чисел в нем

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
			} else {
				n++;
			}
		}

		System.out.println(n + " не парних чисел");

		System.out.println("------------------------------");
		// Написать код для возможности создания массива целых чисел
		// (размер вводиться с клавиатуры) и возможности заполнения каждого
		// его элемента вручную. Выведите этот массив на экран.

		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть довжину масиву");
		int length = scan.nextInt();
		int array[] = new int[length];
		System.out.println("Введіть елементи масиву");
		for (int i = 0; i < length; i++) {
			array[i] = scan.nextInt();
		}
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();

		System.out.println("-------------------------------");
		// Создать массив случайных чисел (размером 15 элементов).
		// Создайте второй массив в два раза больше, первые 15 элементов
		// должны быть равны элементам первого массива, а остальные
		// элементы заполнить удвоенных значением начальных. Например:
		// Было → {1,4,7,2}
		// Стало → {1,4,7,2,2,8,14,4}

		int[] masiv = new int[15];
		int[] masiv2 = new int[30];

		for (int i = 0; i < masiv.length; i++) {
			masiv[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(masiv));

		for (int i = 0; i < masiv.length; i++) {
			masiv2[masiv.length + i] = 2 * masiv[i];
		}
		System.arraycopy(masiv, 0, masiv2, 0, 15);
		System.out.println(Arrays.toString(masiv2));
	}
}

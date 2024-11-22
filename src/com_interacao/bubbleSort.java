package com_interacao;

import java.util.Scanner;

public class bubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao nosso ordenador de listas.\nDigite quantos elementos a sua lista posue: ");
        int elementos = sc.nextInt();
        int[] lista = new int[elementos];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Digite o elemento " +(i + 1) +" da sua lista. ");
            int valor = sc.nextInt();
            lista[i] = valor;
        }
        System.out.println("A sua lista ordenada ficou: ");
        bubbleSort(lista);
        for (int ordenado: lista) {
            System.out.println(ordenado);
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give the length of the array :");
        int nr = sc.nextInt();
        int [] arr = new int[nr];

        for (int i=0; i <nr; i++){
            System.out.print(" Give elemnt " + i + " of the array: ");
            int elem = sc.nextInt();
            arr[i]=elem;
        }
        System.out.println(" Your array is : ");
        for (int i : arr){
            System.out.print(i + "  ");
        }

        //int[] arr1= {4, 5, 6, 6, 7, 6, 6, 1};  length=8;
        countNoOfGirls(arr);
    }


    public static void countNoOfGirls ( int array[])
    {
        int nr = 0;
        for (int roll : array) {
            if (roll != 6)
                nr++;
        }

        //daca pe ultima pozitie avem 6 atunci secventa este invalida
        if (array[array.length - 1] == 6) {
            nr = -1;
            System.out.println();
            System.out.println("The sequence is invalid");
        }
        System.out.println();
        System.out.println(" The number of girls is: " + nr);
    }
}
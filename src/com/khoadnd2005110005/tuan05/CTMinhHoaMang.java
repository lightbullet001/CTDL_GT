package com.khoadnd2005110005.tuan05;

public class CTMinhHoaMang {
    public static void main(String[] args) {
    int arr[] = {3,5,7,9};
    int n = arr.length;
    int newElement = 8;
    int [] newArr = new int[n + 5];
    for(int i = 0; i < n; i ++){
        newArr[i] = arr[i];
    }
    System.out.println("In mang cu");
    for(int x : arr){
        System.out.println(x);
    }
    newArr[n] = newElement;
    System.out.println("In mang moi");
    for(int x : newArr){
        System.out.println(x);
    }
}
}
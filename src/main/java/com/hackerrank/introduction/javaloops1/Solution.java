package com.hackerrank.introduction.javaloops1;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d x %d = %d\n", n, i, n * i);
    }
  }
}

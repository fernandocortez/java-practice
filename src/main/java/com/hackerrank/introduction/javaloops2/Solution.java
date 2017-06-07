package com.hackerrank.introduction.javaloops2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);
    final int t = in.nextInt();

    final ArrayList<Integer> series = new ArrayList<>();

    for (int i = 0; i < t; i++) {
      series.clear();

      final int a = in.nextInt();
      final int b = in.nextInt();
      final int n = in.nextInt();

      for (int exp = 0; exp < n; exp++) {
        final int term = expansion(a, b, exp);
        series.add(term);
      }

      for (int term : series) {
        System.out.printf("%d ", term);
      }
      System.out.println();
    }

    in.close();
  }

  private static int expansion(int a, int b, int exp) {
    if (exp < 1) {
      return a + b;
    }
    return (int) Math.pow(2, exp) * b + expansion(a, b, exp - 1);
  }
}

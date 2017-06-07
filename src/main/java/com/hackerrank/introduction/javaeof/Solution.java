package com.hackerrank.introduction.javaeof;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i = 0;
    while (sc.hasNext()) {
      i++;
      final String line = sc.nextLine();
      System.out.println(i + " " + line);
    }
  }
}

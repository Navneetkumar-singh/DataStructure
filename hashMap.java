package com.cN.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class hashMap {
	public static ArrayList<Integer> removeduplicates(int ar[]) {

		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			if (map.containsKey(ar[i])) {
				continue;
			}
			list.add(ar[i]);
			map.put(ar[i], true);
		}

		return list;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		int ar[] = new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < size; i++) {
			ar[i] = s.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<>();

		list = removeduplicates(ar);
		for (int n : list) {
			System.out.println(n);
		}
	}
}

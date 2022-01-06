package com.demo.wrapper;

import java.util.Scanner;

public class BooleanWrapper {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			//Boolean = 4 methods

			System.out.println("First boolean : ");
			boolean a = sc.nextBoolean();
			System.out.println("Second boolean : ");
			boolean b = sc.nextBoolean();

			int hashcode1 = Boolean.hashCode(a);
			int hashcode2 = Boolean.hashCode(b);
			System.out.println(hashcode1);
			System.out.println(hashcode2);

			boolean logicalAnd = Boolean.logicalAnd(a, b);
			System.out.println(logicalAnd);
			boolean longicalOr = Boolean.logicalOr(a, b);
			System.out.println(longicalOr);
			boolean logicalXor = Boolean.logicalXor(a, b);
			System.out.println(logicalXor);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

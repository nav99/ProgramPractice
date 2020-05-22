package com.java.test;

import java.util.Scanner;

public class ExcelToColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		excelToColumn(no);

	}

	private static void excelToColumn(int columnNo) {
		// TODO Auto-generated method stub
		StringBuilder columnName = new StringBuilder();
		while (columnNo > 0) {
			int rem = columnNo % 26;
			if (rem == 0) {
				columnName.append("Z");
				columnNo = (columnNo / 26) - 1;
			} else {
				columnName.append((char) ((rem - 1) + 'A'));
				columnNo = columnNo / 26;
			}
		}
		System.out.println(columnName.reverse());

	}

}

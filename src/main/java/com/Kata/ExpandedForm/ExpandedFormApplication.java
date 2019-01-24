package com.Kata.ExpandedForm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpandedFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpandedFormApplication.class, args);
	}

	public static String expandedForm(int num) {
		char[] numbers = String.valueOf(num).toCharArray();
		Integer n = numbers.length;
		List<Double> list = new ArrayList<Double>();
		StringJoiner joiner = new StringJoiner(" + ");

		for (int i = 0; i < numbers.length; i++) {
			if (Integer.valueOf(String.valueOf(numbers[i])) != 0)
				list.add(Integer.valueOf(String.valueOf(numbers[i])) * Math.pow(10, n - 1));

			n--;
		}

		for (double k : list)
			joiner.add(String.valueOf((int) k));

		return joiner.toString();
		// your code here
	}
}

// 12
// 1 * 10
// 2 * 1
// (1 * 10) + (2 * 1)
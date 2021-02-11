//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Julian Matuszewski

import java.util.Arrays;

public class NumberAnalyzer
{
	private int[] list;

	//write a constructor
	public NumberAnalyzer (int[] l) {
		list = l;
	}

	//write count odds
	public int countOdds() {
		int count = 0;
		//For each loop iterating through each Number
		for (int i: list) {
			Number num = new Number(i); //initialize and declare temporary Number to store i
			if (num.isOdd()) //check each Number using isOdd
				count++; //increase by one each time is true
		}
		return count;
	}

	//write count evens
	public int countEvens() {
		int count = 0;
		//For each loop iterating through each Number
		for (int i: list) {
			Number num = new Number(i); //initialize and declare temporary Number to store i
			if (!num.isOdd()) //check each Number using not isOdd
				count++; //increase by one each time is true
		}
		return count;
	}

	//write count perfects
	public int countPerfects() {
		//check each Number if it returns true using isPerfect, countPerf++
		int count = 0;
		for (int i: list) {
			Number num = new Number(i); //placeholder
			if (num.isPerfect()) //Using Number class methods in NumberAnalyzer class
				count++; //increase for each perfect number
		}
		return count;
	}

	//write a toString
	public String toString() {
		return Arrays.toString(list); //converts it to a String using Arrays class
	}
}
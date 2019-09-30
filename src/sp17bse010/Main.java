package sp17bse010;

import java.math.BigInteger;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
	// Adding 2 Integer Function
	// Count the Occurance of 'a' & 'A'
	
	/**
	* @param two number and return sum of two number 
	* if sum is overflow then return 0
	*/
	public static int addTwoInteger(int number1, int number2){	 
		int result = number1+number2;
		if(result>=Integer.MAX_VALUE || result<=Integer.MIN_VALUE){
			return 0;
		}else{
			return result;
		}
	}

	// This Function Convert the String into Array 
	// Then Conmpare every element in Array to 'a' OR 'A'
	/**
	* Count the occurance of small and large A Character in String.
	* no string then return -1 
	*/
	public static int countOccurance(String text){
		int count = 0;
		if(text.isEmpty()){
			return -1;
		}else{
			char[] textArray = text.toCharArray();
			for(int i = 0; i<textArray.length; i++){
				if(textArray[i]=='a' || textArray[i]=='A'){
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("MAX RANGE : "+Integer.MIN_VALUE);
		sysout
	}

}
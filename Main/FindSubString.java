/*
Given a string, find the length of the longest substring without repeating characters.
  
Examples:
    Given "abcabcbb", the answer is "abc", which the length is 3.
    Given "bbbbb", the answer is "b", with the length of 1.
    Given "pwwkew", the answer is "wke", with the length of 3
    
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

import java.util.*;

public class FindSubString {
	//Allows user to input String to be used
//	Scanner input = new Scanner(System.in);
	
	//userStr will hold the string entered by the user
	//subStr will hold the subStr that will be returned with the non-repeated characters and length
	private String[] userStr;
	public List<String> listStr;
	
	FindSubString(String input) {
//		System.out.println("Enter a string: ");
		userStr = input.split("");
		listStr = new ArrayList<String>();
	}
	
	public void createSubStr() {
		String subStr = "";
		
		for(int i = 0; i < userStr.length; i++) {
			if(!subStr.contains(userStr[i])) {
				subStr += userStr[i];
			}
			else {
				listStr.add(subStr);
				subStr = userStr[i];
			}
		}
		
		if(listStr.isEmpty()) {
			listStr.add(subStr);
		}
		
//		for(int i = 0; i < listStr.size(); i++) {
//			System.out.print(listStr.get(i) + " ");
//		}
	}
	
	public int[] longestSubStr() {
		int maxIndex = 0, max = 0;
		int[] maxNum = {max, maxIndex};
		
		for(int i = 0; i < listStr.size(); i++) {
			if(listStr.get(i).length() > maxNum[0]) {
				maxNum[0] = listStr.get(i).length();
				maxNum[1] = i;
			}
		}
		
		return maxNum;
	}
	
	public void print() {
		String userStr1 = "";
		for(int i = 0; i < userStr.length; i++) {
			userStr1 += userStr[i];
		}
		
		System.out.println("\nGiven \"" + userStr1 + "\", the answer is \"" + listStr.get(longestSubStr()[1]) + "\", with the length of " + longestSubStr()[0]);
	}
}

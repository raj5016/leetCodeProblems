package com.string;

import java.util.Iterator;

public class Leetcode_1221_SplitAStringInBalancedStrings {
	// https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
	
	/*
	 * 	Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

		Given a balanced string s, split it into some number of substrings such that:
		
		Each substring is balanced.
		Return the maximum number of balanced strings you can obtain.
		
		Example 1:
		
		Input: s = "RLRRLLRLRL"
		Output: 4
		Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
	 */
	
	
	public int balancedString(String s) {
		int count=0;
		int flag=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='R') {
				count++;
			}
			if(s.charAt(i)=='L') {
				count--;
			}
			if(count==0) {
				flag++;
			}
		}
		return flag;
		
	}
}

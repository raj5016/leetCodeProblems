package com.string;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;


public class Leetcode_3_LongestSubString {
	
	//https://leetcode.com/problems/longest-substring-without-repeating-characters/
	/*
	 * Given a string s, find the length of the longest substring without repeating characters.
		
		Example 1:
		
		Input: s = "abcabcbb"
		Output: 3
		Explanation: The answer is "abc", with the length of 3.
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(3, lengthOfLongestSubString("abcabcbb"));
	}
	
	
	public int lengthOfLongestSubString(String s) {
		int max=0;
		HashSet<Character> set=new HashSet<Character>();
		int i=0;
		int j=0;
		
		while(i<s.length() || j<s.length()) {
			if(set.contains(s.charAt(j))) {
				set.remove(s.charAt(i));
				i=i+1;
			}else {
				set.add(s.charAt(j));
				j=j+1;
				max=Math.max(max, j-1);
			}
		}
		
		return max;
		
	}
}

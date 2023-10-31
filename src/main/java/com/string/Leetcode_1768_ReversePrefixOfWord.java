package com.string;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode_1768_ReversePrefixOfWord {
	
	//https://leetcode.com/problems/reverse-prefix-of-word/description/
	
	//String s="leetcode"  ch='c'
	//Output=cteelode
	
	@Test
	public void test4() {
		Assert.assertEquals("cteelode", reversePrefixOfword("leetcode", 'c'));
	}
	
	@Test
	public void test() {
		Assert.assertEquals("dcbaefd", reversePrefixOfword("abcdefd", 'd'));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("kjhgfde", reversePrefixOfword("edfghjk", 'k'));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("google", reversePrefixOfword("google", 's'));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("ogogle", reversePrefixOfword("google", 'o'));
	}
	
	public String reversePrefixOfword(String s,char c) {
		int index=s.indexOf(c); 
		String output = "";
		
		for (int i =index ; i>=0; i--) {
			output=output+s.charAt(i);
		}
		
		for (int i = index+1; i<s.length(); i++) {
			output=output+s.charAt(i);
		}
		
		return output;
	}
	
}
	


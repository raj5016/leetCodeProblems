package com.string;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode_1768_MergeStringAlternatively {
	
	//https://leetcode.com/problems/merge-strings-alternately/description/
	
	@Test
	public void test() {
		Assert.assertEquals("apbqcr", mergeString("abc", "pqr"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("apbqrs", mergeString("ab", "pqrs"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("apbqcd", mergeString("abcd", "pq"));
	}
	
	public String mergeString(String s1,String s2) {
		String mergeString="";
		int size1=s1.length();
		int size2=s2.length();
		int i=0;
		int j=0;
		
		while(i<size1 || j<size2) {
			if(i<size1) {
				mergeString=mergeString+s1.charAt(i);
			}
			if(j<size2) {
				mergeString=mergeString+s2.charAt(j);
			}
			i++;
			j++;
		}
		
		
		return mergeString;
	}

}

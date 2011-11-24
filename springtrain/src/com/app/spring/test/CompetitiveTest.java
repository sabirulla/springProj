package com.app.spring.test;

class Tree{}
class Pine extends Tree{}
class Oak extends Tree{}

public class CompetitiveTest {

	public static void main(String args[])
	{
		Tree tree = new Pine();

		if(tree instanceof Tree)
			System.out.println("Tree");
		if(tree instanceof Pine)
			System.out.println("Pine");
		if(tree instanceof Oak)
			System.out.println("Oak");
		else
			System.out.println("Oops");
	}
}

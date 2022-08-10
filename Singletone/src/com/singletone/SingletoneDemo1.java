package com.singletone;

public class SingletoneDemo1 {

	private static SingletoneDemo1 s = new SingletoneDemo1();

	private SingletoneDemo1() {

	}

	public static SingletoneDemo1 getSingletone() {

		return s;
	}

	public static void main(String[] args) {

		SingletoneDemo1 s1 = SingletoneDemo1.getSingletone();
		SingletoneDemo1 s2 = SingletoneDemo1.getSingletone();

		System.out.println(s1);
		System.out.println(s2);

	}

}

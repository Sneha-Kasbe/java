package com.singletone;

public class Test {

	private static Test t = null;

	private Test() {

	}

	public static Test getTest() {

		if (t == null) {
			t = new Test();
		}
		return t;
	}

	public static void main(String[] args) {

		Test t1 = Test.getTest();
		Test t2 = Test.getTest();

		System.out.println(t1);
		System.out.println(t2);

	}

}

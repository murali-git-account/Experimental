package com.murali.experiments;

/**
 * Say "Hello" to any argument
 *
 */
public class FriendlyPerson {
	private static final String HELLO_FORMAT = "Hello %s! Have a good day!";

	public void saysHello(String[] args) {
		if (null != args && args.length > 0) {
			for (String arg : args) {
				System.out.println(String.format(HELLO_FORMAT, arg));
			}
		} else {
			System.out.println(String.format(HELLO_FORMAT, "stranger"));
		}
	}

	public static void main(String[] args) {
		FriendlyPerson person = new FriendlyPerson();
		person.saysHello(new String[] { "Dad", "Mom", "My Dear friend" });
		person.saysHello(new String[] {});
		person.saysHello(null);
	}
}

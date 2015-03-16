package bootstrap;

import java.util.Arrays;

public class CLI {

	public static void main(String... args) {
		Arrays.asList(args)
			.stream()
			.forEach(System.out::println);
	}
}

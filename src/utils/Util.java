package utils;

import java.util.concurrent.ThreadLocalRandom;

public class Util {
	public static int randomNumber(){
		return ThreadLocalRandom.current().nextInt(3,11)*1_000;
	}
}

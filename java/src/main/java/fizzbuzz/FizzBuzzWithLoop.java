package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzWithLoop implements IFizzBuzz {

	static final String FIZZ = "fizz";
	static final String BUZZ = "buzz";

	static final int FIZZ_VALUE = 3;
	static final int BUZZ_VALUE = 5;

	@Override
	public String[] getAllTo(int maxValue) {
		if (maxValue < 1) {
			throw new IllegalArgumentException("a strictly positive value is expected.");
		}

		List<String> values = new ArrayList<>();

		for (int i = 1; i <= maxValue; i++) {
			// TODO: extract method
			if (i % 3 != 0 && i % 5 != 0) {
				values.add(String.valueOf(i));
			} else {
				StringBuilder buffer = new StringBuilder();
				if (i % 3 == 0) {
					buffer.append(FIZZ);
				}
				if (i % 5 == 0) {
					buffer.append(BUZZ);
				}
				values.add(buffer.toString());
			}

		}

		String[] result = {};
		return values.toArray(result);
	}
}

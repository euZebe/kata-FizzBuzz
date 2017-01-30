package fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzWithStream implements IFizzBuzz {

	static final String FIZZ = "fizz";
	static final String BUZZ = "buzz";

	static final int FIZZ_VALUE = 3;
	static final int BUZZ_VALUE = 5;

	@Override
	public String[] getAllTo(int maxValue) {
		if (maxValue < 1) {
			throw new IllegalArgumentException("a strictly positive value is expected.");
		}

		List<String> fizzBuzzValues = IntStream.range(1, maxValue + 1) //
				.boxed() //
				.map(this::getFizzBuzzValue) //
				.collect(Collectors.toList());

		return fizzBuzzValues.toArray(new String[] {});

	}

	private String getFizzBuzzValue(Integer intValue) {
		String result;
		if (!isMultipleOf3(intValue) && !isMultipleOf5(intValue)) {
			result = String.valueOf(intValue);
		} else {
			StringBuilder buffer = new StringBuilder();
			if (isMultipleOf3(intValue)) {
				buffer.append(FIZZ);
			}
			if (isMultipleOf5(intValue)) {
				buffer.append(BUZZ);
			}
			result = buffer.toString();
		}
		return result;
	}

	private boolean isMultipleOf3(Integer intValue) {
		return isMultipleOf(intValue, FIZZ_VALUE);
	}

	private boolean isMultipleOf5(Integer intValue) {
		return isMultipleOf(intValue, BUZZ_VALUE);
	}

	private boolean isMultipleOf(Integer intValue, int base) {
		return intValue % base == 0;
	}
}

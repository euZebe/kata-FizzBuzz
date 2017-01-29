package fizzbuzz;

import org.junit.Before;

public class FizzBuzzStreamTest extends FizzBuzzTest {
	@Override
	@Before
	public void init() {
		game = new FizzBuzzWithStream();
	}

}

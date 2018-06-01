package fizzbuzz;

import static fizzbuzz.FizzBuzzWithLoop.BUZZ;
import static fizzbuzz.FizzBuzzWithLoop.FIZZ;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

	protected IFizzBuzz game;

	@Before
	public void init() {
		game = new FizzBuzzWithLoop();
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throw_an_exception_if_maxValue_is_less_than_1() {
		int negativeValue = -1 * new Random().nextInt(10);
		game.getAllTo(negativeValue);
	}

	@Test
	public void should_enumerate_numbers_before_first_fizz_buzz() {
		assertThat(game.getAllTo(1)).isEqualTo(new String[] { "1" });
		assertThat(game.getAllTo(2)).isEqualTo(new String[] { "1", "2" });
	}

	@Test
	public void should_replace_multiple_of_3_by_fizz() {
		String[] allTo10 = game.getAllTo(10);
		assertThat(allTo10[2]).isEqualTo(FIZZ);
		assertThat(allTo10[5]).isEqualTo(FIZZ);
		assertThat(allTo10[8]).isEqualTo(FIZZ);
	}

	@Test
	public void should_replace_multiple_of_5_by_buzz() {
		String[] fizzBuzzTo6 = game.getAllTo(6);
		assertThat(fizzBuzzTo6).isEqualTo(new String[] { "1", "2", FIZZ, "4", BUZZ, FIZZ });
	}

	@Test
	public void should_combine_fizz_and_buzz_for_multiples_of_both() {
		String[] allTo30 = game.getAllTo(30);
		assertThat(allTo30[14]).isEqualTo(FIZZ + BUZZ);
		assertThat(allTo30[29]).isEqualTo(FIZZ + BUZZ);
	}

}

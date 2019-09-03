package brm_lab_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcase_reversenumber {

	ReverseNumber r = new ReverseNumber();
	@Test
	void test() {
		assertEquals(23179,r.reverse(97132));
	}

}

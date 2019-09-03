package brm_lab_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcase_sum {
    get_sum obj = new get_sum();
	@Test
	void test() {
		assertEquals(8,obj.cal_sum(5,3));
	}

}

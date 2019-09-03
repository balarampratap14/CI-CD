package devopsb1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcalc {
Calc obj = new Calc();
	@Test
	public void test() {
		assertEquals(15,obj.add(5,3));
	
	}
	public void test1() {
		assertEquals(2,obj.diff(5,3));
	
	}

}

package combinationlock;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComboLockTest {
	//private int lockState;
	@Test
	public void test01_reset() {
		ComboLock c = new ComboLock(10, 20, 30);
		int expected = 0;
		assertEquals(expected , c.getLockState());
		assertEquals(expected, c.getCurrentNumber());
		assertTrue(c.isValidSoFar()== true);
	}
	
	@Test
	public void test02_turnLeft() {
		ComboLock c = new ComboLock(10, 20, 30);
		int currentNumber = 10;
		int ticks = 30;
		c.setCurrentNumber(currentNumber);
		assertEquals(c.getSecret2(), (c.getCurrentNumber()+40-ticks)%40);
	}
	@Test
	public void test03_turnRight1() {
		ComboLock c = new ComboLock(10, 20, 30);
		int currentNumber = 0;
		int ticks = 10;
		c.setCurrentNumber(currentNumber);
		assertEquals(c.getSecret1(), c.getCurrentNumber()+ticks);
	}
	@Test
	public void test04_turnRight2() {
		ComboLock c = new ComboLock(10, 20, 30);
		int currentNumber = 20;
		int ticks = 10;
		c.setCurrentNumber(currentNumber);
		assertEquals(c.getSecret3(), c.getCurrentNumber()+ticks);
	}
	@Test
	public void test05_open() {
		ComboLock c = new ComboLock(10, 20, 30);
		c.setLockState(3);
		int expected = 3;
		assertTrue(expected == c.getLockState() && c.isValidSoFar());
		assertFalse(expected != c.getLockState());
	}
}

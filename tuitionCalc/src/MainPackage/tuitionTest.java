package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class tuitionTest {
	tuition tuition;


	@Before
	public void setUp() throws Exception {
		tuition = new tuition(10000,2,4,10);
	}

	@After
	public void tearDown() throws Exception {
		tuition = null;
	}

	@Test
	public void getCostTest() {
		assertTrue(tuition.getCost() == 41216.08);
	}
	@Test
	public void getMonthlyTest() {
		assertTrue(Math.floor(tuition.monthlyPayment()*100) == Math.floor(417.29*100));
		}
	@Test
	public void CostTest2(){
		assertFalse(tuition.getCost() <= 10000);
	}
	@Test
	public void monthTest2(){
		assertFalse(tuition.monthlyPayment() <= 0);
	}

}

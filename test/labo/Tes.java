package labo;

import static org.junit.Assert.*;
import org.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

public class Tes {
	
	@Test
	//≤‚ ‘∑Ω∑®
	public void testCan(){
		Triangle t = new Triangle();
		assertEquals(t.can(10, 20, 1),1);
		assertEquals(t.can(1, 1, 1),2);
		assertEquals(t.can(3, 3, 1),3);
		assertEquals(t.can(3, 4, 5),4);
	}
	
	@Test
	public void testEq(){
		Triangle t = new Triangle();
		assertEquals(t.can(2, 2, 2),2);
	}
}
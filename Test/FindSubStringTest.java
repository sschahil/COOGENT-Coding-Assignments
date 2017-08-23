import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindSubStringTest {
	
	FindSubString subStr1;
	FindSubString subStr2;
	FindSubString subStr3;
	FindSubString subStr4;
	FindSubString subStr5;
	FindSubString subStr6;
	FindSubString subStr7;
	FindSubString subStr8;
	FindSubString subStr9;
	FindSubString subStr10;
	FindSubString subStr11;
	FindSubString subStr12;
	
	@Before 
	public void setUp() {
		subStr1 = new FindSubString("abcabcbb");
		subStr2 = new FindSubString("bbbbbbb");
		subStr3 = new FindSubString("pwwkew");
		subStr4 = new FindSubString("lkjioaaalkbi");
		subStr5 = new FindSubString("albi");
		subStr6 = new FindSubString("JamesJamesLolloallkjoilnllll");
		subStr7 = new FindSubString("jk");
		subStr8 = new FindSubString("a");
		subStr9 = new FindSubString("alkjioiaj");
		subStr10 = new FindSubString("ioajskjoidjlkalk");	
		subStr11 = new FindSubString(" ");
		subStr12 = new FindSubString("");
	}
	
	@Test
	public void testLongestSubstringCalc() {
		
		subStr1.createSubStr();

		subStr1.print();
		assertEquals(3, subStr1.longestSubStr()[0]);
		////////////////////////////////////////////
		subStr2.createSubStr();

		subStr2.print();
		assertEquals(1, subStr2.longestSubStr()[0]);
		////////////////////////////////////////////
		subStr3.createSubStr();

		subStr3.print();
		assertEquals(3, subStr3.longestSubStr()[0]);
		////////////////////////////////////////////
		subStr4.createSubStr();

		subStr4.print();
		assertEquals(6, subStr4.longestSubStr()[0]);
		////////////////////////////////////////////
		subStr5.createSubStr();

		subStr5.print();
		assertEquals(4, subStr5.longestSubStr()[0]);
		////////////////////////////////////////////
		subStr6.createSubStr();
		
		subStr6.print();
		assertEquals(8, subStr6.longestSubStr()[0]);
		////////////////////////////////////////////
		subStr7.createSubStr();

		subStr7.print();
		assertEquals(2, subStr7.longestSubStr()[0]);
		////////////////////////////////////////////
		subStr8.createSubStr();

		subStr8.print();
		assertEquals(1, subStr8.longestSubStr()[0]);
		////////////////////////////////////////////
		subStr9.createSubStr();

		subStr9.print();
		assertEquals(6, subStr9.longestSubStr()[0]);
		////////////////////////////////////////////
		subStr10.createSubStr();

		subStr10.print();
		assertEquals(6, subStr10.longestSubStr()[0]);
		/////////////////////////////////////////////
		subStr11.createSubStr();

		subStr11.print();
		assertEquals(1, subStr11.longestSubStr()[0]);
		/////////////////////////////////////////////
		subStr12.createSubStr();

		subStr12.print();
		assertEquals(0, subStr12.longestSubStr()[0]);
		/////////////////////////////////////////////
	}

	@After
	public void endMessage() {
		String endMsg = "\n\nTests have ended in Success!!";
		System.out.println(endMsg.toUpperCase());
	}
}

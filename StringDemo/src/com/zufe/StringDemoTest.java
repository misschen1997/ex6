package com.zufe;

import junit.framework.TestCase;
public class StringDemoTest extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString() {
		assertEquals("一个字母变小写",str.smallString("A"),"a");
		assertEquals("一个字母变小写",str.smallString("B"),"b");
		assertEquals("一个字母变小写",str.smallString("C"),"c");
		assertEquals("一个字母变小写",str.smallString("D"),"d");
		assertEquals("一个字母变小写",str.smallString("E"),"e");
		assertEquals("一个字母变小写",str.smallString("F"),"f");
		assertEquals("一个字母变小写",str.smallString("G"),"g");
		assertEquals("一个字母变小写",str.smallString("H"),"h");
		assertEquals("一个字母变小写",str.smallString("I"),"i");
		assertEquals("一个字母变小写",str.smallString("J"),"j");
		assertEquals("一个字母变小写",str.smallString("K"),"k");
		
		
	}
}
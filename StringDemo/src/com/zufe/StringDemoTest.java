package com.zufe;

import junit.framework.TestCase;
public class StringDemoTest extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString() {
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
		assertEquals("һ����ĸ��Сд",str.smallString("B"),"b");
		assertEquals("һ����ĸ��Сд",str.smallString("C"),"c");
		assertEquals("һ����ĸ��Сд",str.smallString("D"),"d");
		assertEquals("һ����ĸ��Сд",str.smallString("E"),"e");
		assertEquals("һ����ĸ��Сд",str.smallString("F"),"f");
		assertEquals("һ����ĸ��Сд",str.smallString("G"),"g");
		assertEquals("һ����ĸ��Сд",str.smallString("H"),"h");
		assertEquals("һ����ĸ��Сд",str.smallString("I"),"i");
		assertEquals("һ����ĸ��Сд",str.smallString("J"),"j");
		assertEquals("һ����ĸ��Сд",str.smallString("K"),"k");
		
		
	}
}
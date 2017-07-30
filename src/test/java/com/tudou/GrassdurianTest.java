package com.tudou;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Graphics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GrassdurianTest {
	
	Grassdurian gd = new Grassdurian(2,2,8,4);

	int count_x = 5;
	int count_y = 5; 
	int size = 100;
	int distance = 10;
	@Before
	public void setUp() throws Exception {
		System.out.println("Grassdurian is set up!");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Grassdurian is tear down!");
	}

	@Test
	public void testInit() {
		gd.init(count_x, count_y, size, distance);
		assertEquals(count_x, gd.count_x);
		assertEquals(count_y, gd.count_y);
		assertEquals(size, gd.size);
		assertEquals(distance, gd.distance);
	}

	@Test
	public void testRun() {
		gd.run();
		System.out.println("The method run is executed!");
	}

	@Test
	public void testPaintGraphics() {
		gd.run();
		System.out.println("The method paint is called!");
	}

	@Test
	public void testSetActivitedBlockByPostion() {
		gd.setActivitedBlockByPostion(2, 3);
		System.out.println("The method testSetActivitedBlockByPostio is called!");
	}

}

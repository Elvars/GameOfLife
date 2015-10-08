package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {
	
	Grid grid;

	@Test
	public void testCreateGrid() 
	{
		
		grid = new Grid();
		
		int actual = grid.createGrid(5);
	
		assertEquals(4, actual);
		
		
	}

}

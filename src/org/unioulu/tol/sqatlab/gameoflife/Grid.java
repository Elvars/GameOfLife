package org.unioulu.tol.sqatlab.gameoflife;

import java.util.ArrayList;
import java.util.List;


public class Grid {
	
	public int rowAmount;
	public int columnAmount;
	
	
	
	public Cell[] cellArray = new Cell[columnAmount];
	public List<Cell[]> allCells = null;
	
	
	public Grid(int rowAmount, int columnAmount) 
	{
		this.rowAmount = rowAmount;
		this.columnAmount = columnAmount;
	}
	
	
	public int createGrid()
	{
		for(int i = 0; i<rowAmount; i++) 
		{
			System.out.println("moi");
			allCells.add(cellArray);
		}
		
		return allCells.size();
	}
	
}

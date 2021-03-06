package test;

import static org.junit.Assert.*;

import org.junit.Test;

import connect.four.board.Board;
import connect.four.player.ConsolePlayer;

public class TestBoard {

	@Test
	public void testBoardCopyConstructor() {
		
		//Instantiate the console players:
		ConsolePlayer adam = new ConsolePlayer("@dam");
		ConsolePlayer xian = new ConsolePlayer("Xian");
		
		//Setup the two board configurations:
		ConsolePlayer[][] board1Config = {{ xian, null, null, null, null, null }, //1
										  { adam, xian, null, null, null, null }, //2
										  { null, null, null, null, null, null }, //3
							/*Bottom*/    { null, null, null, null, null, null }, //4  /*Top*/
										  { adam, xian, null, null, null, null }, //5
										  { null, null, null, null, null, null }, //6
										  { adam, xian, adam, adam, xian, adam }};//7
				
		ConsolePlayer[][] board2Config = {{ null, null, null, null, null, null }, //1
										  { null, null, null, null, null, null }, //2
										  { null, null, null, null, null, null }, //3
							/*Bottom*/    { null, null, null, null, null, null }, //4  /*Top*/
										  { null, null, null, null, null, null }, //5
										  { null, null, null, null, null, null }, //6
										  { null, null, null, null, null, null }};//7
		
		//Create the two boards to be copied with the two board configurations:
		Board board1 = new Board(board1Config);
		Board board2 = new Board(board2Config);
		
		//Attempt to create copies of the two boards:
		Board board1copy = new Board(board1);//Test ID# UI-BB-1
		Board board2copy = new Board(board2);//Test ID# UI-BB-2
		
		//Check to make sure the copy of board1 has the same dimensions:
		if(board1.getWidth() != board1copy.getWidth())
			fail("The board copied isn't the same width!");
		if(board1.getHeight() != board1copy.getHeight())
			fail("The board copied isn't the same height!");
		//If it does, then check to make sure it has the same contents:
		for(int i = 0; i < board1.getWidth(); i++)
			for(int j = 0; j < board1.getHeight(); j++)
				assertEquals(board1.whoPlayed(i, j), board1copy.whoPlayed(i, j));
		
		//Check to make sure the copy of board2 has the same dimensions:
		if(board2.getWidth() != board2copy.getWidth())
			fail("The board copied isn't the same width!");
		if(board2.getHeight() != board2copy.getHeight())
			fail("The board copied isn't the same height!");
		//If it does, then check to make sure it has the same contents:
		for(int i = 0; i < board2.getWidth(); i++)
			for(int j = 0; j < board2.getHeight(); j++)
				assertEquals(board2.whoPlayed(i, j), board2copy.whoPlayed(i, j));
		
		
		
	}

	@Test
	public void testPlay() {
		//TODO
	}

	@Test
	public void testGetColumnHeight() {
		//TODO
	}

	@Test
	public void testClear() {
		//TODO
	}

}

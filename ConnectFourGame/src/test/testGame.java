package test;

import static org.junit.Assert.*;

import org.junit.Test;

import connect.four.Game;
import connect.four.board.*;
import connect.four.player.*;

public class testGame {

	@Test
	public void testDetectWinner() {
		
		int inRow = 4;
		
		ConsolePlayer symX = new ConsolePlayer("X");
		ConsolePlayer symO = new ConsolePlayer("O");
		
		ConsolePlayer[][] board1Config = {{ null, null, null, null, null, null, null },
										  { null, null, null, null, null, null, null },
										  { null, null, null, symO, null, null, null },
										  { null, symO, symO, symO, null, null, null },
										  { null, symO, symX, symX, null, null, null },
										  { symO, symO, symX, symO, null, null, null }};
		
		ConsolePlayer[][] board2Config = {{ null, null, null, null, null, null, null },
										  { null, null, null, null, null, null, null },
										  { null, null, null, symO, null, null, null },
										  { null, symO, symO, symO, null, null, null },
										  { null, symX, symX, symX, null, null, null },
										  { symO, symO, symO, symO, null, null, null }};
		
		ConsolePlayer[][] board3Config = {{ null, null, null, null, null, null, null },
										  { null, null, null, null, null, null, null },
										  { symO, null, null, null, null, null, null },
										  { symX, symO, symO, symO, null, null, null },
										  { symX, symX, symO, symX, null, null, null },
										  { symX, symX, symX, symO, null, null, null }};
		
		ConsolePlayer[][] board4Config = {{ null, null, null, null, null, null, null },
										  { null, null, null, null, null, null, null },
										  { null, null, null, symO, symX, null, null },
										  { null, null, null, symO, symX, null, null },
										  { symX, null, null, symO, symX, symO, null },
										  { symX, null, null, symX, symX, symO, symO }};
		
		ConsolePlayer[][] board5Config = {{ null, null, null, null, symX, null, symX },
										  { null, null, null, null, symO, null, symO },
										  { null, null, symX, null, symO, null, symO },
										  { null, symX, symO, null, symX, symX, symO },
										  { symX, symX, symX, symO, symO, symO, symX },
										  { symX, symX, symO, symX, symX, symO, symO }};
		
		ConsolePlayer[][] board6Config = {{ null, null, null, null, null, null, null },
										  { null, null, null, null, null, null, null },
										  { null, null, null, null, null, null, null },
										  { null, null, null, null, null, null, null },
										  { null, null, null, null, null, null, null },
										  { null, null, null, null, null, null, null }};

		Board board1 = new Board(board1Config);
		Board board2 = new Board(board2Config);
		Board board3 = new Board(board3Config);
		Board board4 = new Board(board4Config);
		Board board5 = new Board(board5Config);
		Board board6 = new Board(board6Config);
		
		//Boards with winners:
		assertEquals(symO, Game.detectWinner(board1, inRow));
		assertEquals(symO, Game.detectWinner(board2, inRow));
		assertEquals(symO, Game.detectWinner(board3, inRow));
		assertEquals(symX, Game.detectWinner(board4, inRow));
		
		//Boards with no winners:
		assertNull(Game.detectWinner(board5, inRow));
		assertNull(Game.detectWinner(board6, inRow));
	}

}

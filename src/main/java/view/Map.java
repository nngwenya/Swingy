package view;

import java.util.Arrays;
import model.*;

public class Map {

	
	static char[][] battleBoard = new char[9][9];
	// public int x = (Hero.getLevel() - 1 )*5+10-( Hero.getLevel() % 2 );
	// public int y = (Hero.getLevel() - 1 )*5+10-( Hero.getLevel() % 2 );

	
	public char ft_fetch_from_map(int x, int y)
	{
		return (battleBoard[y][x]);
	}
	public int ft_board_len_x()
	{
		return (battleBoard.length - 1);
	}
	public int ft_board_len_y()
	{
		return (battleBoard[0].length - 1);
	}
	
	public void ft_put_in_map(int x, int y, char nameChar)
	{
		battleBoard[x][y] = nameChar;
	}
	public static void buildMap() {
		for(char[] row : battleBoard) {
			Arrays.fill(row, '*');
		}
	}
	public static void redrawMap() {
		int line = 1;
		while(line <= 27) {
			System.out.print('-');
			line++;
		}
		System.out.println();
		for(int i = 0; i < battleBoard.length; i++) {
			for(int j = 0; j < battleBoard[i].length; j++) {
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
		}
		 line = 1;
		while(line <= 27) {
			System.out.print('-');
			line++;
		}
		System.out.println();
		
	}
	
	public void updateMap(int x, int y, char player)
	{
		for(int i = 0; i < battleBoard.length; i++) {
			for(int j = 0; j < battleBoard[i].length; j++) {
				if (battleBoard[i][j] == player) {
					battleBoard[i][j] = '*';
					battleBoard[y][x] = player;
					break;
				}
			}
		}
	}
	

}

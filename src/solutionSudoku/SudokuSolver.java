package solutionSudoku;

import java.util.Scanner;

public class SudokuSolver {
	public static void main(String[] args) {
		int[][] board = readBoardFromUser();

		SudokuBoard sudoku = new SudokuBoard(board);
		System.out.println("Tabuleiro inicial:");
		sudoku.printBoard();

		if (sudoku.solve()) {
			System.out.println("\nSolução encontrada:");
			sudoku.printBoard();
		} else {
			System.out.println("\nNão há solução para este tabuleiro.");
		}
	}

	private static int[][] readBoardFromUser() {
		Scanner scanner = new Scanner(System.in);
		int[][] board = new int[9][9];

		System.out.println("Digite os valores do tabuleiro Sudoku (use 0 para células vazias):");

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.printf("Valor para (%d, %d): ", i, j);
				board[i][j] = scanner.nextInt();
			}
			scanner.close();
		}

		return board;
	}
}

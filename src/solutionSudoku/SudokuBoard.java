package solutionSudoku;

public class SudokuBoard {
    private int[][] board;
    private static final int BOARD_SIZE = 9;
    private static final int EMPTY_CELL = 0;

    public SudokuBoard(int[][] board) {
        this.board = new int[BOARD_SIZE][BOARD_SIZE];
        // Copia os valores do tabuleiro inicial para evitar modificar o original diretamente
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                this.board[i][j] = board[i][j];
            }
        }
    }

    public boolean solve() {
        // Implementação do algoritmo de backtracking para resolver o Sudoku
        return solveSudoku();
    }

    private boolean solveSudoku() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (board[row][col] == EMPTY_CELL) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValidMove(row, col, num)) {
                            board[row][col] = num;
                            if (solveSudoku()) {
                                return true;
                            }
                            board[row][col] = EMPTY_CELL; // backtrack
                        }
                    }
                    return false; // não há números válidos para esta posição
                }
            }
        }
        return true; // tabuleiro resolvido
    }

    private boolean isValidMove(int row, int col, int num) {
        // Verifica se num pode ser colocado em board[row][col]
        return isValidInRow(row, num) && isValidInCol(col, num) && isValidInBox(row, col, num);
    }

    private boolean isValidInRow(int row, int num) {
        for (int col = 0; col < BOARD_SIZE; col++) {
            if (board[row][col] == num) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidInCol(int col, int num) {
        for (int row = 0; row < BOARD_SIZE; row++) {
            if (board[row][col] == num) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidInBox(int startRow, int startCol, int num) {
        int boxSize = (int) Math.sqrt(BOARD_SIZE);
        int boxStartRow = startRow - startRow % boxSize;
        int boxStartCol = startCol - startCol % boxSize;
        for (int row = boxStartRow; row < boxStartRow + boxSize; row++) {
            for (int col = boxStartCol; col < boxStartCol + boxSize; col++) {
                if (board[row][col] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

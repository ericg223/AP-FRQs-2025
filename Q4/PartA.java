public SumOrSameGame(int numRows, int numCols) {
  puzzle = new int[numRows][numCols];
  for (int i = 0; i < numRows; i ++) {

    for (int j = 0; j < numCols; j++) {
      int ranNum = (int) (Math.random() * 9) + 1;
      puzzle[i][j] = ranNum;
    }
  }
}

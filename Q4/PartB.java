public boolean clearPair(int row, int col) {
  int num = grid[row][col];
  for (int i = row; i < grid.length; i++) {

    for (int j = 0; j < grid[i].length; j++) {
      if (!(i == row && j == col)) {
        if (num+grid[i][j] == 10 || num == grid[i][j])  {
          grid[row][col] = 0;
          grid[i][j] = 0;
          return true;
        }
      }   
    }
  }
}

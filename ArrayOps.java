public class ArrayOps {
  public static int sum(int[] arr) {
    int totalSum = 0;
    if (arr.length == 0) return 0;
    for (int i = 0; i < arr.length; i++) {
      totalSum += arr[i];
    }
    return totalSum;
  }

  public static int largest(int[] arr) {
    int largestInt = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largestInt) largestInt = arr[i];
    }
    return largestInt;
  }

  public static int[] sumRows(int[][] matrix) {
    int[]totalRow = new int [matrix.length];
    int sumDigits = 0;
    for (int i = 0; i < matrix.length; i++) {
      sumDigits = sum(matrix[i]);
      totalRow[i] = sumDigits;
    }
    return totalRow;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[]biggestInRow = new int [matrix.length];
    int largestDigits = 0;
    for (int i = 0; i < matrix.length; i++) {
      largestDigits = largest(matrix[i]);
      biggestInRow[i] = largestDigits;
    }
    return biggestInRow;
  }

  public static int sum(int[][] arr) {
    int manySum = 0;
    for (int i = 0; i < arr.length; i++) {
      manySum += sum(arr[i]);
    }
    return manySum;
  }

  public static int[] sumCols(int[][] matrix) {
    int[]column = new int[matrix[0].length];
    int[]sumCol = new int[column.length];
    for (int i = 0; i < column.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        column[j] = matrix[j][i];
      }
      sumCol[i] = sum(column);
    }
    return sumCol;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int sumRow = sum(matrix[0]);
    for (int i = 0; i < matrix.length; i++) {
      if (sum(matrix[i]) != sumRow) {
        return false;
      }
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix) {
    int[]columns = sumCols(matrix);
    int firstColumn = columns[0];
    for (int i = 0; i < matrix[0].length; i++) {
      if (columns[i] != firstColumn) {
        return false;
      }
    }
    return true;
  }
}

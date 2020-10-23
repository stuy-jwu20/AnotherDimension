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

  // public static int sum(int[][] arr) {
  //
  // }

}

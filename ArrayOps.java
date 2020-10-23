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
  //
  // public static int[] sumrows(int[][] matrix) {
  //
  // }
  //
  // public static int[] largestInRows(int[][] matrix) {
  //
  // }
  //
  // public static int sum(int[][] arr) {
  //
  // }

}

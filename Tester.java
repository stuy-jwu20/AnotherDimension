import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[][]arrayX= {{ 1, 0, 12,-1, },
                    { 7,-2, 2, 1 },
                    {-5,-2, 2,-9 }
                   };
    int[]arrayY =   { 1, 3, 5 };
    //System.out.println(Arrays.toString(ArrayOps.sumRows(arrayX)));
    //System.out.println(ArrayOps.sum(arrayX));
    System.out.println(Arrays.toString(ArrayOps.sumCols(arrayX)));
  }
}

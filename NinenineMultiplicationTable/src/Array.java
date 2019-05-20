public class Array {
  public static void main(String[] args) {
    int[] myArray = new int[100];
    for (int i = 1; i <= 99; i++) {
      myArray[i] = i /*(int) (Math.random() * 100)*/;
      if (i == 50) continue; // less one
      System.out.println(myArray[i]);
    }
    int[][] twoArray = new int[4][4];
    int[][] anotherArray = {
      {1, 2, 3, 4},
      {1, 2, 3, 6},
      {1, 3, 6, 2},
      {7, 3, 2, 1},
    };
    System.out.println(anotherArray[2][2]);
  }
}

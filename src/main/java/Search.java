public class Search {

  private final int[] array;

  public Search(int[] array) {
    this.array = array;
  }

  public int linear(int item) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == item) {
        return i;
      }
    }

    return -1;
  }

  public int binary(int item) {
    return binary(0, array.length - 1, item);
  }

  private int binary(int startIndex, int endIndex, int item) {
    if (endIndex < startIndex) {
      System.out.println("The item is not present in the array...");
      return -1;
    }

    int middleIndex = (startIndex + endIndex) / 2;

    if (item == array[middleIndex]) {
      return middleIndex;
    } else if (item < array[middleIndex]) {
      return binary(startIndex, middleIndex - 1, item);
    } else {
      return binary(middleIndex + 1, endIndex, item);
    }
  }
}

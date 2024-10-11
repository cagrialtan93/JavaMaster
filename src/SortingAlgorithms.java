public class SortingAlgorithms {
    private int[] arrayOfHell;

    public SortingAlgorithms(int[] arrayOfHell) {
        this.arrayOfHell = arrayOfHell;
    }

    public void bubbleSort() {
        for (int i = arrayOfHell.length; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arrayOfHell[j] > arrayOfHell[j + 1]) {
                    swapItems(arrayOfHell, j, j + 1);
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < arrayOfHell.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < arrayOfHell.length; j++) {
                if (arrayOfHell[j] < arrayOfHell[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            if (smallestIndex != i) {
                swapItems(arrayOfHell, smallestIndex, i);
            }
        }
    }

    public void insertionSort(){

    }

    public void shiftItems(){

    }

    public int[] getArrayOfHell() {
        return arrayOfHell;
    }

    public void setArrayOfHell(int[] arrayOfHell) {
        this.arrayOfHell = arrayOfHell;
    }


    public void swapItems(int[] arrayOfHell, int indexA, int indexB) {
        int temp = arrayOfHell[indexA];
        arrayOfHell[indexA] = arrayOfHell[indexB];
        arrayOfHell[indexB] = temp;
    }

    public void printArray() {
        for (int x :
                arrayOfHell) {
            System.out.println(x);
        }
    }
}

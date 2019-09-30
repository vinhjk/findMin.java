public class minValue {
    public static void main(String[] args) {
      int[] array = {4, 12, 7, 8 , 5, 6, 9};
      int index = minValues(array);
        System.out.print("The smallest element in array is : " + array[index]);
    }
    public static int minValues(int[] array){
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i ++){
            if (array[i]<min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}

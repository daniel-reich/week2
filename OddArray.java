import java.util.*;

public class OddArray {
    private List<int[]> arrayHolder = new ArrayList<int[]>();

    public static void main(String[] args) {
        OddArray oddArray = new OddArray();
        oddArray.initializeNumberHolder();
        oddArray.checkOddArrays();
      
    }

    private void initializeNumberHolder() {
        System.out.println("populating arrays");
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,16,18,19});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10});
        arrayHolder.add(new int[]{2,3,4,5,6,7,8,9,10});
        arrayHolder.add(new int[]{3,4,5,6,7,8,9,10});
        arrayHolder.add(new int[]{4,5,6,7,8,9,10});
        arrayHolder.add(new int[]{6,7,8,9,10});
        arrayHolder.add(new int[]{7,8,9,10});
        arrayHolder.add(new int[]{8,9,10});
        System.out.println("arrays populated");
    }

    private void checkOddArrays() {
        for (int[] tt : arrayHolder){ 
          if (isOddCount(tt) && isSummedOdd(tt)){
              System.out.println("Odd Match!");
          } else {
              System.out.println("Rejected");
          }
             
        }
    }
 


    private boolean isOddCount(int[] numHolder) {
        boolean isOdd = false;
        if (numHolder.length % 2 != 0){
            isOdd = true;
        }
        return isOdd;
    }

    private boolean isSummedOdd(int[] numHolder) {
        boolean isOdd = false;
        int total = 0;
        for (int n : numHolder){
            total = total + n;
        }
        if (total % 2 != 0){
            isOdd = true;
        }
        
        return isOdd;
    }
}

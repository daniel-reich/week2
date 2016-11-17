public class TimesTable {

    public static void main(String[] args) {
        int tableSize = 12;
        printTimesTable(tableSize);
    }

    public static void printTimesTable(int tableSize) {
        // first print the top header row using a for-loop
        System.out.format("      ");
        for(int i = 1; i<=tableSize;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");

        for (int row = 1; row<=tableSize; row++){
    
            System.out.format("%4d",row);
            System.out.print(" |");
            
            for (int column = 1; column<=tableSize; column++){
                System.out.format("%4d",column*row);
            }
            System.out.print("\n");
        }

    }
}

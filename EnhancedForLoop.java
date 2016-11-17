public class EnhancedForLoop{    
    
    private static char[] myArray = new char[]{'a','b','c','d','e','f','g','h'};

    public static void main(String[] args) {
        EnhancedForLoop loops = new EnhancedForLoop();
        loops.forLoop(loops.myArray);
        System.out.println(" ");
        System.out.println("---");
        loops.enhancedForLoop(loops.myArray);
    }

    private void forLoop(char[] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    
    private void enhancedForLoop(char[] array){
        for (char myValue : array) {
            System.out.print(myValue+" ");
        }
    }
}   

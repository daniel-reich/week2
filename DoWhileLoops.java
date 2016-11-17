import java.util.Scanner;

public class DoWhileLoops{ 
    
    
    public static void main(String args[]) {
        DoWhileLoops loop = new DoWhileLoops();
        System.out.print("Please enter a value:");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        loop.whileLoop(start);
        System.out.println();
        loop.doWhileLoop(start);
    }
    
    private void whileLoop(int start){
        while(start>0){
            System.out.println(start);
            start--;
        }
    }
    
    private void doWhileLoop(int start){
        do {
            System.out.println(start);
            start--;
        } while(start>0);
    }

    // create a new method called 'whileLoop' that takes an int called 'start' from the command line
        // create a while loop that iterates from start to zero and prints out the result

    // create a new method called 'doWhileLoop' that takes an int called 'start' from the command line
        // create a do-while loop that iterates from start to zero and prints out the result
}

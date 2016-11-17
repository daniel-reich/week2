public class FizzBuzz {

    public static void main(String[] args) {
        for (int i=1; i<101; i++){

        System.out.print(i % 15 == 0? "FizzBuzz\n" : (i % 3 == 0? "Fizz\n" : (i%5==0 ? "Buzz\n":i+"\n")));
        
        }
    }
}

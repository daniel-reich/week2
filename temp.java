import java.io.*;

public class temp
{
    public static void main (String[] args) 
    throws Exception
    {
        String userName = null;

        //  prompt the user to enter their name
        System.out.print("Enter your name: ");

        //  open up standard input, and buffer it
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // use the readLine method of the BufferedReader class
        // to get whatever line the user types in:
        userName = bufferedReader.readLine();
        System.out.println("Thanks for the name, " + userName);
    }
}

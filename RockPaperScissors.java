import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {   
    private String player1Choice;
    private String computerChoice;

    public static void main(String[] args) {
        
        
        RockPaperScissors rps = new RockPaperScissors();
        rps.setPlayerChoices();
        rps.decideWinner();
    }

    private void setPlayerChoices() {
        Scanner scanner = new Scanner(System.in);
        player1Choice = "";
        System.out.println("Please choose rock, paper of scissors.");
        while (!(player1Choice.equals("rock") || player1Choice.equals("paper") || player1Choice.equals("scissors"))){
            player1Choice = scanner.nextLine();
            player1Choice.toLowerCase();
            if (!(player1Choice.equals("rock") || player1Choice.equals("paper") || player1Choice.equals("scissors"))) {
                System.out.println("Invalid response. Try again");
            }
        
        }
        
        int randomChoice = generateRandom();
        switch (player1Choice) {
            case "rock": 
                if (randomChoice == 1){
                    computerChoice = "paper";
                } else {
                    computerChoice = "scissors";
                }
		break;
            
            case "paper": 
                if (randomChoice == 1){
                    computerChoice = "rock";
                } else {
                    computerChoice = "scissors";
                }
		break;
                
            case "scissors": 
                if (randomChoice == 1){
                    computerChoice = "paper";
                } else {
                    computerChoice = "rock";
                }
		break;
        }


    }

    private void decideWinner() {
        String winner ="";
        if (player1Choice.equals("rock") && computerChoice.equals("scissors") || player1Choice.equals("paper") && computerChoice.equals("rock") || player1Choice.equals("scissors") && computerChoice.equals("paper")){
            winner = "PLAYER";
        } else {
            winner = "COMPUTER";
        }

        System.out.println("Player: "+player1Choice.toUpperCase()+" vs Computer: "+computerChoice.toUpperCase()+" ---- "+winner+" WINS!");

    }
    
    private int generateRandom() {
        Random random = new Random();
        int randNumber = random.nextInt(2);
        return randNumber;   
    }
    
}

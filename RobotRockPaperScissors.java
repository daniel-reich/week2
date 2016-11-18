import java.util.*;

public class RobotRockPaperScissors {   
    private String computer1Choice;
    private String computer2Choice;

    public static void main(String[] args) {
        RobotRockPaperScissors rps = new RobotRockPaperScissors();
        ArrayList<String> finalScore = new ArrayList<String>();
        
        for (int i=0; i<1000; i++){
        rps.setPlayerChoices();
        //rps.decideWinner();
        finalScore.add(rps.decideWinner());
        }
        
        int numGames = finalScore.size();
        int playerWins = Collections.frequency(finalScore, "PLAYER");
        int computerWins = Collections.frequency(finalScore, "COMPUTER");
        
        System.out.println("Total rounds: "+numGames);//Figure out how to take stats from array, then print
        System.out.println("Player won "+playerWins+" games.");
        System.out.println("Computer won "+computerWins+" games.");
    }

    private void setPlayerChoices() {
        int random1Choice = generateRandomComputer1();
        if (random1Choice == 0){
            computer1Choice = "rock";
        } else if (random1Choice == 1){
            computer1Choice = "paper";
        } else {   
            computer1Choice = "scissors";
        }    
        
        int random2Choice = generateRandomComputer2();
        switch (computer1Choice) {
            case "rock": 
                if (random2Choice == 1){
                    computer2Choice = "paper";
                } else {
                    computer2Choice = "scissors";
                }
                break;
            
            case "paper": 
                if (random2Choice == 1){
                    computer2Choice = "rock";
                } else {
                    computer2Choice = "scissors";
                }
                break;
                
            case "scissors": 
                if (random2Choice == 1){
                    computer2Choice = "paper";
                } else {
                    computer2Choice = "rock";
                }
                break;
        }


    }

    private String decideWinner() {
        String winner ="";
        if (computer1Choice.equals("rock") && computer2Choice.equals("scissors") || computer1Choice.equals("paper") && computer2Choice.equals("rock") || computer1Choice.equals("scissors") && computer2Choice.equals("paper")){
            winner = "PLAYER";
        } else {
            winner = "COMPUTER";
        }

        //System.out.println("Player: "+computer1Choice.toUpperCase()+" vs Computer: "+computer2Choice.toUpperCase()+" ---- "+winner+" WINS!");
        return winner;
    }
    
    private int generateRandomComputer1() {
        Random random = new Random();
        int randNumber = random.nextInt(3);
        return randNumber;   
    }
    
    private int generateRandomComputer2() {
        Random random = new Random();
        int randNumber = random.nextInt(2);
        return randNumber;   
    }
    
}

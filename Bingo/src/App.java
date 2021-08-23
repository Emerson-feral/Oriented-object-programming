import java.util.Arrays;

import service.BingoRules;
import service.Card;

public class App {
    public static void main(String[] args) throws Exception {
        
        Card card = new Card();
        BingoRules bingoRules = new BingoRules();

        Integer[] userCard = card.fulFilCard();
        
        System.out.println(Arrays.toString(userCard));

        Boolean running = true;

        int match = 0;

        while(running){
            
            if(match == 4){
                running = false;
                System.out.println("Bingo");
            }else{
                int randomNumber = bingoRules.getRandomNumber();
                System.out.println("Random num: " + randomNumber);
                for(int i = 0; i < userCard.length;i++){
                    if(userCard[i] == randomNumber){
                        match++;
                        System.out.println("Match " + match);
                    }
                }
            }
        }
                
    }
}


package service;

public class Card {
    
    public Integer[] fulFilCard(){
        
        BingoRules bingoRules = new BingoRules();

        Integer[] userCard = new Integer[4];
    
        for (int i = 0; i < userCard.length;i++) {
            userCard[i] = bingoRules.getUserCard();
        }

        return userCard;
    }
}

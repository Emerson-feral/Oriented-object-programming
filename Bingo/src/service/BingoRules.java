package service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class BingoRules {
    
    List<Integer> repeatedNum = new ArrayList<>();

    public Integer getRandomNumber(){

        Integer randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        
        if(repeatedNum.size() == 0){
            this.repeatedNum.add(randomNum);
            return randomNum;
        }else{
            for (int i = 0; i < repeatedNum.size(); i++) {
                while (randomNum == repeatedNum.get(i)) {
                    randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
                }
            }
            this.repeatedNum.add(randomNum);
        }

        
        System.out.println("Repetead num: " + repeatedNum);
        return randomNum;
    }


    public Integer getUserCard(){
        
        Integer randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);

        return randomNum;
    }

}

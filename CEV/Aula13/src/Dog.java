public class Dog extends Wolf {
    
    @Override
    public void sound(){
        System.out.println("Au Au Au Au");
    }

    public void react(String phrase){
        if(phrase == "Here's your food" || phrase == "Hello"){
            System.out.println("Wag tail and bark");
        }else{
            System.out.println("Growl");
        }
    }

    public void react(Integer hour, Integer minute){
        if(hour < 12){
            System.out.println("Wag tail");
        }else if(hour >= 18){
            System.out.println("Ignore");
        }else{
            System.out.println("Wag tail and bark");
        }
    }

    public void react(Boolean owner){
        if(owner == true){
            System.out.println("Wag tail");
        }else{
            System.out.println("Growl and bark");
        }
    }

    public void react(Integer age, Float weight){
        if (age < 5) {
            if (weight < 10) {
                System.out.println("Wag tail");
            }else{
                System.out.println("Bark");
            }
        } else {
            if (weight < 10) {
                System.out.println("Growl");
            } else {
                System.out.println("Ignore");
            }
        }
    }
}

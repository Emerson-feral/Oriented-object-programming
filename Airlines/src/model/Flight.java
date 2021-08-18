package model;

public class Flight {

   private Long id;
   private String origin;
   private String destiny;
   private Float price;

   public Flight(Long id, String origin,String destiny, Float price){
       this.id = id;
       this.origin = origin;
       this.destiny = destiny;
       this.price = price;
   }

   @Override
   public String toString() {
    return "ID: " + this.id + " Origin: " + this.origin + " Destiny: " + this.destiny + " Price: " + this.price;
   }

   public Long getId() {
       return id;
   }

   public String getOrigin() {
       return origin;
   }

   public String getDestiny() {
       return destiny;
   }

   public Float getPrice() {
       return price;
   }
}

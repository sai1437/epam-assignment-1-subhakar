//implementing comparable interface for sorting 
public class Sweets implements Comparable<Sweets>,Choco_Sweet {

		   private int weight;
		   private int price;
		   private String name = null;
		  

		  /* public Sweets(int weight, int price,String sweetname) {
		       this.weight = weight;
		       this.price = price;
		       this.sweetname = sweetname;
		   }*/

		  
		   public int compareTo(Sweets o1) {
		       return this.weight - o1.weight;
		   }

		   // Setters and Getters
		   
		   public String toString() {
		       return "Gift : " + weight + " - " + price + " - " + name + "\n";
		   }


		   public int getWeight() {
			   return weight;
		   }


		   public void setWeight(int weight) {
			   this.weight = weight;
		   }


		   public int getPrice() {
			   return price;
		   }


		   public void setPrice(int price) {
			   this.price = price;
		   }

		   public String getname() {
			   return name;
		   }

		   public void setname(String name) {
			   this.name = name;
		   }


		
}


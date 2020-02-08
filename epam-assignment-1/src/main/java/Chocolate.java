//implementing comparable interface for sorting list
public class Chocolate implements Comparable<Chocolate>,Choco_Sweet {

		   private int weight;
		   private int price;
		   private String name = null;
		  
		  //we can also use the constructor for initializing 
		  /* public Chocolate(int weight, int price,String choconame) {
		       this.weight = weight;
		       this.price = price;
		       this.choconame = choconame;
		   }*/

		  //getter and setter methods for weights and price
		   public int compareTo(Chocolate o) {
		       return this.weight - o.weight;
		   }

		  
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

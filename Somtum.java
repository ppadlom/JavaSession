import java.util.List;

public class Somtum {
 
	private String name;
	private int price;
	
	public Somtum(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;	
	}
	public int getPrice() {
		return price;
	}
	
    public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString(){
		return "\nName : " + name + "\nPrice : " + price ;
	}
	
	public static int mostExpensive(List<Somtum> somtums) {
	int max = 0;
		for (Somtum som : somtums) {
			// 1 som = 40
			// 2 som = 35
			// 3 som = 30
			if (som.getPrice() > max) {
				max = som.getPrice();
			}
		}
		return max;
	}

}
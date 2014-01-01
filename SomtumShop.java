import java.util.List;
import java.util.ArrayList;

public class SomtumShop {
	public static void main(String[] args) {
		Somtum hoidong = new Somtum("Hoidong", 40);
		//System.out.println(hoidong);
		
		Somtum tamthai = new Somtum("Tumthai", 35);
		//System.out.println(tamthai);
		
		Somtum tumpoo = new Somtum("Tumpoo", 30);
		//System.out.println(tumpoo);
		
		
		List<Somtum> somtums = new ArrayList<>();
		somtums.add(hoidong);
		somtums.add(tamthai);
		somtums.add(tumpoo);
       
        for (Somtum som : somtums) {
            System.out.println(som);
		}
		
		// As a customer, I want to know how many somtum I ordered.
		
		System.out.println("Size of somtum : " + somtums.size());
		int sum = 0;
		
		//System.out.println(hoidong.getPrice());
		for (Somtum som : somtums) {
			sum += som.getPrice();
		}
		int max = Somtum.mostExpensive(somtums);
		System.out.println("Most expensive somtum is " + max);
		
		System.out.println("Total Price : " + sum);
	}
}

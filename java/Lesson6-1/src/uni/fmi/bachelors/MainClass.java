package uni.fmi.bachelors;

public class MainClass {

	public static void main(String[] args) {
		Lizzard l1 = new Lizzard("Пешо", 150, 2.3, 3, 10, 40, 20);
		Lizzard l2 = new Lizzard("Пенка", 100, 4, 5, 14, 10, 30);
		
		l1.target = l2;
		l2.target = l1;
		
		l1.start();
		l2.start();
	}

}

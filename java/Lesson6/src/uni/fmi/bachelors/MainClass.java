package uni.fmi.bachelors;

public class MainClass {

	public static void main(String[] args) {
		Chicken c1 = new Chicken("�����", 20, 300, 90, 30, 40, 5, 4);
		Chicken c2 = new Chicken("�����", 30, 700, 30, 10, 10, 10, 2);
		c1.target = c2;
		c2.target = c1;
		
		c1.start();
		c2.start();
		

	}

}

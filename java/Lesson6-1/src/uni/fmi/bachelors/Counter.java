package uni.fmi.bachelors;

public class Counter extends Thread
//implements Runnable ако искаме да е с интерфейс
{
	String name;
	static int count = 0;
	
	public Counter(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
	
		while(count < 1000) {
			count++;
			System.out.println(name + ":" + count);
		}
	}

}

package uni.fmi.bachelors;

public class Counter extends Thread 
{

	String name;
	static int count = 0;
	
	public Counter(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
	
		while(count < 1001) {//15
			System.out.println(name + ":" + count);
			count++;
		}
		
	}

}

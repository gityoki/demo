package textxxxx;

public class aqe extends Thread{

	
	
	@Override
	public void run() {
		System.out.println(123);
	}

	public static void main(String[] args) {
		aqe a=new aqe();
		a.start();

	}

}

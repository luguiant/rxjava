package rxjava;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Delay {
	private Delay() {}
	
	public static void delayMethod() {
		try {
			 Observable.range(20, 10).delay(2, TimeUnit.SECONDS).subscribe(System.out::println);
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

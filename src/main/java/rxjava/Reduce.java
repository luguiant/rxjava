package rxjava;

import io.reactivex.Observable;

public class Reduce {
	private Reduce() {}
	
	public static void reduceMethod() {
		Observable.range(1,10).reduce((x,y) -> x+y ).subscribe(System.out::println);
	}
}

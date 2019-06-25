package rxjava;

import io.reactivex.Observable;

public class Repeat {
	private Repeat() {}
	
	public static void repeatMethod() {
		Observable.range(1,5).repeat(5).subscribe(System.out::println);
	}
}

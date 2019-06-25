package rxjava;

import io.reactivex.Observable;

public class Range {
	private Range() {}
	
	public static void rangeMethod() {
		Observable.range(1,10).subscribe(item ->  System.out.println(item));
	}
}

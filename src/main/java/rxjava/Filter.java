package rxjava;

import io.reactivex.Observable;

public class Filter {
	private Filter() {}
	
	public static void filterMethod() {
		Observable.range(1,200).filter(x -> x % 20 == 0).subscribe(System.out::println);
	}
}

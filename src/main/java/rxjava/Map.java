package rxjava;

import io.reactivex.Observable;

public class Map {
	private Map() {}
	
	public static void mapMethod() {
		Observable.range(1,10).map(data -> Math.sqrt(data)).subscribe(item -> System.out.println(item));
	}
}

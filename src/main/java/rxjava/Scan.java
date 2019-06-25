package rxjava;

import io.reactivex.Observable;

public class Scan {
	private Scan() {}
	
	public static void scanMethod() {
		Observable<String> obser = Observable.just("Hola", " soy ", "una", " prueba");
		
		obser.scan((x,y) -> x+y ).subscribe(System.out::println);
	}
}

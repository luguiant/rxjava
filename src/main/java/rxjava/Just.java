package rxjava;

import io.reactivex.Observable;

public class Just {
	private Just() {}
	
	public static void justMethod() {
		String data = "Hola somos la comunidad SWAT";
		
		Observable<String> obser = Observable.just(data);
		obser.subscribe(item -> System.out.println(item));
	}
}

package rxjava;

import io.reactivex.Observable;

public class From {
	private From() {}
	
	public static void fromMethod() {
		String data = "Hola somos la comunidad SWAT";
		
		Observable<String> obser = Observable.fromArray(data);
		obser.subscribe(item -> System.out.println(item));
	}
	
}

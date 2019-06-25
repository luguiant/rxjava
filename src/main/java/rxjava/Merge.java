package rxjava;

import io.reactivex.Observable;

public class Merge {
	private Merge() {}
	
	public static void mergeMethod() {
		String[] listFirst = {"A", "B", "C", "D"};
		String[] listSecond = {"E", "F", "G"};
		
		 Observable<String> observableFirst = Observable.fromArray(listFirst);
		 Observable<String> observableSecond = Observable.fromArray(listSecond);
		 
		 Observable.concat(observableFirst,observableSecond).subscribe(System.out::println);
	}
}

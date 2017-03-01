import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Memorizer<A,V> implements Computable<A, V>{
	
	ConcurrentMap<A, Future<V>> cache = new ConcurrentHashMap<A,Future<V>>();
	private final Computable<A, V> c;
	


	public Memorizer(Computable<A, V> c) {
		super();
		this.c = c;
	}



	@Override
	public V compute(A key) throws Exception {
		 Future<V> f = cache.get(key);
		
		ExecutorService es = Executors.newCachedThreadPool();
		
		if(f==null){
			Callable<V> call = ()->c.compute(key);
			Future<V> future = es.submit(call);
			cache.putIfAbsent(key, f);
		}
		
		es.shutdown();
		
		return f.get();
	}

}

package cacher.aop;

import java.util.List;

import cacher.fetcher.FetchManager;

/**
 * <p>Generates the key(s) that should be used by the {@link FetchManager}.</p>
 * 
 * <p>As it is difficult to determine how the key(s) is passed into the {@link FetcherMethod}, implementations
 * of this interface tell the {@link CacheInterceptor} how to retrieve the key(s) and ultimately what the cached
 * key should be.</p>
 * 
 * @author Dennis Crissman
 */
public interface KeyGenerator {

	/**
	 * @param arguments - Method arguments passed into called method.
	 * @return single key
	 */
	String generateKey(Object[] arguments);

	/**
	 * @param arguments - Method arguments passed into called method.
	 * @return list of keys
	 */
	List<String> generateKeys(Object[] arguments);

}
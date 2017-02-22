package project.kage.example.spring.dbunit.service;

/**
 * @author papa
 *
 */
public interface DatabaseService {

	<T, R> Iterable<T> findAll(final Class<R> repoClass);
}

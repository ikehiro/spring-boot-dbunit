package project.kage.example.spring.dbunit.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import project.kage.example.spring.dbunit.common.KGUtils;
import project.kage.example.spring.dbunit.service.DatabaseService;

/**
 * @author papa
 *
 */
@Service
public class DatabaseServiceImpl implements DatabaseService {

	@Resource
	private ApplicationContext context;

	@Override
	public <T, R> Iterable<T> findAll(final Class<R> repoClass) {

		CrudRepository<T, Serializable> repository = getRepository(repoClass);

		return repository.findAll();
	}

	private <T, R> CrudRepository<T, Serializable> getRepository(final Class<R> repoClass) {

		Object obj = context.getBean(repoClass);

		CrudRepository<T, Serializable> repository = KGUtils.cast(obj);

		return repository;
	}

	public <R, T> long count(final Class<R> repoClass) {
		CrudRepository<T, Serializable> repository = getRepository(repoClass);

		return repository.count();
	}

	public <R, T> T save(final Class<R> repoClass, final T entity) {
		CrudRepository<T, Serializable> repository = getRepository(repoClass);

		return repository.save(entity);
	}

}

package project.kage.example.spring.dbunit.repository;

import org.springframework.data.repository.CrudRepository;

import project.kage.example.spring.dbunit.model.dto.Order;

/**
 * @author papa
 *
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

}

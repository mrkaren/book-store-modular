package am.itspace.bookstorecommon.repository;

import am.itspace.bookstorecommon.model.Order;
import am.itspace.bookstorecommon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findAllByUser(User user);

}

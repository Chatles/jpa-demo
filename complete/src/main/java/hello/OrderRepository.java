package hello;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository  extends CrudRepository<Order, Integer> {
//    public void find
}

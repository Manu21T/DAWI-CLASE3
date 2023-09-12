
package pe.cibertec.Ecommerce.ApiShoppingCart.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.Ecommerce.ApiShoppingCart.ENTITY.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}

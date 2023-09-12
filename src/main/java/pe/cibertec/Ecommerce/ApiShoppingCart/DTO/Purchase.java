
package pe.cibertec.Ecommerce.ApiShoppingCart.DTO;

import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import pe.cibertec.Ecommerce.ApiShoppingCart.ENTITY.Order;
import pe.cibertec.Ecommerce.ApiShoppingCart.ENTITY.OrderItem;

@Getter
@Setter
public class Purchase {
    Order order;
    Set<OrderItem> oderItems;
    
}

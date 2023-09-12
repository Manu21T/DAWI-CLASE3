
package pe.cibertec.Ecommerce.ApiShoppingCart.SERVICE;

import jakarta.transaction.Transactional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.Ecommerce.ApiShoppingCart.DAO.OrderRepository;
import pe.cibertec.Ecommerce.ApiShoppingCart.DTO.Purchase;
import pe.cibertec.Ecommerce.ApiShoppingCart.DTO.PurchaseResponse;
import pe.cibertec.Ecommerce.ApiShoppingCart.ENTITY.Order;

@Service
public class ShoppingCarServiceImpl implements ShoppingCarService{

    @Autowired
    private OrderRepository OrderRepository; 
            
    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        //Obtengo el pedido que me pasa el cliente
       Order order = purchase.getOrder();
       
       //Configuro un numero de tracking
       order.setTrackingNumber(getTrackingNumber());
       
       //Para que cada item de pedido sepa a que pedido pertenece
       purchase.getOderItems().forEach(i->{
           order.addOrderItem(i);
       });
       
       //Graba a la BD Mysql en una transaccion
       OrderRepository.save(order);
       return new PurchaseResponse(order.getTrackingNumber());
    }
    
    private String getTrackingNumber(){
        return UUID.randomUUID().toString();
    }

}
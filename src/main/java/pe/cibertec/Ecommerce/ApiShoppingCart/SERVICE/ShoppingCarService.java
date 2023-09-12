
package pe.cibertec.Ecommerce.ApiShoppingCart.SERVICE;

import pe.cibertec.Ecommerce.ApiShoppingCart.DTO.Purchase;
import pe.cibertec.Ecommerce.ApiShoppingCart.DTO.PurchaseResponse;


public interface ShoppingCarService {
    public PurchaseResponse placeOrder(Purchase purchase);
}

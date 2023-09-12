
package pe.cibertec.Ecommerce.ApiShoppingCart.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.Ecommerce.ApiShoppingCart.DTO.Purchase;
import pe.cibertec.Ecommerce.ApiShoppingCart.DTO.PurchaseResponse;
import pe.cibertec.Ecommerce.ApiShoppingCart.SERVICE.ShoppingCarService;

@RestController
@RequestMapping("api/v1/ShoppingCartController")
public class ShoppingCartController {
   @Autowired
    private ShoppingCarService cartService;
   
   @PostMapping("/placeOrder")
    public PurchaseResponse placeOrder(Purchase purchase){
        return cartService.placeOrder(purchase);
           
 
        
    }
}

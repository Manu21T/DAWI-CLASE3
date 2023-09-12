
package pe.cibertec.Ecommerce.ApiShoppingCart.ENTITY;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable

public class Customer {
    
    private Long customerId;
    private String name;
    private String email;
    private String phone;
    
}



package pe.cibertec.Ecommerce.ApiShoppingCart.ENTITY;

import jakarta.persistence.Embeddable;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Embeddable
public class Item {
    
    private Long productId;
    private String productName;
    private BigDecimal unitPrice;
    
}


package pe.cibertec.Ecommerce.ApiShoppingCart.ENTITY;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Entity
@Data
@Table(name = "Orders")


public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    
    @Embedded
    private Customer customer;
    
    private Date orderDate;
    private String trackingNumber;
    private BigDecimal amount;
    
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Set<OrderItem> orderItems;
    
    public void addOrderItem(OrderItem orderItem){
        if (orderItems==null){
            orderItems=new  HashSet<>();
        }
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }
}

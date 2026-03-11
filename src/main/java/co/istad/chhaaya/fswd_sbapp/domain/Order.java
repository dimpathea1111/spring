package co.istad.chhaaya.fswd_sbapp.domain;

//public class Order {
//}

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantity;

    // Many orders can have the same product
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

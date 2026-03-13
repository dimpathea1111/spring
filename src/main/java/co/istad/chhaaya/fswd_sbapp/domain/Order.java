package co.istad.chhaaya.fswd_sbapp.domain;

//public class Order {
//}

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

//@Entity
//@Table(name = "orders")
//@Getter
//@Setter
//@NoArgsConstructor
//public class Order {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    private Integer quantity;
//
//    // Many orders can have the same product
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    private Product product;
//}

//Make POLO (plain old javaobject)
@Getter
@Setter
@NoArgsConstructor

//Make JPA Entity
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;

    @Column(nullable = false)
    private Float descount;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String orderedBy;

    @Column(nullable = false)
    private Instant orderedAt;

    @Column(nullable = false)
    private Boolean isDelete;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetail;






}














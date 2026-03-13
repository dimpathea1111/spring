package co.istad.chhaaya.fswd_sbapp.domain;
//

import jakarta.persistence.*;
import jdk.jfr.StackTrace;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

////public class Product {
////}
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.List;
//
//@Entity
//@Table(name = "products")
//@Getter
//@Setter
//@NoArgsConstructor
//public class Product {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    private String name;
//
//    private Double price;
//
//    // Many products belong to one category
//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private Category category;
//
//    // One product can appear in many orders
//    @OneToMany(mappedBy = "product")
//    private List<Order> orders;
//}


    @Entity
    @Table(name ="products")
@Getter
@Setter
@NoArgsConstructor
public  class Product {
    @Id
    private String code;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private BigDecimal price;

    @Column(nullable=false)
    private Integer qty;
    //default lenght =255
    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private Boolean isAvailable;

    //relationship here
    @ManyToOne
//    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetail;
}



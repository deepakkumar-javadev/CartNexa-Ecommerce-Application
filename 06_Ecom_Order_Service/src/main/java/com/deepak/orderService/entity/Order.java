
package com.deepak.orderService.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Orders", indexes = {
        @Index(name = "idx_order_user_id", columnList = "userid"),
        @Index(name = "idx_order_order_number", columnList = "order_number"),
        @Index(name = "idx_order_payment_status", columnList = "paymentstatus"),
        @Index(name = "idx_order_created_at", columnList = "create_at")
})
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderid;

    @Column(name = "order_number")
    private String orderNumber;

    private Long userid;

    private Double totalAmount;

    private String paymentMethod;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderstatus;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentstatus;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<>();

    @PrePersist
    protected void onCreate() {
        createAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}

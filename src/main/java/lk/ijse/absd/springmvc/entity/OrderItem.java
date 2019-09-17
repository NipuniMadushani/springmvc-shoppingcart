package lk.ijse.absd.springmvc.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "grand_total")
    private Double grandTotal;
    @Column(name = "cart_lines")
    private Integer cartLines;
    @Column(name = "image_url")
    private String imageUrl;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private OrderDetail orderDetail;


    public OrderItem() {
    }

    public OrderItem(Double grandTotal, Integer cartLines, String imageUrl, OrderDetail orderDetail) {
        this.grandTotal = grandTotal;
        this.cartLines = cartLines;
        this.imageUrl = imageUrl;
        this.orderDetail = orderDetail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Integer getCartLines() {
        return cartLines;
    }

    public void setCartLines(Integer cartLines) {
        this.cartLines = cartLines;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", grandTotal=" + grandTotal +
                ", cartLines=" + cartLines +
                ", imageUrl='" + imageUrl + '\'' +
                ", orderDetail=" + orderDetail +
                '}';
    }
}

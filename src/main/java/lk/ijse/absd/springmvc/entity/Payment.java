package lk.ijse.absd.springmvc.entity;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "pay_method")
    private String payMethod;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "expire_date")
    private String expireDate;

    @Column(name = "total_amount")
    private Double totalAmount;

    @OneToOne
    private OrderDetail orderDetail;

    public Payment() {
    }

    public Payment(String payMethod, String cardNumber, String expireDate, Double totalAmount, OrderDetail orderDetail) {
        this.payMethod = payMethod;
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.totalAmount = totalAmount;
        this.orderDetail = orderDetail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", payMethod='" + payMethod + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", totalAmount=" + totalAmount +
                ", orderDetail=" + orderDetail +
                '}';
    }
}

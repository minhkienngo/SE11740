/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.OrderDBcontext;
import dal.OrderDetailDBcontext;
import java.util.List;

public class Order {

    private int id;
    private Account account;
    private double totalPrice;
    private String note;
    private String createdDate;
    private Shipping shipping;
    private boolean status;
    private List<OrderDetail> details;
    private int numOfProduct;

    public Order() {
    }


    public Order(int id, Account account, double totalPrice, String note, String createdDate, Shipping shippingId, boolean status) {
        this.id = id;
        this.account = account;
        this.totalPrice = totalPrice;
        this.note = note;
        this.createdDate = createdDate;
        this.shipping = shippingId;
        this.status = status;
        this.details = new OrderDetailDBcontext().getAllOrderDetailById(this.id); //constructor ko có id????
        this.numOfProduct = this.details.size();
    }
    

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public List<OrderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetail> details) {
        this.details = details;
    }

    public int getNumOfProduct() {
        return numOfProduct;
    }

    public void setNumOfProduct(int numOfProduct) {
        this.numOfProduct = numOfProduct;
    }
    

}

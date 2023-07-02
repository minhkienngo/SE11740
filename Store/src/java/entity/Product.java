/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author minhk
 */
public class Product {
    private int id;
    private String Title;
    private int stock;
    private double price; 
    private String ImagePath;
    public Product(){
        
        
    }

    public Product(int id, String Title,int stock,double price, String ImagePath ) {
        this.id = id;
        this.Title = Title;
        this.stock = stock; 
        this.price = price;
        this.ImagePath = ImagePath;
        
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    } public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String ImagePath) {
        this.ImagePath = ImagePath;
    }

   

    

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", Title=" + Title + ", ImagePath=" + ImagePath + ", stock=" + stock + ", price=" + price + '}';
    }
    
    
}

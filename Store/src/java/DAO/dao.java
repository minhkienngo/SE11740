/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import context.DBContext;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author minhk
 */
public class dao extends DBContext{
    private PreparedStatement stm;
     private ResultSet rs;
    private List<Product> list;
    public List<Product> getAllProduct(){
        List<Product> list= new ArrayList<>();
        String query=" select * from Product";
        try {
             stm = connection.prepareStatement(query);
            rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getString(5))
                        
                );
            }
        } catch (Exception e) {
            
        }
        return list;
    }
    public static void main(String[] args) {
        dao DAO =new dao();
        List<Product> list= DAO.getAllProduct();
         for (Product p : list) {
            System.out.println(p);
        }
    }
}

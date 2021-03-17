package com.company;

public class testProduct {
 public static void main(String[] args){
     Product product = new Product();
     product.product_name="A Random Product";
     product.product_price= 200.50;
     product.product_id = 468733468;

     product.showDetails();

 }

}

class Product {
    String product_name ;
    int product_id ;
    double product_price;

    void showDetails (){
        System.out.println("Product Name" + product_name);
        System.out.println("Product id" + product_id);
        System.out.println("Product Price" + product_price);

    }


}
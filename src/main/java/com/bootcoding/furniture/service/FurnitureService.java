package com.bootcoding.furniture.service;

import com.bootcoding.furniture.modal.Furniture;
import com.bootcoding.furniture.utils.ProductGenrator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FurnitureService {
    public static final int PRODUCTS = 80;

   public static List<Furniture> getAllFurniture(){
     List<Furniture> furnitures = new ArrayList<>();
     for (int i=0;i<PRODUCTS;i++){
         Furniture furniture = buildFurniture();
         furnitures.add(furniture);
     }
       return furnitures;
   }

    private static Furniture buildFurniture() {
       Furniture furniture = new Furniture();
       furniture.setProducts(ProductGenrator.getProducts());
       return furniture;
    }


}

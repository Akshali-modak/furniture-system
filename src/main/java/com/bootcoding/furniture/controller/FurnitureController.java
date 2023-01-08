package com.bootcoding.furniture.controller;

import com.bootcoding.furniture.modal.Furniture;
import com.bootcoding.furniture.service.FurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FurnitureController {
    @Autowired
    FurnitureService furnitureService;

    @GetMapping("/furniture")
    public List<Furniture> getAllFurniture(){

        return furnitureService.getAllFurniture();
    }
}

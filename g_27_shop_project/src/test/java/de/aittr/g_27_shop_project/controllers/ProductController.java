package de.aittr.g_27_shop_project.controllers;

import de.aittr.g_27_shop_project.domain.CommonProduct;
import de.aittr.g_27_shop_project.domain.interfaces.Product;
import de.aittr.g_27_shop_project.services.interfaces.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // http://12.34.56.78:8080/product - POST
    @PostMapping
    public Product save(@RequestBody CommonProduct product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAllActiveProducts();
    }
}
package thepirates.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class ProductController {
    @PostMapping("/api/product")
    public Boolean addProduct(@RequestBody Map paramMap){
        System.out.println("ProductController.addProduct");
        System.out.println("paramMap:"+paramMap);

        return true;
    }

    @GetMapping("/api/product")
    public String getAllProduct(){
        System.out.println("ProductController.getAllProduct");
        return "hello";
    }

    @GetMapping("/api/product/{id}")
    public String getOneProduct(){
        System.out.println("ProductController.getAllProduct");

        return "hello";
    }

    @DeleteMapping("/api/product")
    public String deleteProduct(){
        System.out.println("ProductController.getAllProduct");

        return "hello";
    }
}

package co.istad.chhaaya.fswd_sbapp.controller;


import co.istad.chhaaya.fswd_sbapp.dto.CreateProductRequest;
import co.istad.chhaaya.fswd_sbapp.dto.ProductResponse;
import co.istad.chhaaya.fswd_sbapp.dto.UpdateProductRequest;
import co.istad.chhaaya.fswd_sbapp.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@Slf4j
public class ProductController {

    final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductResponse> getAllProducts(
            @RequestParam(required = false, defaultValue = "0") int pageNumber,
            @RequestParam(required = false, defaultValue = "20") int pageSize) {

//        log.info("");
        log.info("pageNumber: {}, pageSize: {}", pageNumber, pageSize);
        return List.of();

    }

    @PostMapping("/{code}")
    public ProductResponse createNewProduct(@RequestBody CreateProductRequest createProductRequest, @PathVariable String code) {

//        System.out.println("Create product request:" + createProductRequest);
        log.info("Create ProductResponse : {}", createProductRequest);
        productService.createNew(createProductRequest);
        return null;

    }



    @PutMapping("/{code}")
    public ProductResponse updateProductByCode(@PathVariable String code, @RequestBody UpdateProductRequest updateProductRequest) {
        log.info("UpdateProductByCode : {}", updateProductRequest);
        return null;

    }


    @PatchMapping("/{code}")
    public ProductResponse updateProductPartiallyByCode(@PathVariable String code, @RequestBody UpdateProductRequest updateProductRequest) {
        log.info("UpdateProductPartiallyByCode : {}", updateProductRequest);
        return null;

    }
    @DeleteMapping("/{code}")
    public void deleteProductByCode(@PathVariable String code) {
    log.info("deleteProduct: {}",code);
    }
}

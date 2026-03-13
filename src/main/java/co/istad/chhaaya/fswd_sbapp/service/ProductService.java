package co.istad.chhaaya.fswd_sbapp.service;

import co.istad.chhaaya.fswd_sbapp.dto.CreateProductRequest;
import co.istad.chhaaya.fswd_sbapp.dto.ProductResponse;
import org.springframework.stereotype.Service;


public interface ProductService {

    //create a new product
    //return type
    //parameter

    ProductResponse createNew(CreateProductRequest createProductRequest);


}

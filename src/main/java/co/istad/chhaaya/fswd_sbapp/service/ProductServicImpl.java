package co.istad.chhaaya.fswd_sbapp.service;

import co.istad.chhaaya.fswd_sbapp.domain.Category;
import co.istad.chhaaya.fswd_sbapp.dto.CreateProductRequest;
import co.istad.chhaaya.fswd_sbapp.dto.ProductResponse;
import co.istad.chhaaya.fswd_sbapp.repository.CategoryRepository;
import co.istad.chhaaya.fswd_sbapp.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class ProductServicImpl  implements  ProductService{



    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductServicImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }


    @Override
    public ProductResponse createNew(CreateProductRequest createProductRequest) {
        //TODO
        //TODO: validate section
        //1. validate category id
//        Category existingCategory=catR
        Category existingCategory=categoryRepository
                .findById(createProductRequest.categoryId())
                .orElseThrow(()-> new RuntimeException("Category ID doesn't exist!"));
        log.info("existingCategory: {}", existingCategory.getId());
        return null;
    }


}

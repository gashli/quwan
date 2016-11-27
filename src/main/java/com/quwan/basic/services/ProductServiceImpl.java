package com.quwan.basic.services;


import com.quwan.basic.dao.ProductDao;
import com.quwan.basic.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductDao productRepository;

    @Autowired
    public void setProductRepository(ProductDao productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.selectAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.selectByPrimaryKey(id);
    }

    @Override
    public Product saveProduct(Product product) {
        productRepository.insert(product);
        return product;
    }
}

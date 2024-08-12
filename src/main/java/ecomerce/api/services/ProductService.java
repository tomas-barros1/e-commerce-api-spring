package ecomerce.api.services;

import ecomerce.api.domain.Product;
import ecomerce.api.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository repository) {
        this.productRepository = repository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}

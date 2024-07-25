package ecomerce.api.services;

import ecomerce.api.domain.Category;
import ecomerce.api.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryService {
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(UUID id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}

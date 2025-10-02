package tn.romdhani.managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.romdhani.managementsystem.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

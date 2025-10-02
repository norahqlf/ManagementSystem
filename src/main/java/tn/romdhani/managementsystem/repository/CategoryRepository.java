package tn.romdhani.managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.romdhani.managementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

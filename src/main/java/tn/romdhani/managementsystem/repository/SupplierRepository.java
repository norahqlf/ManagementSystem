package tn.romdhani.managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.romdhani.managementsystem.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}

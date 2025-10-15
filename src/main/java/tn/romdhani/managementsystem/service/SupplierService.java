package tn.romdhani.managementsystem.service;

import tn.romdhani.managementsystem.dto.CategoryDTO;
import tn.romdhani.managementsystem.dto.Response;
import tn.romdhani.managementsystem.dto.SupplierDTO;

public interface SupplierService {
    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSuppliers();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);
}

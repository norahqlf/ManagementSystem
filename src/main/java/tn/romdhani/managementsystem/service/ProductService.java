package tn.romdhani.managementsystem.service;

import org.springframework.web.multipart.MultipartFile;
import tn.romdhani.managementsystem.dto.ProductDTO;
import tn.romdhani.managementsystem.dto.Response;
import tn.romdhani.managementsystem.dto.SupplierDTO;

public interface ProductService {
    Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);

    Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);

    Response getAllProducts();

    Response getProductById(Long id);

    Response deleteProduct(Long id);
}

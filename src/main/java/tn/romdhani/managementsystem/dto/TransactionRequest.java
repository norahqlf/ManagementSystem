package tn.romdhani.managementsystem.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionRequest {

    @Positive(message = "Product id is required")
    private Long product_id;

        @Positive(message = "Quantity id is required")
    private Integer quantity;

    private Long supplier_id;

    private String description;

}

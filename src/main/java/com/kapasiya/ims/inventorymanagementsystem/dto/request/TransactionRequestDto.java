package com.kapasiya.ims.inventorymanagementsystem.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequestDto {
    private int quantity;
    private String transactionType;
    private String description;
    private double amount;
    private List<String> products;
}

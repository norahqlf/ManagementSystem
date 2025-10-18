package tn.romdhani.managementsystem.service;

import tn.romdhani.managementsystem.dto.Response;
import tn.romdhani.managementsystem.dto.TransactionRequest;
import tn.romdhani.managementsystem.enums.TransactionStatus;

public interface TransactionService {
    Response restockInventory(TransactionRequest transactionRequest);
    Response sell(TransactionRequest transactionRequest);
    Response returnToSupplier(TransactionRequest transactionRequest);
    Response getAllTransactions(int page, int size, String searchText);
    Response getTransactionById(Long id);
    Response getAllTransactionByMonthAndYear(int month, int year);
    Response updateTransactionStatus(Long transactionId, TransactionStatus transactionStatus);

}

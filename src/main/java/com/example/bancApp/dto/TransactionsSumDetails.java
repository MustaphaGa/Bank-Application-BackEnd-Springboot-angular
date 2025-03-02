package com.example.bancApp.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface TransactionsSumDetails {
    LocalDateTime getTransactionDate();
    BigDecimal getAmount();
}

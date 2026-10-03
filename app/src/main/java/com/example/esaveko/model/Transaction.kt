package com.example.esaveko.model

enum class TransactionType{
    INCOME,
    EXPENSE
}
data class Transaction (
    val id: Long = 0L,
    val type: TransactionType,
    val amountCentavos: Long,
    val category: String,
    val description: String,
    val date: Long
    )
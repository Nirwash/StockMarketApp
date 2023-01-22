package com.plcoding.stockmarketapp.presentation.company_listing

import com.plcoding.stockmarketapp.domain.model.CompanyListings

data class CompanyListingsState(
    val companies: List<CompanyListings> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = ""
)

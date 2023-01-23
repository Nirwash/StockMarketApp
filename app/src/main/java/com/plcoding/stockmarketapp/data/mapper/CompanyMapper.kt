package com.plcoding.stockmarketapp.data.mapper

import com.plcoding.stockmarketapp.data.local.CompanyListingsEntity
import com.plcoding.stockmarketapp.data.remote.dto.CompanyInfoDto
import com.plcoding.stockmarketapp.domain.model.CompanyInfo
import com.plcoding.stockmarketapp.domain.model.CompanyListings

fun CompanyListingsEntity.toCompanyListings() =
    CompanyListings(name = name, symbol = symbol, exchange = exchange)

fun CompanyListings.toCompanyListingsEntity() =
    CompanyListingsEntity(name = name, symbol = symbol, exchange = exchange)

fun CompanyInfoDto.toCompanyInfo() =
    CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
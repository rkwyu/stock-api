package com.rkwyu.stockapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "earning")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Earning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date", nullable = true)
    private LocalDate date;

    @Column(name = "period", nullable = true)
    private String period;

    @Column(name = "revenue_yoy", nullable = true)
    private String revenueYoy;

    @Column(name = "revenue_yoy_pct", nullable = true)
    private BigDecimal revenueYoyPct;

    @Column(name = "eps_yoy", nullable = true)
    private String epsYoy;

    @Column(name = "eps_yoy_pct", nullable = true)
    private BigDecimal epsYoyPct;

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "source_id", nullable = false)
    private Source source;

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "stock_id", nullable = false)
    private Stock stock;

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "currency_id", nullable = false)
    private Currency currency;
}

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
@Table(name = "analyst")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Analyst {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date", nullable = true)
    private LocalDate date;

    @Column(name = "rating", nullable = true)
    private String rating;

    @Column(name = "buy_pct", nullable = true)
    private BigDecimal buyPct;

    @Column(name = "hold_pct", nullable = true)
    private BigDecimal holdPct;

    @Column(name = "sell_pct", nullable = true)
    private BigDecimal sellPct;

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "source_id", nullable = false)
    private Source source;

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "stock_id", nullable = false)
    private Stock stock;

}

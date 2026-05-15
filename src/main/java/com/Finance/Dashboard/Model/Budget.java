package com.Finance.Dashboard.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "budgets")
@Data // Lombok: Handles getters, setters, equals, etc.
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Database handles the auto-increment
    private Long id;

    // Relationship: One user can have many budget goals
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Relationship: One budget goal applies to one specific category
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    // Using BigDecimal for financial precision
    private BigDecimal amount;

    // Period allows for "Monthly" or "Yearly" targets
    private String period;

    // Used to track which specific month/year the budget is for
    private Integer month;
    private Integer year;
}
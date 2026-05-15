package com.Finance.Dashboard.Repository;


import com.Finance.Dashboard.Model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {

    // Spring Data JPA magic: This generates a query to find all budgets for one user
    List<Budget> findByUserId(Long userId);
}
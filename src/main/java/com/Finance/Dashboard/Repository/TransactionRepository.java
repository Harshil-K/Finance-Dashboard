package com.Finance.Dashboard.Repository;


import com.Finance.Dashboard.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionRepository, Long> {
}

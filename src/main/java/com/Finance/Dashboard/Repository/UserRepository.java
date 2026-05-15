package com.Finance.Dashboard.Repository;


import com.Finance.Dashboard.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // No code needed here! JpaRepository provides all basic CRUD methods.
}
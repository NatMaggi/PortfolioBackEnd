
package com.ap.portfolio.repository;


import com.ap.portfolio.model.Login;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
    List<Login> findByUserName(String userName);
}
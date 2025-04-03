package com.K21CNT1.NQK.lesson11.Repository;

import com.K21CNT1.NQK.lesson11.Model.NQK_Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NQKAccountRepository extends JpaRepository<NQK_Account, Long> {
}

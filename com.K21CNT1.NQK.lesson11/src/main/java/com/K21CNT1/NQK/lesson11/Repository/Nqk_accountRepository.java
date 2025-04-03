package com.K21CNT1.NQK.lesson11.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.K21CNT1.NQK.lesson11.Model.Nqk_account;

@Repository
public interface Nqk_accountRepository extends JpaRepository<Nqk_account, Long> {

    // Custom query methods (if needed)
//    Nqk_account findByNqk_user(String Nqk_User);

   // Nqk_account findByNqk_Email(String Nqk_Email);

}

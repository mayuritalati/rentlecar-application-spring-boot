package com.mayuri;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ProfileRepository extends JpaRepository<Customer, Integer>{

}

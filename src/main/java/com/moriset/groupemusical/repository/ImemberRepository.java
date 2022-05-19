package com.moriset.groupemusical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moriset.groupmusical.model.Member;

@Repository
public interface ImemberRepository extends JpaRepository<Member, Long> {

}

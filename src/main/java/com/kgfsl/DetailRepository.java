package com.kgfsl;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

// @Repository("dr")
public interface DetailRepository extends JpaRepository<Demo,Long>
{

}
package com.ecomm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomm.entity.Profile;

@Repository
public interface ProfileRepo extends JpaRepository<Profile, Integer>{

}

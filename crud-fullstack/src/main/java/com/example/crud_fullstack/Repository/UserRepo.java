package com.example.crud_fullstack.Repository;

import com.example.crud_fullstack.Model.User2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User2, Long> {

}

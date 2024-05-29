package com.renanqueiroz.userdept.repositories;

import com.renanqueiroz.userdept.intities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository   <User, Long> {
}

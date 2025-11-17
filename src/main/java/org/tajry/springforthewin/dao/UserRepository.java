package org.tajry.springforthewin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tajry.springforthewin.dao.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
}

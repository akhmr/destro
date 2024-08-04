package com.destro.entity.repo;

import java.awt.print.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepo  extends JpaRepository<Book, Long> {

}

package com.joaoajuricaba.bookstoremanager.repository;

import com.joaoajuricaba.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}

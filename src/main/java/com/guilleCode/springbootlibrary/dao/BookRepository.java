package com.guilleCode.springbootlibrary.dao;

import com.guilleCode.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long> {
}

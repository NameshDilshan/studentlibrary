/**
 * 
 */
package com.library.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.student.Entity.Book;

/**
 * @date 16 Dec 2022
 * @Project studentlibrary
 * @user namesh_001543
 */
@Repository
public interface BookRepository extends JpaRepository<Book, String>{

}

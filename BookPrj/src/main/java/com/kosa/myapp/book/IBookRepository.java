package com.kosa.myapp.book;

import java.util.List;
import java.util.Map;

import com.kosa.myapp.book.BookVO;

import org.apache.ibatis.annotations.Param;


public interface IBookRepository {
	List<BookVO> getBookList();    
	BookVO getBookInfo(int bookid);  
	void updateBook(BookVO book);  
	void insertBook(BookVO book);   
	void deleteBook(@Param("bookid") int bookid, @Param("booktitle") String booktitle);  
	List<Map<String, Object>> getAllLocationId();
}

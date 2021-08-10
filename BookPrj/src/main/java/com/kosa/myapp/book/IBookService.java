package com.kosa.myapp.book;

import java.util.List;
import java.util.Map;

import com.kosa.myapp.book.BookVO;

public interface IBookService {
	List<BookVO> getBookList();
	BookVO getBookInfo(int bookid);  
	void updateBook(BookVO book);  
	void insertBook(BookVO book); 
	void deleteBook(int bookid, String bookname);
	List<Map<String, Object>> getAllLocationId();
}

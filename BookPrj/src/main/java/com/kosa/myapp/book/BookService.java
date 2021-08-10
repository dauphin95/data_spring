package com.kosa.myapp.book;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {

	@Autowired
	IBookRepository bookRepository;
	
	@Override
	public List<BookVO> getBookList() {
	return bookRepository.getBookList();
	}

	@Override
	public BookVO getBookInfo(int bookid) {
		return bookRepository.getBookInfo(bookid);
	}

	@Override
	public void updateBook(BookVO book) {
		bookRepository.updateBook(book);

	}

	@Override
	public void insertBook(BookVO book) {
		bookRepository.insertBook(book);

	}

	@Override
	public void deleteBook(int bookid, String bookname) {
		bookRepository.deleteBook(bookid, bookname);

	}

	@Override
	public List<Map<String, Object>> getAllLocationId() {
		return bookRepository.getAllLocationId();
	}

}

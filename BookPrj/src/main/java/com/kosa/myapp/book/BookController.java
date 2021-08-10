package com.kosa.myapp.book;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BookController {
	
	@Autowired
	IBookService bookService;
	
	@RequestMapping(value = {"/book", "/book/list"})
	public String getBookList(Model model){
		List<BookVO> bookList = bookService.getBookList();
		model.addAttribute("bookList", bookList);
		return "book/list";
	}
	
	
	@RequestMapping (value = {"/book/{bookId}"})
	public String getBookInfo(@PathVariable int bookId, Model model) {
		BookVO book = bookService.getBookInfo(bookId);
		model.addAttribute("book", book);
		model.addAttribute("locationList", bookService.getAllLocationId());
		return "book/view";
	}
	
	
	@RequestMapping (value = "/book/insert", method=RequestMethod.GET)
	public String insertBook(Model model) {
		model.addAttribute("locationList", bookService.getAllLocationId());
		return "book/insert";
	}
	
	@RequestMapping (value = "/book/insert", method= RequestMethod.POST)
	public String insertBook(BookVO book, Model model) {
		bookService.insertBook(book);
		return "redirect:/book";
		
	}
	

	@RequestMapping (value = "/book/update", method= RequestMethod.GET)
	public String updateBook(int bookid, Model model) {
		model.addAttribute("book", bookService.getBookInfo(bookid));
		model.addAttribute("locationList", bookService.getAllLocationId());
		return "book/update";
	}
	
	@RequestMapping(value = "/book/update", method = RequestMethod.POST)
	public String updateBook(BookVO book, Model model) {
		bookService.updateBook(book);
		return "redirect:/book/"+book.getBookId();
	}
	
	@RequestMapping (value ="/book/delete", method = RequestMethod.GET)
	public String deleteBook(int bookid, Model model) {
		model.addAttribute("book", bookService.getBookInfo(bookid));
		return "book/delete";
	}
	
	@RequestMapping (value ="/book/delete", method= RequestMethod.POST)
	public String deleteBook(int bookid, String booktitle, Model model) {
		bookService.deleteBook(bookid, booktitle);
		return "redirect:/book";
	}
//	
//	@RequestMapping (value="/img/{bookId}")
//	public	ResponseEntity<byte[]>	getImageFile(@PathVariable	int	fileId)	{
//		BookVO	book	=	bookService.getFile(bookId);
//		final	HttpHeaders	headers	=	new	HttpHeaders();
//		if(	book !=	null)	{
//		logger.info("getFile	"	+	book.toString());
//		String[]	mtypes	=	book.getFileContentType().split("/");
//		headers.setContentType(new	MediaType(mtypes[0],	mtypes[1]));
//		headers.setContentLength(b.getFileSize());
//		headers.setContentDispositionFormData("attachment",	
//		file.getFileName(),	Charset.forName("UTF-8"));
//		return	new	ResponseEntity<byte[]>(file.getFileData(),	headers,	
//		HttpStatus.OK);
//		 }else	{
//		 return	new	ResponseEntity<byte[]>(HttpStatus.NOT_FOUND);
//		 }
//		 }
	}


package com.manifestcorp.techreads.controller;

import com.manifestcorp.techreads.model.Book;
import com.manifestcorp.techreads.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/books")
public class BookController {

    BookRepository bookRepository;
    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @GetMapping({"", "/"})
    public ModelAndView books() {
        ModelAndView mav = new ModelAndView("book/books");
        var books = bookRepository.findAll();
        mav.addObject("books", books);
        return mav;
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("bookForm", new Book());
        return "book/add-book";
    }
    @PostMapping(value = {"", "/"})
    public RedirectView addBook(Book book) {
        bookRepository.saveAndFlush(book);
        return new RedirectView("books");
    }
    @GetMapping("/showUpdateForm/{id}")
    public ModelAndView showUpdateForm(@PathVariable (name = "id") long id, Model model){
        ModelAndView mav = new ModelAndView("book/edit-book");
        Book book = bookRepository.findById(id).get();
        mav.addObject("book",book);
        return mav;
    }
    @GetMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable ("id") long id) {
        bookRepository.deleteById(id);
        return "redirect:/books";
    }
}

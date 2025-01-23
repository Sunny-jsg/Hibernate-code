package com.ait.mtm.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_books")

public class Book {
	@Id
	@Column(name ="book_id")
	private Integer BookId;
	@Column(name ="book_name")
	private String BookName;
	@ManyToMany(cascade =CascadeType.MERGE,fetch =FetchType.EAGER)
	@JoinTable(name ="tbl_books_authors",
	                   joinColumns  =@JoinColumn(name ="book_id" , referencedColumnName = "book_id"),
	                    inverseJoinColumns =@JoinColumn(name="author_id",referencedColumnName = "author_id")
	)
	private List<Author>  Authors;
	public Integer getBookId() {
		return BookId;
	}
	public void setBookId(Integer bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public List<Author> getAuthors() {
		return Authors;
	}
	public void setAuthors(List<Author> authors) {
		Authors = authors;
	}
	

}

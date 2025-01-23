package com.ait.mtm.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_authors")
public class Author {
 @Id
 @Column(name ="author_id")
 private Integer AuthorId;
 @Column(name ="author_name")
 private String AuthorName;
 @ManyToMany(cascade=CascadeType.ALL,mappedBy  = "Authors")
 private List<Book> books;
public Integer getAuthorId() {
	return AuthorId;
}
public void setAuthorId(Integer authorId) {
	AuthorId = authorId;
}
public String getAuthorName() {
	return AuthorName;
}
public void setAuthorName(String authorName) {
	AuthorName = authorName;
}
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}
@Override
public String toString() {
	return "Author [AuthorId=" + AuthorId + ", AuthorName=" + AuthorName + "]";
}
 
}

package it.shape.hibernate;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    @ManyToMany
    @JoinTable(name = "AUTHOR_BOOK", joinColumns = @JoinColumn(name = "AUTHOR_ID") , inverseJoinColumns = @JoinColumn(name = "BOOK_ID") )
    private List<Book> bookList = new ArrayList<>();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Book> getBookList()
    {
        return bookList;
    }

    public void setBookList(List<Book> bookList)
    {
        this.bookList = bookList;
    }
}

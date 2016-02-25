package it.shape.hibernate;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    @ManyToMany(mappedBy = "bookList")
    private List<Author> authorList = new ArrayList<>();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Author> getAuthorList()
    {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList)
    {
        this.authorList = authorList;
    }
}

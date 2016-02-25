package it.shape.hibernate;

import javax.persistence.Persistence;
import javax.persistence.metamodel.Attribute.PersistentAttributeType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestMetamodel
{
    @Before
    public void setup()
    {
        Persistence.createEntityManagerFactory("HHH-10511");
    }

    @Test
    public void test1()
    {
        Assert.assertEquals(PersistentAttributeType.MANY_TO_MANY, Author_.bookList.getPersistentAttributeType());
    }

    @Test
    public void test2()
    {
        Assert.assertEquals(PersistentAttributeType.MANY_TO_MANY, Book_.authorList.getPersistentAttributeType());
    }

}

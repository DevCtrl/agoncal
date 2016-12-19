package com.devctrl.agoncal.data.entity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.validation.ConstraintViolationException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by rob on 19.12.16.
 */
public class FullBookIT {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("agoncalTestPU");
    private EntityManager em;
    private EntityTransaction tx;

    @Before
    public void initEntityManager() throws Exception{
        em = emf.createEntityManager();
        tx = em.getTransaction();
    }

    @After
    public void closeEntityManager() throws Exception{
        if (em != null) em.close();
    }

    @Test
    public void shouldFindAgoncalBook() throws Exception{
        FullBook book = em.find(FullBook.class, 1001L);
        assertEquals("Agoncal", book.getTitle());
    }

    @Test
    public void shouldCreateH2G2Book(){
        // Creates an instance of book
        FullBook book = new FullBook("H2G2", "The Hitchhiker's Guide to the Galaxy", 12.5F, "1-84023-742-2", 354, false);

        // Persists the book to the database
        tx.begin();
        em.persist(book);
        tx.commit();
        assertNotNull("ID should not be null", book.getId());

        // Retrieves all the books from the database
        List<FullBook> books = em.createNamedQuery("findBookH2G2", FullBook.class).getResultList();
        assertEquals(1, books.size());
        book = em.createNamedQuery("findBookH2G2", FullBook.class).getSingleResult();
        assertEquals("The Hitchhiker's Guide to the Galaxy", book.getDescription());
    }

    @Test(expected = ConstraintViolationException.class)
    public void shouldRaiseConstraintViolationCauseNullTitle() {

        FullBook book = new FullBook(null, "Null title, should fail", 12.5F, "1-84023-742-2", 354, false);
        em.persist(book);
    }

}

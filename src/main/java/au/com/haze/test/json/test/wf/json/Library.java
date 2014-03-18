package au.com.haze.test.json.test.wf.json;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author peteroyle
 */
@Path("/library")
public class Library {

    @GET
    @Path("/books")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("The something something", new Author("Brian", "Brown")));
        books.add(new Book("Life in the Carpool Lane", new Author("Sam", "Punchbowl")));
        return books;
    }

    @GET
    @Path("/book/{isbn}")
    public String getBook(@PathParam("isbn") String id) {
        return "ISBN";
    }

    @PUT
    @Path("/book/{isbn}")
    public void addBook(@PathParam("isbn") String id, @QueryParam("name") String name) {
        System.out.println("adding book");
    }

    @DELETE
    @Path("/book/{id}")
    public void removeBook(@PathParam("id") String id) {
        System.out.println("Removing book");
    }

}

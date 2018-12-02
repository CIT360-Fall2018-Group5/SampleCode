/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Isabel Jenson
 */
public class FavoriteMoviesLinkedList {


    public static void main(String[] args) {
        // Creating a LinkedList of my favorite movies.
        LinkedList<String> favoriteMovies = new LinkedList<>();

        // Adding new elements to the end of the LinkedList using add() method.
        favoriteMovies.add("Kate and Leopold ");
        favoriteMovies.add("Clash of The Titans");
        favoriteMovies.add("The Help");
        favoriteMovies.add("Avengers");
        
        //Printing contents of LinkedList
        System.out.println("My favorite movies list in 2017: " + favoriteMovies);

        // Adding an element at the specified position in the LinkedList
        favoriteMovies.add(3, "Lego Batman");
        System.out.println("After add(3, \"Lego Batman\") : " + favoriteMovies);

        // Adding an element at the beginning of the LinkedList
        favoriteMovies.addFirst("Dr. Strange");
        System.out.println("After addFirst(\"Dr. Strange\") : " + favoriteMovies);

        // Adding an element at the end of the LinkedList (This method is equivalent to the add() method)
        favoriteMovies.addLast("P.S. I Love You");
        System.out.println("After addLast(\"P.S. I Love You\") : " + favoriteMovies);

        // Adding all the elements from an existing collection to the end of the LinkedList
        List<String> finalFavoriteMovieList= new ArrayList<>();
        finalFavoriteMovieList.add("Thor: Ragnarok");
        finalFavoriteMovieList.add("Moana");

        //Printing contents of LinkedList after adding elements.
        favoriteMovies.addAll(finalFavoriteMovieList);
        System.out.println("After addAll(familyFriends) : " + favoriteMovies);
    }
}


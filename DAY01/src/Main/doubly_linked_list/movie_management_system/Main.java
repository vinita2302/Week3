package Main.doubly_linked_list.movie_management_system;


public class Main {
    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();

        mms.addMovieAtEnd("Inception", "Nolan", 2010, 8.8);
        mms.addMovieAtEnd("Interstellar", "Nolan", 2014, 8.6);
        mms.addMovieAtBeginning("The Dark Knight", "Nolan", 2008, 9.0);

        mms.displayForward();
        mms.displayReverse();

        mms.addMovieAtPosition("Dunkirk", "Nolan", 2017, 7.9, 2);
        mms.displayForward();

        mms.updateMovieRating("Inception", 9.2);
        mms.searchMovie("Nolan", 9.2);

        mms.removeMovieByTitle("The Dark Knight");
        mms.displayForward();
    }
}

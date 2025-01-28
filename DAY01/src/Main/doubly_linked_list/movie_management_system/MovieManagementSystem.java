package Main.doubly_linked_list.movie_management_system;

class MovieManagementSystem {
    private Movie head;
    private Movie tail;

    // Add movie at the beginning
    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add movie at the end
    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add movie at a specific position
    public void addMovieAtPosition(String title, String director, int year, double rating, int position) {
        if (position <= 1 || head == null) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }

        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        newMovie.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newMovie;
        } else {
            tail = newMovie;
        }
        newMovie.prev = temp;
        temp.next = newMovie;
    }

    // Remove movie by title
    public void removeMovieByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }
                System.out.println("Movie \"" + title + "\" removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie \"" + title + "\" not found.");
    }

    // Search movie by director or rating
    public void searchMovie(String director, double rating) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director) || temp.rating == rating) {
                System.out.println("Found Movie: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movie found with Director: " + director + " or Rating: " + rating);
        }
    }

    // Display movies in forward order
    public void displayForward() {
        System.out.println("Movies in Forward Order:");
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " (" + temp.year + ", Rating: " + temp.rating + ")");
            temp = temp.next;
        }
    }

    // Display movies in reverse order
    public void displayReverse() {
        System.out.println("Movies in Reverse Order:");
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " (" + temp.year + ", Rating: " + temp.rating + ")");
            temp = temp.prev;
        }
    }

    // Update movie rating
    public void updateMovieRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Updated Rating for " + title + " to " + newRating);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie " + title + " not found.");
    }


}

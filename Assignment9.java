/**
 * Name:
 * Date:
 */
public class Assignment9 {

    public static void main(String[] args) {
        MovieTracker tracker = new MovieTracker();

        // Create a few movies
        Movie inception = new Movie("Inception", 148, 2010, "PG-13");
        Movie up = new Movie("Up", 96,  2009, "PG");
        Movie jaws = new Movie("Jaws", 124, 1975, "PG");
        Movie matrix = new Movie("The Matrix", 136, 1999, "R");
        Movie frozen = new Movie("Frozen", 102, 2013, "PG");

        // Record which movies each user has watched
        tracker.addMovie("alice", inception);
        tracker.addMovie("alice", up);
        tracker.addMovie("alice", matrix);

        tracker.addMovie("bob", jaws);
        tracker.addMovie("bob", matrix);

        // getMovies returns the set of movies for one user
        System.out.println("=== getMovies ===");
        System.out.println("alice: " + tracker.getMovies("alice"));
        System.out.println("bob: " + tracker.getMovies("bob"));
        System.out.println("carol (no movies): " + tracker.getMovies("carol"));

        // Adding the same movie twice should not create a duplicate
        System.out.println();
        System.out.println("=== duplicate add ===");
        tracker.addMovie("bob", jaws);
        System.out.println("bob after adding Jaws again: " + tracker.getMovies("bob"));

        // hasWatched uses equals/hashCode, so an equal Movie object also matches
        System.out.println();
        System.out.println("=== hasWatched ===");
        System.out.println("alice watched Up? " + tracker.hasWatched("alice", up));         // true
        System.out.println("alice watched Jaws? " + tracker.hasWatched("alice", jaws));     // false
        System.out.println("bob watched Frozen? " + tracker.hasWatched("bob", frozen));     // false
        Movie anotherMatrix = new Movie("The Matrix", 136, 1999, "R");
        System.out.println("bob watched (equal copy of) The Matrix? "
                + tracker.hasWatched("bob", anotherMatrix));                                // true
        System.out.println("carol watched Up? " + tracker.hasWatched("carol", up));         // false
    }
}

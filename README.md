# Assignment 9: Movie Tracker

**Name:** Ben Tournier
**Date:** 10/15/26

A program that records which movies each user has watched, using a
`HashMap<String, HashSet<Movie>>` (user name → set of movies).

## Files

| File | Description |
|------|-------------|
| `Movie.java` | A movie with a title, running time, release year, and rating. |
| `MovieTracker.java` | Stores and looks up the movies each user has watched. |
| `Assignment9.java` | `main` method that tests the tracker. |

## How to run

```
javac *.java
java Assignment9
```

## Questions

### 1. What would happen if an `ArrayList` was used instead of a `HashSet`? Is there an advantage to using a `HashSet` here?

because of how lists work if an ArrayList had been used and they were adding the same movie multiple times then there would be duplicates in the list which is not wanted. It would also affect the order because a list keeps thing in the order they are added while a set does not. The only other thing that does not really come into play here is the speed comparison between the two. a list would most likely iterate through the list and take longer and longer as more items were added tot he list wheras a hashset would have the items hashed within the set and be able to find the objects far faster. 

### 2. We chose `HashMap<String, HashSet<Movie>>` for the tracker, which made it very easy to answer questions such as "What movies has Alice watched?" or "What is Alice's total viewing time?" Explain how a different design, such as `HashMap<Movie, HashSet<String>>`, would make certain other questions very easy to answer and others more difficult.

Each movie is the key and the value is the set of the users that have watched that movie. Basically, it would be the current map just turned around. who has watched the movie jaws would become map.get(jaws) and something like how many people have watched the matrix would be taking that sets .size(). However, some of the problems would become harder when it gets to something like what movies has alize watched because the map no longer has alice as a key that is easy to fine so it needs you to loop through and find how many keys lead to alice. the same thing would happen when it comes to what is alices total viewing time which would make it the same loop but it would add the running time of the movies that she appears under which is a lot more. neither design is really better overall it would just depend on the situation. Honestly, if memory was not a concern or the numbers stored were not that big then I would consider just making both lists in preperation for both types of questions so things are easier. 

[Markdown Guide](https://www.markdownguide.org/basic-syntax/)

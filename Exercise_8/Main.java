package Exercise_8;

/* 1. Movie Ticket Booking System:
   Create a Movie class with attributes for title, 
   duration, and rating. Implement methods to display 
   movie details and check availability. Create a 
   Booking class that allows users to book tickets 
   for a specific movie and displays the booking confirmation.
/*
 * 
 */

class Movie {
	String title;
	int duration;
	double rating;
	boolean isAvailable;
	
	
	public Movie(String title, int duration, double rating) {
		this.title = title;
		this.duration = duration;
		this.rating = rating;
		this.isAvailable = true;
	}
	
	public void displayDetails() {
		System.out.println("Movie Title: " + title);
		System.out.println("Duration: " + duration);
		System.out.println("Rating: " + rating);
		
	}
	
	public boolean isAvailable() {
		return isAvailable;
		
	}
	
	public void setAvailability(boolean isAvailable) {
		        this.isAvailable = isAvailable;
		    }

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
		}

class Booking {
	private Movie movie;
	public int numberOfTickets;
	
    public Booking(Movie movie, int numberOfTickets) {
        this.movie = movie;
        this.numberOfTickets = numberOfTickets;
}
    
    public void bookTicket() {
        if (movie.isAvailable()) {
            movie.setAvailability(false);
            System.out.println("Booking confirmed for " + movie.getTitle());
            System.out.println("Number of tickets: " + numberOfTickets);
        } else {
            System.out.println("Sorry, the movie is not available for booking.");
        }
    }
}
public class Main {

	public static void main(String[] args) {
		Movie movie1 = new Movie("The Shawshank Redemption", 220, 8.8);
		Movie movie2 = new Movie("Predetor", 169, 8.6);

        Booking booking1 = new Booking(movie1, 2);
        booking1.bookTicket();

        Booking booking2 = new Booking(movie2, 3);
        booking2.bookTicket();

        movie1.displayDetails();
        movie2.displayDetails();
    }
}



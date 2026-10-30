import java.util.*;
class Movie{
    String title;
    String director;
    String actor;
    String review;
    public Movie(String title , String director , String actor){
        this.title = title;
        this.director = director;
        this.actor = actor;
    }
    public void inputReview(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie review");
        review = sc.nextLine();    
    }
    public void displayReview(){
        System.out.println("Title : "+title);
        System.out.println("Director : "+director);
        System.out.println("Actor : "+actor);
        System.out.println("Review : "+review);
    }
    public static void main(String[] args) {
        Movie m = new Movie("xyz","dic","srk");
        m.inputReview();
        m.displayReview();
    }
}
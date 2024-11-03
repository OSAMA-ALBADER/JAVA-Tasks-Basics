import java.util.ArrayList;

public class ListofArray {

    public static void main(String[] args) {
        /*String[] books = {"Action","Romantic","Thrilled","Terror","Drama"}*/
        ArrayList<String> books = new ArrayList<>();
        books.add("Action");
        books.add("Romatic");
        books.add("Drama");
        books.add("Terror");
        books.add("Thrilled");
        books.remove(2);


        for (String book : books) {
            System.out.println(book);
        }
    }
}
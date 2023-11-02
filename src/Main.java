import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        JSONPlaceholderFetcher json = new JSONPlaceholderFetcher();
        System.out.println(json.getSinglePost(2));
      // System.out.println(json.getAllPosts());


    }
}
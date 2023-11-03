import java.io.IOException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        JSONPlaceholderFetcher json = new JSONPlaceholderFetcher();

        // System.out.println(json.getAllPosts());
        System.out.println(json.addPost("{title: 'foo', body: 'bar', userId: 1}"));
        System.out.println(json.getAllPosts());

    }
}
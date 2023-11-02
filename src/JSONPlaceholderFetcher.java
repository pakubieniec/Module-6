import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JSONPlaceholderFetcher {

    private String id = "";
    final HttpClient client = HttpClient.newBuilder().build();
    URI url = URI.create("https://jsonplaceholder.typicode.com/posts/");

    public String getSinglePost(int id) {
        url = URI.create("https://jsonplaceholder.typicode.com/posts/" + id);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .GET()
                .build();
        HttpResponse<String>  response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return String.valueOf(response.body());
    }

    public String getAllPosts(){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .GET()
                .build();
        HttpResponse<String>  response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return String.valueOf(response.body());
    }
    public boolean addPost(String post){

        return true;
    }
}

//public String getSinglePost(int id) -> używając metody GET, odpytaj o pojedynczy post,
// używając podanego id przy budowie URI i zwróć ten post;
//public String getAllPosts() -> używając metody GET odpytaj o wszystkie posty
// i zwróć je;
//public boolean addPost(String post) -> dodaj ciało do swojego zapytania: {
       // title: 'foo',
//body: 'bar',
//userId: 1, }; a następnie używając metody POST dodaj nowe dane do istniejącego zasobu.
// Zwróć true, kiedy operacja zakończy się sukcesem, false, jeśli nie.



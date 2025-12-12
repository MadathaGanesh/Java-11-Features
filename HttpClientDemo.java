import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientDemo {

    public static void main(String[] args) throws IOException, InterruptedException{
        

        // Create a HttpClient Instance (Immutable and reusable)
        HttpClient client = HttpClient.newBuilder()   
                        .version(HttpClient.Version.HTTP_2)                   // Prefer HTTP/2 when the server supports it
                        .connectTimeout(Duration.ofSeconds(10))      // Maximum time to establish TCP connection
                        .build();


        // Build an HTTP GET request to a REST endpoint
        HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create("https://jsonplaceholder.typicode.com/posts/"))  // Target API URL
                            .header("Accept", "application/json")  // Ask for JSON Response format
                            .GET()  // Get Method
                            .build();

        // Send the request synchronously (blocking call)
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        // BodyHandlers.ofString() converts the response body into a String

        System.out.println(" Status code : "+ response.statusCode());
        System.out.println("Response Data : "+response.body());


                // Send the same request asynchronously (non-blocking)
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
            // Extract only the response body from HttpResponse<String>
            .thenApply(HttpResponse::body)
            // Consume the body when it arrives (here we just print it)
            .thenAccept(System.out::println);
        // Program can continue doing other work while the request is in flight
    }
    
}

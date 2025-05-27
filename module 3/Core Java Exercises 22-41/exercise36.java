//Http Client API
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.*;
public class GitHubFetcher {
    public static void main(String[] args) {
        String apiUrl = "https://api.github.com/users/octocat/repos";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body:");
            System.out.println(response.body());
            System.out.println("\n--- Parsed Repository Names ---");
            JsonElement json = JsonParser.parseString(response.body());
            JsonArray repos = json.getAsJsonArray();

            for (JsonElement repo : repos) {
                JsonObject obj = repo.getAsJsonObject();
                System.out.println(obj.get("name").getAsString());
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

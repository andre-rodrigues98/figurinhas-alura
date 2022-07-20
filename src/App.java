import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {
        // fazer uma conexão http e buscar api do IMDB dos 250 top filmes
        String url = "https://imdb-api.com/en/API/Top250Movies/k_3p3u0w8v";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

        // extrair somente os dados que serão utilizados (pôster, titulo e classificação)

        // exibir e manipular os dados
    }
}

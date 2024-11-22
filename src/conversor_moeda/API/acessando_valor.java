package API;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class acessando_valor {
    private static final String API_KEY = "856c9c8c35d4175f1d730b70"; // Substitua pela sua API Key
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/BRL";

    public static JsonObject obterTaxasDeCambio() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(BASE_URL))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                String responseBody = response.body();
                JsonObject jsonResponse = JsonParser.parseString(responseBody).getAsJsonObject();
                return jsonResponse.getAsJsonObject("conversion_rates"); // Retorna apenas as taxas de conversão
            } else {
                System.err.println("Erro ao acessar a API. Código de status: " + response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Retorna null em caso de erro
    }
}

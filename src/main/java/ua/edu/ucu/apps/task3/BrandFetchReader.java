package ua.edu.ucu.apps.task3;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

import lombok.SneakyThrows;

import java.net.URI;

public class BrandFetchReader {

    public static final String BRAND_FETCH_URL = "https://api.brandfetch.io/v2/brands/";
    public static final String API_KEY = "";
    
    @SneakyThrows
    public Company fetch(String companyName) {
        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(new URI(BRAND_FETCH_URL + companyName)).header("Authorization", "Bearer " + API_KEY).build();
        
        httpClient.send(httpRequest, BodyHandlers.ofString());

        HttpResponse<String> response = httpClient.send(httpRequest, BodyHandlers.ofString());
        System.out.println(response.body());
        return new Company();
    }
}

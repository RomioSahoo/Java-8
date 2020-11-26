package assignments;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ApiCalls {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		String base_url = "http://dummy.restapiexample.com/api/v1/";
		String rest_endpoint = "employees";
		String url = base_url + rest_endpoint;

		// get call
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
		HttpResponse response;
		// try {
		response = client.send(request, BodyHandlers.ofString());
		System.out.println(response.body());
		// }
//		catch(IOException io)
//		{
//			io.printStackTrace();
//		}
//		catch(InterruptedException ie) {
//			ie.printStackTrace();
//		}

		System.out.println();

		// get Employee with id
		rest_endpoint = "employee/9";
		url = base_url + rest_endpoint;
		request = HttpRequest.newBuilder().uri(URI.create(url)).build();
		response = client.send(request, BodyHandlers.ofString());
		System.out.println(response.body());

		System.out.println();

		
		
		// create add employee -post request
		rest_endpoint = "create";
		url = base_url + rest_endpoint;
		// System.out.println(url);
		String requestBodyString = "{\"name\":\"Romio\",\"salary\":\"10000\",\"age\":\"22\"}";
		request = HttpRequest.newBuilder().uri(URI.create(url)).POST(BodyPublishers.ofString(requestBodyString))
				.build();
		response = client.send(request, BodyHandlers.discarding());
		System.out.println(response.statusCode());

		
		
		// delete 
		rest_endpoint="delete/2"; 
		url=base_url+rest_endpoint;
		request = HttpRequest.newBuilder().uri(URI.create(url)).DELETE().build();
		response = client.send(request, BodyHandlers.ofString());
		System.out.println(response.body());

		System.out.println();

	}

}

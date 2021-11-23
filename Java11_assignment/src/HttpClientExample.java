 import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
public class HttpClientExample{
	public static void main(string[] args) throws Exception,
          interruptedException
	{
          HttpRequest request=HttpRequest.newBuilder()
		.GET()
		.uri(URI.create("https://httpbin.org/get"))
		.build();
	 HttpClient httpClient =HttpClient.newBuilder(0
		.version(HttpClient.version.HTTP_1_1)
		.connectTimeout(Duration.ofseconds(10))
		.build();
	HttpResponse<string>response =httpClient.send(request,HttResponse.BodyHandlers.ofsting());
	HttpHeaders headers=response.header();
	headers.map(0.forEach(k,v) -> system.out.println(k+':"+v));
	system.out.println(response.statusCode());
	system.out.println(resonse.body());
      }
}


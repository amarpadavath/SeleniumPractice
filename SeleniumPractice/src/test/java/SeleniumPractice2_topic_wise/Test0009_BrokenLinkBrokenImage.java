package SeleniumPractice2_topic_wise;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0009_BrokenLinkBrokenImage {

	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();

		List<WebElement> element = driver.findElements(By.tagName("a"));

		element.addAll(driver.findElements(By.tagName("img")));

		driver.get("https://demoqa.com/broken");

		System.out.println("total elements to check" + element.size());

		for (WebElement element1 : element) {
			String url = element1.getAttribute("href");
			if (url == null || url.isEmpty()) {
				url = element1.getAttribute("src");

			}

			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured or it is empty");
				continue;
			}

			try {
				// HttpURLConnection connection = (HttpURLConnection) (new URL(url).)

				HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
				connection.setRequestMethod("HEAD");
				connection.connect();
				int responseCode = connection.getResponseCode();

				if (responseCode >= 400) {
					System.out.println("Broken URL: " + url + " - Status Code: " + responseCode);
				} else {
					System.out.println("Valid URL: " + url + " - Status Code: " + responseCode);
				}

			}

			catch (Exception e) {
				System.out.println("Exception while checking URL: " + url);
				e.printStackTrace();
			}

		}

	}
}

package SeleniumPractice0;

public class Test1002brokenImages {
	
	public class BrokenImageValidator {

	    public static void main(String[] args) {
	        // Setup the WebDriver (Make sure to set the correct path to your ChromeDriver)
	 //       WebDriver driver = new ChromeDriver();

	        // Open the page to be tested
	 //       driver.get("http://yourwebsite.com");

	        // Get all image elements on the page
	    //    List<WebElement> images = driver.findElements(By.tagName("img"));

	    //    for (WebElement img : images) {
	    //        // Get the 'src' attribute of each image
	  //          String imgSrc = img.getAttribute("src");

	            // Validate the image URL
	       //     if (isBrokenImage(imgSrc)) {
	    //            System.out.println("Broken image found: " + imgSrc);
	    //        }
	        }

	        // Close the browser
	   //     driver.quit();
	    }

	    // Method to check if an image is broken
	    public static boolean isBrokenImage(String imgUrl) {
	        try {
	            // Create a URL object from the image src
	        //    URL url = new URL(imgUrl);

	        //    // Open a connection to the URL
	         //   HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	            // Set a timeout to avoid long waiting periods
	     //       connection.setRequestMethod("GET");
	        //    connection.connect();

	            // Get the HTTP response code
	         //   int responseCode = connection.getResponseCode();

	            // Check for valid image response (HTTP 200)
//	          //  if (responseCode != HttpURLConnection.HTTP_OK) {
	         //       return true; // Image is broken
	          //  }
	      //  } catch (Exception e) {
	            // If an exception occurs, assume the image is broken
	       //     return true;
	       // }
	       // return false; // Image is valid
	    }
	}


}

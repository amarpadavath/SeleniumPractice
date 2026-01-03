package SeleniumPractice3ImpornatntCommads;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test014WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set up ChromeDriver (make sure ChromeDriver is in your PATH)
        WebDriver driver = new ChromeDriver();

        // Open your HTML file (or use a test URL)
        driver.get("F:\\NotepadPrograms\\Notes\\3.Selenium\\WebTable.html");

        driver.manage().window().maximize();

     List<WebElement> secondRowCells = driver.findElements(By.xpath("//tr[2]/child::td"));
     
     for(WebElement cell: secondRowCells)
     {
    	 System.out.println(cell.getText());
     }
     
     // 2️⃣ parent:: — get <tr> of 'Jane Smith'
     WebElement janeRow = driver.findElement(By.xpath("//td[text()='Jane Smith']/parent::tr"));
     System.out.println("\nParent Row of Jane Smith: " + janeRow.getText());

     // 3️⃣ ancestor:: — get table of 'John Doe'
     WebElement johnTable = driver.findElement(By.xpath("//td[text()='John Doe']/ancestor::table"));
     System.out.println("\nTag name of John's ancestor table: " + johnTable.getTagName());
     
     List<WebElement> checkboxes = driver.findElements(By.xpath("//table/descendant::input[@type='checkbox']"));
     System.out.println("\nTotal checkboxes found: " + checkboxes.size());
     
  // 5️⃣ following-sibling:: — get next column after 'Jane Smith'
     WebElement janeDept = driver.findElement(By.xpath("//td[text()='Jane Smith']/following-sibling::td[1]"));
     System.out.println("\nJane’s Department: " + janeDept.getText());

     // 6️⃣ preceding-sibling:: — get previous column before 'HR'
     WebElement janeName = driver.findElement(By.xpath("//td[text()='HR']/preceding-sibling::td[1]"));
     System.out.println("\nName before HR: " + janeName.getText());

     // 7️⃣ following:: — get element following EMP001 (next <td>)
     WebElement nextToEmp1 = driver.findElement(By.xpath("//td[text()='EMP001']/following::td[1]"));
     System.out.println("\nFollowing element after EMP001: " + nextToEmp1.getText());

     // 8️⃣ preceding:: — get element preceding 'John Doe'
     WebElement beforeJohn = driver.findElement(By.xpath("//td[text()='John Doe']/preceding::td[1]"));
     System.out.println("\nPreceding element before John Doe: " + beforeJohn.getText());

     // 9️⃣ ancestor-or-self:: — get all ancestor tags of 'Emily Johnson'
     List<WebElement> emilyAncestors = driver.findElements(By.xpath("//td[text()='Emily Johnson']/ancestor-or-self::*"));
     System.out.println("\nEmily Johnson - Ancestors count: " + emilyAncestors.size());

     // 🔟 self:: — select current element itself
     WebElement robertSelf = driver.findElement(By.xpath("//td[text()='Robert Brown']/self::td"));
     System.out.println("\nSelf element text: " + robertSelf.getText());

     // ✅ Bonus: Click checkbox for Jane Smith
     WebElement janeCheckbox = driver.findElement(By.xpath("//td[text()='Jane Smith']/parent::tr/td/input[@type='checkbox']"));
     janeCheckbox.click();
     System.out.println("\n✅ Checkbox for Jane Smith clicked!");

     // Close browser
     //driver.quit();
     
     String employeeName = "Jane Smith";
     
   //td[text()='"+employeeName+"']/parent::tr/td/input[@type='checkbox']
     
  String s = "/td[text()='"+employeeName+"']/parent::tr/td/input[@type='checkbox']";

     String dynamicXpath = "//td[text()='" + employeeName + "']/parent::tr/td/input[@type='checkbox']";

     driver.findElement(By.xpath(dynamicXpath)).click();
     
     String employeeName1 = "Jane Smith";

     String dynamicXpath1 = "//td[contains(text(),'" + employeeName1 + "')]/parent::tr/td/input[@type='checkbox']";

     driver.findElement(By.xpath(dynamicXpath1)).click();
     ////td[contains(text(),'Jane Smith')]/parent::tr/td/input[@type='checkbox']
     
   //  String s1 = "//td[contains(text(),'"+ employeeName1 +"')]/parent";
   //tr[td[normalize-space(text())='Jane Smith'] and td[normalize-space(text())='HR']]//input[@type='checkbox']

   //tr[td[normalize-space(text()),'Jane Smith')] and td[normalize-space(text(),'HR Manager')]]//input[@type='checkbox']
     


	}

}

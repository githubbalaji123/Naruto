package selenium_basics;

public class Webelemnt1stvid {

	public static void main(String[] args) {
		/*
		 * webElement getter will return the String, if we have the text through getter mtd we can fetch it
		    getText() we can retrive any of the text of the webelemnt for eg we might do transction so the messge will come know so now 
		    you can also go a get or pick that text of the webelent  and use it as a validation purpose also
		                  eg: String sp=d.findElement(By.xpath("************")).getText();
		                       Syso(sp)
		
		    *  getAttribute() will return the String of corresponding Attribute value of the name
		      eg: String dd=d.findElement(By.id("newsletter-subscribe-button")).getAttribute("value")
		      
		      d.findElement(By.id("small-searchterms")).sendkeys("books");
		      String textfield_value=d.findElement(By.id("small-searchterms")).getAttributes("value")
		      Syso(textfield_value)
		      
		    *  getCssValue()
		                    String regColor= d.findElement(By.linkText("Register")).getCssValue("color");
		                    Syso(regColor)  o/p= rgb(175, 3, 4)
		                    
		                    String fontValue=driver.findElement(By.linkText("Register")).getCssValue("font-family")
		                    Syso(fontValue)
		                    
		   *   x*x*x*x*x* //verification methods  for eg:-  if searchdoor is enabled go and enter some text 
		               ^*^*^*^*^  return type is boolean     
		              for eg:        
		                     if the search button is enabled go and click on that search button if the radio button is already selected
		                      check it is selected or not
		                      
		       for eg 1 :-->  if Searchdoor is displayed go and enter the text
		       
		           if  (d.findElement(By.id("small-searchterms")).isDisplayed()){
		              d.findElement(By.id("small-searchterms")).sendKeys("books")
		           }
		       for eg 2 :-->    check if the search button is enabled go and click on it
		           
		                 if (d.findElement(By.xpath("...............")).isEnabled()){
		                      d.findElement(By.xpath("...............")).isEnabled().click();
		                 }
		                 
		       for eg 3 :-->  Verify if the radio button is selected        
		                    if (d.findElement(By.xpath("...............")).isSelected()){
		                      Syso("The excellent radio button was selected successfully");
		                 }
		 */

	}

}

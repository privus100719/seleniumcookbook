package ExtendingSelenium;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTables {
	
	private WebElement _webTable;
	
	public WebTables(WebElement webTable) {
		
		set_webTable(webTable);
	}
	public WebElement get_webTable() {
		
		
		return _webTable;
		
		
	
		
	}
	public void set_webTable(WebElement _webTable) {
		
		this._webTable = _webTable;
	}
	
	public int getRowCount() {
		
		List<WebElement>tableRows = (List<WebElement>) _webTable.findElement(By.tagName("tr"));
		
		return tableRows.size();
		
		
	}
	
	public int getcolumnCount() {
		
		List<WebElement>tableRows = (List<WebElement>) _webTable.findElement(By.tagName("td"));
		
		
		
		WebElement headerRow = tableRows.get(0);
		List<WebElement> tableCols =
				headerRow.findElements(By.tagName("td"));
				return tableCols.size();
				}
				
				public String getCellData(int rowIdx, int colIdx) {
					
				List<WebElement> tableRows =_webTable.findElements(By.tagName("tr"));
				
				WebElement currentRow = tableRows.get(rowIdx-1);
				
				List<WebElement> tableCols =currentRow.findElements(By.tagName("td"));
				
				WebElement cell = tableCols.get(colIdx-1);
				return cell.getText();
				}
				
				public WebElement getCellEditor(int rowIdx, int colIdx, int editorIdx)throws Exception {
				 
				try {
				List<WebElement> tableRows =_webTable.findElements(By.tagName("tr"));
				
				WebElement currentRow = tableRows.get(rowIdx-1);
				
				List<WebElement> tableCols =currentRow.findElements(By.tagName("td"));
				
				WebElement cell = tableCols.get(colIdx-1);
				
				WebElement cellEditor =cell.findElements(By.tagName("input")).get(editorIdx);
				
				return cellEditor;
				
				} catch (NoSuchElementException e) {
					
					throw new Exception("Failed to get cell editor");
				}
				}
				
			
			
				
				
}
	

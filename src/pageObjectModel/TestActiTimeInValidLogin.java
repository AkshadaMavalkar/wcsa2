package pageObjectModel;

import java.io.IOException;

public class TestActiTimeInValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();

		int rc = flib.getRowCount("./data/TestDataAct.xlsx","invalidcreds");

		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData("./data/TestDataAct.xlsx","invalidcreds",i,0);

			String password = flib.readExcelData("./data/TestDataAct.xlsx","invalidcreds",i,1);
		

			lp.invalidLoginActiTime(username,password );
			
		
		}
		
	}

}
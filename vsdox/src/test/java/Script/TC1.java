package Script;

import org.testng.annotations.Test;

import Pompages.VSDOX_LOgin;

public class TC1 extends genricLib.BaseClass{
		
		@Test
		public void tc1() throws InterruptedException {
			VSDOX_LOgin s=new VSDOX_LOgin(driver);
			s.internal();
			s.user_id();
			s.password();
			s.submit();
			Thread.sleep(3000);

}
}
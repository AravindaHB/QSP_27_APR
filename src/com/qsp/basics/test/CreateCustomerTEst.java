package com.qsp.basics.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.qsp.utils.ActitimeUtils;
import com.qsp.utils.ConfigReader;

public class CreateCustomerTEst {
	
	public static void main(String[] args) throws IOException {
		
		String browser = ConfigReader.getConfigValue("browser");
		String url = ConfigReader.getConfigValue("url");
		String username = ConfigReader.getConfigValue("username");
		String password = ConfigReader.getConfigValue("password");
		
		
		
		WebDriver driver = ActitimeUtils.getMyDriver(browser);
		ActitimeUtils.launchApp(url);
		ActitimeUtils.login(username,password);
		ActitimeUtils.clickOnModule("tasks");
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.createCustomer("QSP-FirstCus12", "QSP-FirstCust-Desc");
		ActitimeUtils.logout();
	}

}

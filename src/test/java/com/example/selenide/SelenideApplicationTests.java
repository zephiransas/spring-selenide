package com.example.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SelenideApplicationTests {

	@LocalServerPort
	int port;

	@Test
	public void test() throws Exception  {
		Configuration.baseUrl = "http://127.0.0.1:" + port;
		Configuration.browser = WebDriverRunner.PHANTOMJS;

		Selenide.open("/test");
		Selenide.$("body").shouldHave(Condition.text("OK"));
	}

}

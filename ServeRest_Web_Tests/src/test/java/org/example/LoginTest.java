package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginTest {
        private WebDriver driver;
        private WebDriverWait wait;

        @BeforeEach
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        @Test
        public void testSuccessfulLogin() {
            // Arrange
            driver.get("https://front.serverest.dev/login");

            // Act
            driver.findElement(By.id("email")).sendKeys("automation@email.com");
            driver.findElement(By.id("password")).sendKeys("123456");
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/button")).click();

            // Assert
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/form/button")));
        }

        @AfterEach
        public void tearDown() {
            driver.quit();
        }
}
package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirSite {
    public static void main(String[] args) {
        // Define a localização do driver do Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver\\chromedriver.exe");

        // Inicializa o ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navega até o site da Amazon
        driver.get("http://localhost:8080/tasks");

        // Fecha o navegador
        driver.quit();
    }
}
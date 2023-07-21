package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
public class Application {
    private static Properties appProps = new Properties();
    private static final String DEFAULT_PROPERTY_PATH = ".\\resources\\application.properties";

    public static void main(String args[]) {
        String path = "C:\\Users\\hyrov\\.jdks\\corretto-1.8.0_372\\bin";
        String java_home = "C:\\Users\\hyrov\\.jdks\\corretto-1.8.0_372";

        System.setProperty("PATH", path);
        System.setProperty("JAVA_HOME", java_home);

        try {
            setupPropertyFile();
            System.out.println("Property File was successfully set");
        } catch (IOException exception) {
            System.out.println("Property File was not found");
        }
        System.out.println(appProps.getProperty("welcome.text"));
        SpringApplication.run(Application.class, args);
    }

    private static void setupPropertyFile() throws IOException {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        System.out.println(rootPath);
        String appConfigPath = rootPath + "application.properties";
        try {
            System.out.println("AppconfigPath: " + appConfigPath);
            appProps.load(new FileInputStream(appConfigPath));
        } catch (IOException exception) {
            appProps.load(new FileInputStream(DEFAULT_PROPERTY_PATH));
        }
    }

    public static Properties getAppPropsPath() {
        return appProps;
    }
}

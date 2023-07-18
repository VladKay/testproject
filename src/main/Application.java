package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String args[]){
        String path = "C:\\Users\\hyrov\\.jdks\\corretto-1.8.0_372\\bin";
        String java_home = "C:\\Users\\hyrov\\.jdks\\corretto-1.8.0_372";

        System.setProperty("PATH", path);
        System.setProperty("JAVA_HOME", java_home);
        System.out.print("Hello world");
        SpringApplication.run(Application.class,args);
    }
}

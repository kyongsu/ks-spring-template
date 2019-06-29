package ks.com.springtemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"ks.com.springtemplate"})
@EnableJpaRepositories(basePackages = {"ks.com.springtemplate"})
public class SpringTemplateApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringTemplateApplication.class, args);
  }

}

package com.example.swagger;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/start/*"))
				.apis(RequestHandlerSelectors.basePackage("com.example"))
				.build()
				.apiInfo(appDetails());
	}
	
	private ApiInfo appDetails() {
		return new ApiInfo(
				"MyApp",
				"Swagger Demo",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("MyName", "MyURL", "MyEmail"),
				"MyLicense",
				"MyLicinseURL",
				Collections.EMPTY_LIST);
	}

}

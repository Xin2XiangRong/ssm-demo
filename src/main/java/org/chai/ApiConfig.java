package org.chai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;
import static com.google.common.base.Predicates.or;
import static com.google.common.base.Predicates.or;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/*import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;*/

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
@EnableWebMvc
@EnableSwagger2
//@ComponentScan("org.chai.controller")
public class ApiConfig {

	@Bean
	public Docket userDocket(){
		return new Docket(DocumentationType.SWAGGER_2)
                .groupName("user")
                .genericModelSubstitutes(DeferredResult.class)
//              .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                .paths(PathSelectors.ant("/user/**"))//过滤的接口.paths(or(regex("/user/.*")))
                .build()
                .apiInfo(userApiInfo());
	}
	
	/*@Bean
  public Docket createRestApi() {
      return new Docket(DocumentationType.SWAGGER_2)
              .apiInfo(userApiInfo())
              .select()
              .apis(RequestHandlerSelectors.basePackage("org.chai.controller")) // 注意修改此处的包名
              .paths(PathSelectors.any())
              .build();
  }*/
	
	@Bean
	public Docket postDocket(){
		return new Docket(DocumentationType.SWAGGER_2)
                .groupName("post")
                .genericModelSubstitutes(DeferredResult.class)
//              .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                .paths(PathSelectors.ant("/post/**"))//过滤的接口.paths(or(regex("/user/.*")))
                .build()
                .apiInfo(userApiInfo());
	}
	/*@Autowired
	private SpringSwaggerConfig swaggerConfig;
	
	@Bean
	public SwaggerSpringMvcPlugin customImplementation() {
		
 		SwaggerSpringMvcPlugin swaggerSpringMvcPlugin = new SwaggerSpringMvcPlugin(swaggerConfig);
		swaggerSpringMvcPlugin.apiInfo(apiInfo());
		swaggerSpringMvcPlugin.swaggerGroup("group");
		swaggerSpringMvcPlugin.includePatterns(".*?");
 
		return swaggerSpringMvcPlugin;
	}
	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("My Apps API Title", "My Apps API Description", "My Apps API terms of service",
				"My Apps API Contact Email", "My Apps API Licence Type", "My Apps API License URL");
		return apiInfo;
	}
	public SpringSwaggerConfig getSwaggerConfig() {
		return swaggerConfig;
	}
	public void setSwaggerConfig(SpringSwaggerConfig swaggerConfig) {
		this.swaggerConfig = swaggerConfig;
	}*/

	private ApiInfo userApiInfo() {
		return new ApiInfoBuilder()
	            .title("Electronic Health Record(EHR) Platform API")//大标题
	            .description("EHR Platform's REST API, all the applications could access the Object model data via JSON.")//详细描述
	            .version("1.0")//版本
	            .termsOfServiceUrl("NO terms of service")
	            .contact(new Contact("chai", "http://blog.csdn.net/catoop", "chaishuai@hikvision.com.cn"))//作者
	            .license("The Apache License, Version 2.0")
	            //.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
	            .build();

	  
	}
}

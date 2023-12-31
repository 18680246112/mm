//package com.jzh.xx.transaction.config;
//
//import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
//import com.github.xiaoymin.knife4j.spring.extension.OpenApiExtensionResolver;
//import com.jzh.xx.transaction.constants.Constant;
//import com.jzh.xx.transaction.property.SwaggerProperties;
//import com.jzh.xx.transaction.utils.SwaggerUtil;
//import lombok.AllArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.RequestHandler;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.function.Predicate;
//
//@Configuration
//@EnableSwagger2WebMvc
//@AllArgsConstructor
//public class SwaggerConfig {
//
//    /**
//     * 引入swagger配置类
//     */
////    private final SwaggerProperties swaggerProperties;
//
//    @Bean
//    public Docket sellerDocker(){
//        return docket("卖家模块", Collections.singletonList(Constant.BASE_PACKAGES + ".controller.seller"));
//    }
//
//    @Bean
//    public Docket adminDocker(){
//        return docket("后台模块", Collections.singletonList(Constant.BASE_PACKAGES + ".controller.admin"));
//    }
//
//    private Docket docket(String groupName, List<String> basePackages) {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName(groupName)
//                .apiInfo(apiInfo())
//                .select()
//                .apis((Predicate<RequestHandler>) SwaggerUtil.basePackages(basePackages))
//                .paths(PathSelectors.any())
//                .build()
//                .pathMapping("/");
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title(swaggerProperties.getTitle())
//                .description(swaggerProperties.getDescription())
//                .license(swaggerProperties.getLicense())
//                .licenseUrl(swaggerProperties.getLicenseUrl())
//                .termsOfServiceUrl(swaggerProperties.getTermsOfServiceUrl())
//                .contact(new Contact(swaggerProperties.getContact().getName(), swaggerProperties.getContact().getUrl(), swaggerProperties.getContact().getEmail()))
//                .version(swaggerProperties.getVersion())
//                .build();
//    }
//
//}

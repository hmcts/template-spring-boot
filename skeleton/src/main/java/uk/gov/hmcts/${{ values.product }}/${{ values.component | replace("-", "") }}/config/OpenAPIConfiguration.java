package uk.gov.hmcts.${{ values.product}}.${{ values.component | replace("-", "") }}.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uk.gov.hmcts.${{ values.product}}.${{ values.component | replace("-", "") }}.Application;

@Configuration
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
            .info(new Info().title("${{ values.product}}.${{ values.component | replace("-", "") }}")
                      .description("${{ values.product}}.${{ values.component | replace("-", "") }}")
                      .version("v0.0.1")
                      .license(new License().name("MIT").url("https://opensource.org/licenses/MIT")))
            .externalDocs(new ExternalDocumentation()
                              .description("README")
                              .url("https://github.com/hmcts/${{ values.product}}.${{ values.component | replace("-", "") }}"));
    }

}
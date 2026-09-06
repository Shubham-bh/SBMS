package in.ashokit.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class swaggerConfig {

    @Bean
    public OpenAPI apiDoc(){
        return new OpenAPI()
                .info(new Info()
                        .title("IRCTC REST APT")
                        .version("1.0")
                        .description("This to Book Train Tickets"));
    }
}

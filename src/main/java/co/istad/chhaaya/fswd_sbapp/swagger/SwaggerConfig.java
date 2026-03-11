package co.istad.chhaaya.fswd_sbapp.swagger;





import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI myCustomOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Dim Pathea API Definition")
                        .version("2.0")
                        .description("Optional description of your MVC API"));
    }
}

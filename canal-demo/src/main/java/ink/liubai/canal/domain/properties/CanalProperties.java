package ink.liubai.canal.domain.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "canal")
public class CanalProperties {
    private String hostname;
    private Integer port;
}

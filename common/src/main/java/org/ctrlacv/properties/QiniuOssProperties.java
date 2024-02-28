package org.ctrlacv.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "ctrlacv.qiniu.oss")
@Data
public class QiniuOssProperties {
    private String accessKey;
    private String secretKey;
    private String bucket;
    private String domain;
}

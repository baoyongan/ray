package com.arc.mail.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 叶超
 * @since 2019/4/7 19:21
 */
@ConfigurationProperties(prefix = "spring.mail")
public class MailProperties {

    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    /**
     * SMTP server host.
     */
    private String host;

    /**
     * SMTP server port.
     */
    private Integer port;

    /**
     * Login user of the SMTP server.
     */
    private String username;

    /**
     * Login password of the SMTP server.
     */
    private String password;

    /**
     * Protocol used by the SMTP server.
     */
    private String protocol = "smtp";

    /**
     * Default MimeMessage encoding.
     */
    private Charset defaultEncoding = DEFAULT_CHARSET;

    /**
     * Additional JavaMail session properties.
     */
    private Map<String, String> properties = new HashMap<String, String>();

    /**
     * Session JNDI name. When set, takes precedence to others mail settings.
     */
    private String jndiName;

    /**
     * Test that the mail server is available on startup.
     */
    private boolean testConnection;

}

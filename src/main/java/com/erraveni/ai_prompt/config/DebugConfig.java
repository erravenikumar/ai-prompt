package com.erraveni.ai_prompt.config;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DebugConfig {

    @Value("${spring.ai.ollama.chat.options.model:NOT_SET}")
    private String model;

    @PostConstruct
    public void logModel() {
        System.out.println("Effective Ollama model = " + model);
    }
}

This project is a Spring Boot application that uses Spring AI with Ollama to run local LLMs (like Llama 3.2) via a REST API.

Project Overview
Tech stack:

Java 21

Spring Boot 3.5.8

Spring AI 1.1.0

Ollama (running locally on http://localhost:11434)

Main features:

Simple REST endpoint to send prompts to a local Ollama model.

Uses Spring AI’s ChatClient with the Ollama model.

Prerequisites
Java 21 installed.

Maven installed.

Ollama installed and running on your machine (Linux/macOS/WSL).

Model pulled in Ollama, for example:

ollama pull llama3.2:latest


```bash
curl -X POST http://localhost:8080/api/ai/chat \
  -H "Content-Type: application/json" \
  -d '{"prompt":"analyze NSE stocks with high volume"}'

```

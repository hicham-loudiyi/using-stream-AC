package com.example.myapp.web;

import com.example.myapp.agents.MyAiAgent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiAgentController {
    private MyAiAgent agent;

    public AiAgentController(MyAiAgent agent) {
        this.agent = agent;
    }

    @GetMapping("/askaiagent")
    public String askaiagent(String question) {
        return agent.ask(question);
    }
}

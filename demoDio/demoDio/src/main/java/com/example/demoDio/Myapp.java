package com.example.demoDio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Myapp implements CommandLineRunner {

    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        int resultado = calculadora.somar(3, 5);
        System.out.println("resultado é: " + resultado);
    }


    
}

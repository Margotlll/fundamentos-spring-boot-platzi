package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.springframework.stereotype.Component;

import java.io.Console;

public class MyBeanImplement implements MyBean{
   @Override
    public void Imprimir(){
        System.out.println("Hola desde mi bean");
    }
}

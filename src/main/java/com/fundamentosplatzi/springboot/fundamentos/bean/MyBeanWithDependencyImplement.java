package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{
    MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printwithdependency() {
        int a=4;
        int b=2;
        System.out.println(myOperation.sum(a,b));
        System.out.println("Hola desde la mi bean con dependencia implement, arriba la suma y multiplicacion");
    }
}

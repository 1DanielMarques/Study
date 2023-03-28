package org.example.core.dynamicproxy;

public class Program {
    public static void main(String[] args) {
        //man
        var man = new Man("Daniel", 19, "Londrina", "Brazil");
        Person proxyPerson;
        proxyPerson = (Person) DynamicProxy.createProxy(man);
        proxyPerson.introduce(man.getName());
        //woman
        var woman = new Woman();
        woman.setName("MULHER");
        proxyPerson = (Person) DynamicProxy.createProxy(woman);
        proxyPerson.introduce(woman.getName());
        //cat
        var cat = new Cat();
        Animal proxyAnimal = (Animal) DynamicProxy.createProxy(cat);
        proxyAnimal.makeNoise();

    }
}

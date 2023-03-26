package ru.job4j.polymorph;

public class ExampleClass {
    interface InnerExampleInterface { }

    public class AnotherClass
            implements ExampleClass.InnerExampleInterface { }
}

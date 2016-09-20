package com.company;

//2.3
public class B {

    U[] instances = new U[10];

    public void SaveU ()
    {
        for (int i = 0; i < 10; i++)
        {
            instances[i] = new U() {


                @Override
                public void method2(String str2) {

                }

                @Override
                public void method3(String str3) {

                }
            };
        }
    };

    public void ResetU (int reset)
    {
        reset = 6;
        instances[reset] = null;
    };

    public void InvokeAll()
    {   String string = "String for invoking methods";
        for (int i = 0; i < 10; i++)
        {instances[i].method2(string);};}
}

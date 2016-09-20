//Task 1

package com.company;

import java.io.IOException;
import java.nio.CharBuffer;

public class ClassWithArgument implements Readable {
    String st = "front-left/front-right/hind-right/hind-left";
    CharBuffer cb = CharBuffer.allocate(20);

    public int read(CharBuffer cb)
    {//cb.put (st);
        //return put(str, 0, str.length());
        cb.append(st);
        return -1;
    };
}



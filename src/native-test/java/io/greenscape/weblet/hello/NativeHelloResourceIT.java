package io.greenscape.weblet.hello;

import io.greenscape.weblet.hello.HelloResourceTest;
import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeHelloResourceIT extends HelloResourceTest {

    // Execute the same tests but in native mode.
}
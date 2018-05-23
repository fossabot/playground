package io.anothertobi.playground;

import io.anothertobi.playground.api.v1.EndpointV1;
import org.junit.Assert;
import org.junit.Test;

public class DummyTest {

  @Test
  public void testEndpointV1() {
    Assert.assertEquals("v1", new EndpointV1().version());
  }

}

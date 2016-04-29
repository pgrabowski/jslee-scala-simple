package com.piotrgrabowski

import javax.slee.ActivityContextInterface
import javax.slee.serviceactivity.ServiceStartedEvent

import org.junit.Test

/**
  * Simple test base on Java archetype generate test.
  */
class ScalaSbbTest {

  @Test def testOnServiceStartedEvent {
    classOf[ScalaSbb].getDeclaredMethod("onServiceStartedEvent", classOf[ServiceStartedEvent], classOf[ActivityContextInterface])
  }

}


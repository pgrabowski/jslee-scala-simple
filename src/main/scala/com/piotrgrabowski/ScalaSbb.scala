package com.piotrgrabowski

import javax.slee.ActivityContextInterface
import javax.slee.serviceactivity.ServiceStartedEvent

import com.opencloud.slee.services.base.BaseSbb

/**
  * Very simple JSLEE Scala example SBB.
  */
abstract class ScalaSbb extends BaseSbb {
  def onServiceStartedEvent(event: ServiceStartedEvent, aci: ActivityContextInterface) {
    getTracer.info("Hello JAIN SLEE World...")
  }
}

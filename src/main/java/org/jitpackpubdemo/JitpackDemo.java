package org.jitpackpubdemo;

import lombok.extern.slf4j.Slf4j;

import java.util.GregorianCalendar;

@Slf4j
public class JitpackDemo {

    public void logDateAndTime() {
        log.info("It is now {}", new GregorianCalendar().toZonedDateTime());
    }
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.study;

import org.junit.Test;
import com.study.step1.App;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}

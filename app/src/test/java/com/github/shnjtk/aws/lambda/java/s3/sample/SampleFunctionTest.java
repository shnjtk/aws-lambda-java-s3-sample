/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.github.shnjtk.aws.lambda.java.s3.sample;

import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SampleFunctionTest {
    @Test @Ignore
    public void missingRequiredParamTest() {
        SampleFunction classUnderTest = new SampleFunction();
        Map<String, Object> input = new HashMap<>();
        Map<String, Object> output = classUnderTest.handleRequest(input, null);
        assertEquals("Failure", output.get("Result"));
    }
}

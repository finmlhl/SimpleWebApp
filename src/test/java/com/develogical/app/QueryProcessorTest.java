package com.develogical.app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
    @Test
    public void knowsAboutYoung() throws Exception {
        assertThat(queryProcessor.process("Young"), containsString("man"));
    }    
    
    @Test
    public void knowsAboutMulyiplcation() throws Exception {
        assertThat(queryProcessor.process("7f18ee40: what is 16 multiplied by 18"), is("288"));
    }

}

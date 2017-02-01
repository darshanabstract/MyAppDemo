package com.devopsdemo.testcases;

import junit.framework.TestCase;

public class SeriousTest extends TestCase {

        public SeriousTest(String name) {
                super( name );
        }

        public void testSeriousness() throws Exception {
                assertTrue( "fun".toUpperCase().equals( "FUN" ) );
        }
}
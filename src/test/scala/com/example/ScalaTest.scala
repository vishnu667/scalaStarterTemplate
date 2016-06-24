package com.example

import org.junit.Test
import org.junit.Assert._

class ScalaTest {
@Test
def testAdd1Plus1 = {
    val x  = 1
    val y = 1
    assertEquals(x+y,2)
}
}

package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  
/** java doc comment
 *@param someone
 *@retunr
 */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}

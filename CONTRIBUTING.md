# Contributing

Welcome to the cash register project!

A few things you should know:

- The static methods in `cashregister` are designed to work with a "drawer" full of money.
  Take a look at `Drawer.java` to see what one looks like.

- Currency is in USD: penny, nickel, dime and quarter are coins; everything else
  is a note

- Drawer objects are always ordered descending by value (biggest denomination at
  the front)

- Value is always given as an integer in cents, and never a decimal, so a
  `value` of `210` means $2.10.
  [Want to know why?](https://blog.agentrisk.com/you-better-work-in-cents-not-dollars-2edb52cdf308)

- Debugging! You will probably want to do some `console.log` to debug. The `drawer.js` has been imported into each file, so you can do, for example

  ```java
  // Level1.java
  public static void main(String[] args) {
    removeItem("penny", Drawer.drawer);
    System.out.println(Drawer.drawer.getLast().getValue());
  }
  ```

  then run

  ```
  ./mvnw clean compile exec:java -Dexec.mainClass=com.corndel.cashregister/Level1.java
  ```

  to see what happens.

- Just make sure to remove the `console.log` before you test, commit, push!
  Don't want to leave a bunch of logs clogging up the place :wood:

If you're happy with all this, open up `TODO.md` and have fun!

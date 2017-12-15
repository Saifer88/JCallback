# After Download - Download and work on web resources



---

With this tool you can download and, with Lambda, work on remote resources



---


## Use it

You can clone the repository and build with Maven

```sh
$ mvn install
```

The jar will be created and you can include it in your project



---


## Example

```java
        ConnectionProvider.asynchronousGet(
                "https://www.google.it",
                 html -> System.out.println("The page you looked for is long: " + html.length())
        );
    
        ConnectionProvider.get(
                "https://www.google.it",
                 html -> System.out.println("The page you looked for is long: " + html.length())
        );


```

You can block your code while it is capturing the resource or not, it depends on the function you call
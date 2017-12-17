# JCallback - Download and work on web resources



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


Some examples here, just put the address and manage the result
when it is ready.


```java

JCallback.asyncGet(
        "https://www.google.it", 
        (String page) -> System.out.println(page));

//or cuter
JCallback.asyncGet(
        "https://www.google.it", System.out::println);




JCallback.asyncDownload(
        "http://testMe.com/5MB.zip",
        (File file) -> System.out.println(file.getName()));

//or cuter
JCallback.asyncDownload(
        "http://testMe.com/5MB.zip",
        file -> System.out.println(file.getName()));



```

You can block your code while it is capturing the resource or not, it depends on the function you call
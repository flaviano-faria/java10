# Java 10 Immutable Collections Demo

## Project Overview

This project demonstrates the use of Java 10 features, focusing on immutable collections and enhancements to the Java Collections API. The codebase is organized into several packages:

- `domain`: Contains core domain classes such as `User`, `Permission`, and its subtypes (`Read`, `Write`, `Execute`).
- `service`: Contains the service implementation (`ServiceImpl`) that manipulates users and permissions.
- `interfaces`: Contains the service interface (`IServicePort`).
- `exec`: Contains the main application entry point (`App`).

## Main Components

- **User**: Represents a user with a list of permissions. The permissions list is made immutable using Java 10 features.
- **Permission, Read, Write, Execute**: Represent different types of permissions.
- **ServiceImpl**: Implements business logic for adding permissions and demonstrating Java 10 collection features.
- **App**: The main class to run the application.

## Java 10 Features Used

### 1. Local Variable Type Inference (`var`)
Java 10 introduced the `var` keyword, allowing local variables to be declared without explicitly stating their type. The compiler infers the type from the initializer.

Example from `User.java`:
```java
var list = List.of(1, 2, 3, 4, 5);
var copiedList = List.copyOf(list);
```
This makes code more concise and readable, especially when the type is obvious from the context.

### 2. Immutable Collections (`List.of`, `List.copyOf`)
Java 10 enhanced the Collections API with convenient factory methods for creating immutable collections.
- `List.of(...)` creates an immutable list.
- `List.copyOf(...)` creates an immutable copy of an existing collection.

Example from `User.java`:
```java
var list = List.of(1, 2, 3, 4, 5);
var copiedList = List.copyOf(list);
```
Attempting to modify these lists (e.g., `copiedList.add(2)`) will throw an `UnsupportedOperationException`.

### 3. Optional Enhancements
While not new in Java 10, the use of `Optional` is demonstrated in `ServiceImpl.java` for handling potentially null values in a more expressive way.

Example:
```java
Optional<List> listPermission = Optional.ofNullable(user.getNullPermission());
List optionalCheck = listPermission.orElseThrow(() -> new Exception("null permission"));
```

## How to Run

1. Ensure you have Java 10 installed.
2. Build the project using Maven:
   ```
   mvn clean install
   ```
3. Run the main class:
   ```
   java -cp target/java10-0.0.1-SNAPSHOT.jar br.com.java10.immutablecollections.exec.App
   ```

## Summary

This project is a practical demonstration of Java 10's local variable type inference and immutable collections. It shows how to use these features to write safer, more concise, and more expressive Java code. 
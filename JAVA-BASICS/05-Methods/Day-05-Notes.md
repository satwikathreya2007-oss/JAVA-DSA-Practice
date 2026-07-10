# Day 04 - Methods in Java

## Introduction 

A ** method "" is a block of code that performs a specific tasks.

 Instead of writing the same code multiple times , we wrute it once and call it whenever it is needed.

 ---
  
# why Use  methods ?

 Methods provides several advantages : 

  - Reduce code duplication.
  - Improve code readibility.
  - makes programs easier to maintain.
  - promote code reusability.

  ---

 # Method Syntax 

   ```java
returnType methodName(parameters) {
    // Method body
}
```
### Example

```java
static void greet() {
    System.out.println("Hello!");
}
```

---

# Components of a Method 

## 1. Return of a Method

 The return type specifies the type of value a method returns.

Common return types :

- `void`
- `int`
- `double`
- `float`
- `char`
- `boolean`
- `String`

Example:

```java
int add()
```
 
 ---

 ## 2. Method Name

The method name identifies the method and should clearly describe its purpose.

Examples:

```java
greet()
calculateArea()
printDetails()
findMaximum()
```

---

## 3. Parameters

Parameters are input values accepted by a method.

Example:

```java
add(int a, int b)
```

// Here, `a` and `b` are parameters.

---

## 4. Method Body

The method body contains the statements that define the task performed by the method.

Example:

```java
{
    System.out.println("Hello");
}
```

---

# Calling a Method

A method executes only when it is called.

Example:

```java
greet();
```

---

# Example Program

```java
public class Main {

    static void greet() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        greet();
    }
}
```

### Output

```
Hello!
```

---

# Practice Programs

1. Print "Hello Java" using a method.
2. Create a method to print your name.
3. Create a method to print a separator line.
4. Call the same method multiple times.
5. Create two different methods and call both from `main()`.

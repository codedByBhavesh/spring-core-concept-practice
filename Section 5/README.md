# Dependency Injection

Dependency Injection (DI) means **Spring provides the required dependency to an object instead of the object creating it itself.**

### Constructor Dependency Injection

Dependency is provided through the **constructor**

public Student(Address address) {
this.address = address;
}

### Method Dependency Injection

Dependency is provided through a **method**.

public void setAddress(Address address) {
this.address = address;
}

**In short:**

* Constructor DI → dependency through constructor
* Method DI → dependency through method
* Spring Container manages both dependencies.


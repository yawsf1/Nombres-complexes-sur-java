# Nombres Complexes en Java

## Description
A simple Java project implementing a Complexe class to perform operations on complex numbers (addition, multiplication) and display them in a readable format.

## Features
- Create complex numbers
- Add two complex numbers
- Multiply two complex numbers
- Print complex numbers in standard format (e.g., 3 + 2i, 5, 7 - 4i)

## Usage
1. Clone the repository:
git clone https://github.com/yawsf1/Nombres-complexes-sur-java.git

2. Open the project in IntelliJ IDEA or any Java IDE.
3. Compile and run the Complexe class or your test main method.
4. Example:
public class Main {
    public static void main(String[] args) {
        Complexe a = new Complexe(3, 2);
        Complexe b = new Complexe(1, 4);

        Complexe sum = a.addCom(b);
        Complexe product = a.multiCom(b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + sum);
        System.out.println("a * b = " + product);
    }
}

## Output Example
a = 3 + 2i
b = 1 + 4i
a + b = 4 + 6i
a * b = -5 + 14i

## Requirements
- Java JDK 8 or higher
- Git (for cloning)

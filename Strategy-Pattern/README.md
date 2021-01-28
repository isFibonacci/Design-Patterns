Step 1
Create an interface.
```
Strategy.java

public interface Strategy {
public int doOperation(int num1, int num2);
}
```
```java
OperationAdd.java

public class OperationAdd implements Strategy{
@Override
public int doOperation(int num1, int num2) {
return num1 + num2;
}
}
OperationSubstract.java

public class OperationSubstract implements Strategy{
@Override
public int doOperation(int num1, int num2) {
return num1 - num2;
}
}
OperationMultiply.java

public class OperationMultiply implements Strategy{
@Override
public int doOperation(int num1, int num2) {
return num1 * num2;
}
}
```
Step 2
Create concrete classes implementing the same interface.

Step 3
Create Context Class.

Context.java

public class Context {
private Strategy strategy;

public Context(Strategy strategy){
this.strategy = strategy;
}

public int executeStrategy(int num1, int num2){
return strategy.doOperation(num1, num2);
}
}
Step 4
Use the Context to see change in behaviour when it changes its Strategy.

StrategyPatternDemo.java

public class StrategyPatternDemo {
public static void main(String[] args) {
Context context = new Context(new OperationAdd());		
System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSubstract());		
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMultiply());		
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
}
}
Step 5
Verify the output.

10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
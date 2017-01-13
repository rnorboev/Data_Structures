/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postfix;

/**
 *
 * @author admin
 */
import datastructures.LinkedStack;
import java.util.StringTokenizer;
public class PostfixEvaluator 
{
    /** constant for addition symbol */
private final char ADD = '+';
/** constant for subtraction symbol */
private final char SUBTRACT = '-';
/** constant for multiplication symbol */
private final char MULTIPLY = '*';
/** constant for division symbol */
private final char DIVIDE = '/';
/** the stack */
private final LinkedStack<Integer> stack;
/**
* Sets up this evaluator by creating a new stack.
*/
public PostfixEvaluator()
{
stack = new LinkedStack<>();
}
/**
* Evaluates the specified postfix expression. If an operand is
* encountered, it is pushed onto the stack. If an operator is
* encountered, two operands are popped, the operation is
* evaluated, and the result is pushed onto the stack.
* @param expr String representation of a postfix expression
* @return int value of the given expression
*/
public int evaluate (String expr)
{
int op1, op2, result = 0;
String token;
StringTokenizer tokenizer = new StringTokenizer (expr);
while (tokenizer.hasMoreTokens())
{
token = tokenizer.nextToken();
if (isOperator(token))
{
op2 = (stack.pop());
op1 = (stack.pop());
result = evalSingleOp (token.charAt(0), op1, op2);
stack.push (result);
}
else
stack.push (Integer.parseInt(token));
}
return result;
}
/**
* Determines if the specified token is an operator.
* @param token String representing a single token
* @return boolean true if token is operator
*/
private boolean isOperator (String token)
{
return ( token.equals("+") || token.equals("-") ||
token.equals("*") || token.equals("/") );
}
/**
* Performs integer evaluation on a single expression consisting of
* the specified operator and operands.
* @param operation operation to be performed
* @param op1 the first operand
* @param op2 the second operand
* @return int value of the expression
*/
private int evalSingleOp (char operation, int op1, int op2)
{
    int result = 0;
switch (operation)
{
case ADD:
result = op1 + op2;
break;
case SUBTRACT:
result = op1 - op2;
break;
case MULTIPLY:
result = op1 * op2;
break;
case DIVIDE:
result = op1 / op2;
}
return result;
}

}

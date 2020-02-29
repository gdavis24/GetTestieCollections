package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void TestStackPush()
    {
        Stack<String> stack = new Stack<>();
        stack.push("Did you ever ");
        stack.push("hear the tragedy of ");
        stack.push("Darth Plagueis The Wise?");
        stack.push("I thought not. ");
        stack.push("It's not a story ");
        stack.push("the Jedi would tell you.");
        String expected = "the Jedi would tell you.";
        String actual = stack.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void TestStackPop()
    {
        Stack<String> stack = new Stack<>();
        stack.push("Did you ever ");
        stack.push("hear the tragedy of ");
        stack.push("Darth Plagueis The Wise?");
        stack.push("I thought not. ");
        stack.push("It's not a story ");
        stack.push("the Jedi would tell you.");
        String newString = stack.pop();
        String expected = "It's not a story ";
        String actual = stack.peek();
        assertEquals(expected, actual);
    }
    // Make a bigger test exercising more Stack methods.....
}

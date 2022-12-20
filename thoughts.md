# Thoughts scratch file
## My initial thoughts on part 1
Looking at the input samples, my first instinct is that this is going to turn into a nested list of stacks.
My problem is to get the input from the file to a data structure in a programmatic way.

- What is my input?
  - a file that is separated into two parts.
    - part one is a list of stacks that contain strings
    - part two is a list of strings that contain instructions on how to manipulate the stacks
- What is the intended output? The final shape of the solution.
  - I am supposed to produce a string of letters that represent the top crate in the stacks after applying the operations

I think the problems I need to solve are these:
- how to interpret the file into parsable data.
- create a stack for each column in the file.
  - The stacks should have these methods: pop, peek, and add.
- create a list of the created stacks to represent the columns.
- create a class that will apply instructions to the list of columns.
- Finally, a class or method that will grab the top value of each stack. Note: there might be nulls.

The order of things to implement and test.
- stack and it's behavior
- a class that houses the list of stacks and the methods it can apply to it.
  - This will include the methods that will manipulate the stacks.
- the file reader that will generate the list and then insert the instructions


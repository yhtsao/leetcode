Design a max stack that supports push, pop, top, peekMax and popMax.

push(x) -- Push element x onto stack.

pop() -- Remove the element on top of the stack and return it.

top() -- Get the element on the top.

peekMax() -- Retrieve the maximum element in the stack.

popMax() -- Retrieve the maximum element in the stack, and remove it. If you find more than one maximum elements, only remove the top-most one.

Example 1:

MaxStack stack = new MaxStack();
<br>stack.push(5); 
<br>stack.push(1);
<br>stack.push(5);
<br>stack.top(); -> 5
<br>stack.popMax(); -> 5
<br>stack.top(); -> 1
<br>stack.peekMax(); -> 5
<br>stack.pop(); -> 1
<br>stack.top(); -> 5

Note:

-1e7 <= x <= 1e7
Number of operations won't exceed 10000.
The last four operations won't be called when stack is empty.
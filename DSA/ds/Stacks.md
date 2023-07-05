**Stacks** are data structures that uses the *last-in first-out* ordering. Stacks can be implemented using the base linked list approach, where the structure of one link / node / instance would hold a value and a reference to the *next* instance, i.e. the object *on top* of the current one.

>Ludic Explanation:
>Think you are working as a dishwasher, at a famous restaurant, servers take plates the customers used and load them in a single location in order for you to put them through the dishwashing machine. 
>The oncoming plates are placed (*to simplify, lets say each server can only carry one plate at a time*) on a balcony, if there is already plate(s) in the spot, the oncoming go on top of the other(s). 
>When unloading your pile of plates, you do so by taking the top-most one, and loading it to the rack to go to the dishwashing machine, after a quick rinse. You sometimes look at the top of it to see if the next plate will fit in the rack, but don't necessarily take the plate out.
>When the pile is empty you can take a break.
>This vertical* structure, this pile or **stack** pf plates is what you use to perform operations on your working station.

\*Thinking of the **Stack** as a vertical data structure is just a way of easing the understanding of it. 
___
#### Operations
There are four operations essential to guaranteeing the **LIFO** (*last-in first-out*) behaviour of a **Stack**, or at least making it on par with what is expected from this kind of data structure:
* pop() -> remove item from the top of the stack
	* **Pop** takes the item from the top of the stack and returns it (essentially removes reference to this item from the stack *second item*, top-bottom)
* push(item) -> add item to the top of the stack
	* **Push** puts a new item on top of the stack (essentially linking the two top-most items), may return true or false if the operation is successful or not (not usual)
* peek() -> get item at the top of the stack
	* **Peek** returns item at the top of the stack, **without removing it from the stack** (essentially returns a reference to item at the top of the stack)
* isEmpty() -> check if there is anything on top of the stack
	* **isEmpty** returns true or false depending if there is any item on the stack

> Often times it is simpler to just use a deque to implement a stack in JAVA

___
#### Characteristics
A **stack** does not offer a constant-time access to the i<sup>th</sup> item, since it operates always on the top object (following **FIFO** order). Meaning only a reference to the top of the stack is maintained.
Adds (pushes) and removes (pops) are constant time for the same reason, only concerned with top object, no shifting of objects, changing ordering.
>Often, stacks are useful in recursive algorithms, i.e. temporarily pushing objects onto a stack as the algorithm recourse and then popping them out as it backtracks 
>Also helpful when translating a recursive algorithm into iterative form (i.e. fibonnacci)
><sub>MCDOWELL, Gayle Laakmann. **Cracking the Coding Interview, 6th Edition**. [_S. l._: _s. n._], 2015.</sub>
___
# TODO
- [ ] create implementation
	- [ ] Java
	- [ ] C++
- [ ] create Java Deque entry
- [ ] back reference / integrate this file with the rest
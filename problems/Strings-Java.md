# Strings

In Java, (java.lang.)String is a wrapper class that is used to represent a character array as an object. 

Strings are:

* Immutable - once the constructor for a particular string object finishes execution, that instance can no longe be altered.
* Thread safe - because it is immutable, references to a string can be exchanged without worrying about locking issues in concurrent operations.

---

#### Comparisons:

There are a lot of ways to compare strings, depending on what is the ultimate objective of the comparison.

**To simply check for equality:** use **java.lang.String**'s *equals* or *equalsIgnoreCase*. These compares the underlying character sequence of two string objects, if they are the same, they return true, otherwise (or if one of the objects is null), false. **java.util.Objects**' *equals* method may also be used for better readability, nullity check and when comparing to a string literal.

**To simply check for equality between different string representations:** when comparing Strings to other string representation objects (StringBuffer and/or CharSequence), *contentEquals* should be used (this synchronizes on the StringBuffer).

> Definition of Lexicographic ordering:
>
> Strings are different if either they contain different charaters at the same indexes. Meaning there are 2 ways any two strings can differ, **either they have a different character at some valid index** (for both strings), or **one of them has a character at a position that is invalid for the other one** (one string is longer than the other).
>
> **If the strings have different characters at any (valid) indexes, the string with the smallest character at the lowest possible index precedes the other lexicographically**. The smallest index of any that are found divergent is used for the comparison, then the characters at that index are compared, in the compareTo case the return value is equal to this.charAt(index) - anotherString.charAt(index).
>
> **If there is no index in which they differ, then the shorter string precedes the longer string lexicographically**. compareTo returns this.length() - anotherString.length().

**Do not check string equality with == (unless you are interested in the reference itself):** Depending on where the String object "lives" the result of this comparison is affected. Because [any two string literals consisting of the same characters, will be represented by the same String object](https://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html#jls-3.10.5 "link to java specification") (see example 3.10.5-1), comparing string with == may lead to inconsistent results, as the string references may be distinct or not. == does not compare the contents of the string, just its reference representation (object). String literals may be on the "string pool" and other strings on the heap.

**To check for equality, but there are other operations that need to be done based on string content:** use a loop to iterate over the indexes of target string and check characters using **java.lang.String**'s *charAt* method.

---

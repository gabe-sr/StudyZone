# Java
---
## Methodology
at first this file will contain a myriad of notes on various aspects of the language (Java) I encounter along the way, from the very basic to more niche ones, and after some content is input here, I will organize it in a more structured way. I will try to come up with and populate each note with descriptive tags. This is to facilitate organization afterwards
---
### Unstructured Notes
* Java is a compiled, high level language that runs in its own virtual machine, the Java Virtual Machine (JVM). This makes it highly portable, generally if a code is compiled once it can be run in various places, only depending on the JVM version. (t:basic)

* Consensus on variable naming is using camelCase (t:basic)

* Floating point is, as expected, not truly precise due to binary mantissas (repeating fraction) (t:basic)

* *package* is a collection of related classes, a directory where all these classes are located (t:basic)

* Formatting output : 
| symbol | type |
| ------ | ---- |
| %d | Integer (base 10), decimal |
| %,d | Integer with comma separators |
| %08d | Integer, padded with 0s at least 8 digits wide |
| %f | Floating point number |
| %.2f | Floating point number, rounded to 2 decimal places |
| %s | String (char array) |
|%x | Integer (base 16), hexadecimal |
-check java.util.Formatter

* java standard array has a *property* that returns the size called length, it is not a method.
# C
---
### Types
int: intended to variables assigned to store integer numbers. Always uses 4 bytes of memory, equivalent to 32 bits (-2<sup>31</sup> to 2<sup>31</sup>-1)
unsigned = qualifier that effectively doubles (positive) range when applied to 
* int = 0 to 2<sup>32</sup>-1

char: intended to variables assigned to store character. Always takes up 1 byte of memory, equivalent to 8 bits, mapped to positive numeric values due to ASCII
float: intended to variables assigned to store floating-point values (think decimals), real number domain. Similarly to int, always takes up 4 bytes of memory, equivalent to 32 bits

### Getting user input
scanf: 
(1) when getting input from a user, it is good practice to prepend a **space** in the restric format string, i.e. add a space before the format specifier. This is to remove any trailing consecutive whitespace (" ", "\n", "\t", etc...), this prevents an infinite loop if the scanf is inside a loop.
```while(character != 'a'){scanf(" %c", character);} ```
(2) an input different that the expeted type will result in a default value (i.e. expected an int, got a char, value will be 0).

## Pointers
C is strictly a "pass by value" language any pointers passed to methods/functions will be dereferenced at calling time. This means that if you pass a pointer to an array, the size of the array is unknown in the method's context, i.e.:
```
checkId(const int vendor[]);
or 
checkId(const int vendor[9]);
will evaluate to 
checkId(conts int* vendor);
```
so it will not be possible to get size using ```sizeof(vendor)/sizeof(vendor[0])``` because ```sizeof(vendor) == sizeof(const int*)```
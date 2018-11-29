# Code against time

Given a list of possible keys, find the right key and help the group of scientists.

The input file contains the coffer’s cipher on the first line, the number of possible keys on the second line and the list of possible keys on the third line, separated by a single space.

The key that could open the coffer has a binary representation which, by overlapping a sequence of the binary decomposition of the lock’s cipher, modifies the cipher following these rules:
•    0 over 1 transforms it in 1
•    1 over 0 transforms it in 1  
•    0 over 0 transforms it in 0
•    1 over 1 transforms it in 0
The lock opens if, after the overlapping process, the binary representation of the coffer’s cipher contains only values of 1. 
The output file must contain the number of keys found. If no key is found, then the output will be 0.

#### Input:
- cipher on the first line
- n integer – the number of possible keys
- keys - list of possible keys on the third line, separated by a single space. The list of possible keys can also contain values of a length different than the cipher to be compared with.
Output: result representing the number of keys found.

#### Example:
**For**

    0101110
    5
    1100101 1010001 0000000 1111111 0101110    

The output will be: 1.

**For**

    0101110
    2
    0000000 111111111

The output will be: 0.

**For**

    0101010
    6
    1100101 1010101 0000000 1111111 0101110 1010101

The output will be: 2.

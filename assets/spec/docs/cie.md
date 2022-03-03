#CIE Calculations
##Requirements
- one or more assessment scores are provided as input
- score of each assessment is a number (it is integer. however flexibility for decimal is desirable)
- the process involves cherry-picking (best 2 of three..) averaging and scaling
##Objectives: 
- End users should be able to
    - design and implement it
    - test it before running it
    - easily figure out what the mistakes and fix them
- Programmers should be able to understand the code
- Testability
- Performance should be acceptable
- Algorithm should be simple enough to be implemented on the client

##Design
*Assessment Scheme* is the word used to organize cie details. Number of tests, max number of marks for each of them, and the way to calculate cie for a subject are the attributes of a scheme.

In the database, assessment_schemes table is the header and assessment_items is the table with test details for the scheme. Each test within a scheme is numbered from 1 to n (n being the number of tests)

An institute can create any number of schemes.

An offered( and taught) subject chooses a scheme before CIE can be entered. Note that the scheme is the same for all sections.

Integrated subjects **do not** have the concept of CIE. It is carried out at the individual subject level.

An assessment scheme has fixed number of assessments or tests. (We will use the term test, simply because we don't have to twist our tongue to pronounce it). Each test carries a maximum marks.

CIE calculation is expressed as an *expression* that can be used to calculate the cie for the subject based on the marks for all the tests. Arithmetic expression with use of functions would provide maximum flexibility. However, the actual requirement is much simpler, and hence a subset of it is designed.

CIE Expression :
- is a summation of one or more *terms*
- a number, say 3, is the simplest term.
- a test-score, say m1, is a term that evaluates to the actual marks scored by the student in that test
- a function, say average(m1,m2) is a term that is evaluated based on the definition of the function and the value of its arguments.
- arguments for a function can be either constants or test-scores. To keep things simple, a function can not be used as an argument for another function.

Example of valid expressions
- 12
- m1
- sum(m1, m2)
- max(m1, m2)
- max(m3, 15)
- a()
- m1 + 10
- foo(m1,m3) + m3 + faa(m2, m4)

Examples of invalid expressions, assuming there are 4 tests
 - m 1    - can not have space between m and number
 - M 1    - case sensitive
 - t1     - only m is allowed
 - foo(faa(m1))  - no embedded functions
 - m1 - m2  - only + allowed

Functions are to be implemented in Java and placed in a specific package for them to be used in an expression. A base class named NumericFunction needs to be extended by such a class.
average, max, min and sum are pre-defined by the frame-work.


##Implementation
A java class named CieCalculator is written to implement this design. Extensive documentation is provided at the source level for the same. Junit class for this not only provides auto-testing, it also serves as features specification for the same. 


This class is *not linked* to any data base design. It is implemented as a pure algorithmic component that can be used/tested by calling with data and getting data as output. However,its API  design is based on the needs of a DB related operation.


Extensive error reporting is implemented to detect the cause of errors. 

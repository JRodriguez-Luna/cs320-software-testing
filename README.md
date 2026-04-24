# CS 320 – Software Testing, Automation QA
Southern New Hampshire University

## What's in this repository

- **Contact.java** – Defines the Contact object and its validation rules
- **ContactService.java** – Manages adding, deleting, and updating contacts
- **ContactTest.java** – Unit tests for the Contact class
- **ContactServiceTest.java** – Unit tests for the ContactService class
- **Project Two Report** – Summary and reflections on software testing

---

## Reflections

**How do I ensure my code is functional and secure?**

I write unit tests to verify that my code works correctly and handles 
bad input gracefully. In this course I used JUnit 5 to test every 
method in my Contact service, including cases where someone passes in 
null values or strings that are too long. I used EclEmma to measure 
how much of my code was actually being tested, and kept improving my 
tests until I hit above 80% coverage. Catching problems through tests 
is a lot better than finding them after the software is already in 
someone's hands.

**How do I interpret user needs and incorporate them into a program?**

I start by reading the requirements carefully and turning them into 
rules the code has to follow. For example, the client needed contact 
IDs to be no longer than 10 characters and names no longer than 30 — 
so I built those limits directly into the Contact class and wrote tests 
to make sure they held. Requirements are not just background reading, 
they are the definition of what "working correctly" actually means.

**How do I approach designing software?**

I build things in small steps and test as I go. I start with the core 
functionality, then write tests to see if it actually behaves the way 
I expect, and then fix or improve anything the tests expose. This 
course reinforced that thinking about how something could break — 
before you are done building it — leads to cleaner, more reliable 
code.


| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Lei Zhu                    |
| Date         | 10/10/2024                 |
| Course       | Fall                       |
| Assignment # | 2                          |

# Assignment Overview
Design a Notification App to notify the drivers of the notifications.

# GitHub Repository Link:
https://github.com/LeiZ54/cs-665-assignment-2.git

# Implementation Description
- Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future.  
  By using an abstract class and the Observer Pattern, new driver types can be easily added or removed by extending the Driver class without modifying existing code.

- Discuss the simplicity and understandability of your implementation, ensuring that it is
easy for others to read and maintain.  
  The implementation is simple and easy to understand due to clear use of inheritance, the Observer Pattern, intuitive naming, and modular design, making it easy to read, maintain, and extend.

- Describe how you have avoided duplicated code and why it is important.  
  Duplicated code is avoided by centralizing shared logic in the abstract Driver class, making the code easier to maintain, extend, and update with fewer errors.

- If applicable, mention any design patterns you have used and explain why they were
chosen.
  Observer Pattern: This pattern was chosen because it decouples the shop from the drivers, making it easy to add or remove drivers without changing the shop's core logic, ensuring flexibility and scalability.

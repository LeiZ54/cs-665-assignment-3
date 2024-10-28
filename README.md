
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Lei Zhu                    |
| Date         | 10/25/2024                 |
| Course       | Fall                       |
| Assignment # | 3                          |

# Assignment Overview
Design a Notification App to notify the drivers of the notifications.

# GitHub Repository Link:
https://github.com/LeiZ54/cs-665-assignment-3.git

# Implementation Description
- Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future.  
  The implementation is very flexible due to the use of the factory pattern and inheritance. Adding a new customer type is simply a matter of creating a new customer subclass and making a slight addition to the customer factory. This modular approach also allows for the deletion of any customer type by simply removing the corresponding class and factory case.
- Discuss the simplicity and understandability of your implementation, ensuring that it is
easy for others to read and maintain.  
  The abstract Customer class provides a unified interface for email generation, clarifying the purpose of each subclass, and the CustomerFactory centralizes the creation of objects and ensures that the code is clean and easy to read. These elements make the design easy for other developers to understand and maintain.
- Describe how you have avoided duplicated code and why it is important.  
  Abstract Customer class encapsulates the shared properties and behaviors of all client types, which avoids duplicate code and is easier to maintain and modify.
- If applicable, mention any design patterns you have used and explain why they were chosen.
  The factory pattern to accomplish the creation of customers allows for easy extension of new types. This pattern was chosen because it encapsulates the object creation logic, improving modularity and flexibility.
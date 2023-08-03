# Task-management-system

### Description:
This project is a simple task management system that allows users to create, update, and manage different types of tasks. The system provides flexibility by supporting various task types, such as one-time tasks, daily tasks, weekly tasks, monthly tasks, and yearly tasks.

---

### Key Features:

Task Types: The system offers multiple task types, including one-time tasks that occur only once, daily tasks that repeat every day, weekly tasks that repeat on specific days of the week, monthly tasks that occur on specific days of the month, and yearly tasks that occur on specific days of the year.

Validation: The project incorporates a robust validation mechanism to ensure that task attributes, such as title, description, date, and type, are provided correctly. Incorrect input leads to custom IncorrectArgumentExceptions that handle validation errors.

Task Management: The TaskService class serves as the core of the application and manages tasks. Users can add, update, and remove tasks using this service. The service also provides methods to retrieve tasks for specific dates and group tasks by date.

Test-Driven Development (TDD): The project follows the Test-Driven Development approach, which includes a set of integration and unit tests using JUnit. The tests ensure that each component of the system functions as intended, promoting stability and reliability.

Data Persistence: The project uses in-memory data structures to store tasks during runtime. Although a real database is not integrated, the system demonstrates how tasks can be managed using collections.

Usage:
Users can interact with the task management system through the Main class. The Main class demonstrates how to create different types of tasks and utilize the TaskService for managing and displaying tasks.

---

### Technology Stack:

Java 17 
---
### How to Run:

Clone the repository to your local machine.
Open the project in an IDE that supports Java.
Locate the Main class and run it to see the demonstration of task management functionality.
Note: The project does not include a graphical user interface (GUI) as it mainly focuses on the core logic for task management. Developers can further extend the project by implementing a GUI or integrating a database for persistent storage of tasks.

---

### Contributions:
Contributions to this project are welcome. If you find any issues or have ideas for improvement, please feel free to submit pull requests or raise issues on the GitHub repository.

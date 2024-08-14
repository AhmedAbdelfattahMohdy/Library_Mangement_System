# 📚 Library Management System

A comprehensive Library Management System built with Java, Spring Boot, and MySQL to manage a library's catalog of books, patrons, and borrowing records. It offers a RESTful API that allows CRUD operations on the library's resources.

## 🚀 Features

- **Book Management:** Add, update, delete, and search for books in the library catalog.
- **Patron Management:** Manage patrons' information, including registering new patrons, updating their details, and removing them.
- **Borrowing Records:** Track which books are borrowed by which patrons and when they are due for return.
- **REST API:** Expose all functionalities through a well-structured RESTful API.
- **Responsive Design:** Optimized for all devices.
  
## 🛠️ Technologies Used

- **Backend:**
  - Java
  - Spring Boot
  - Spring Data JPA
- **Database:**
  - MySQL
  - XAMPP (phpMyAdmin for database management)
- **Tools:**
  - Maven
  - Postman (for API testing)

## 📖 Project Structure

```plaintext
📁 src
 ┣ 📂 main
 ┃ ┣ 📂 java
 ┃ ┃ ┗ 📂 com.example.library_management_system
 ┃ ┃ ┃ ┣ 📂 controller   # REST Controllers
 ┃ ┃ ┃ ┣ 📂 model        # Entities (Book, Patron, Borrowing Record)
 ┃ ┃ ┃ ┣ 📂 repository   # Repositories (JPA Repositories for database operations)
 ┃ ┃ ┃ ┗ 📂 service      # Services (Business Logic)
 ┃ ┣ 📂 resources
 ┃ ┃ ┣ 📜 application.properties  # Configuration files
 ┣ 📁 test  # Unit Tests

```
## 📦 Getting Started

### Prerequisites

* Java 17
* Maven
* MySQL (via XAMPP)
* Postman (for testing API)

### Installation

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/AhmedAbdelfattahMohdy/library_management_system.git
   cd library_management_system
   
2. **Configure the Database:**
   
   * Start MySQL via XAMPP.
   * Create a new database called library_management_system.
   * Update `application.properties` with your MySQL credentials:
     
     ```properties
     
     spring.datasource.url=jdbc:mysql://localhost:3306/library_management_system
     spring.datasource.username=root
     spring.datasource.password=your_password

3. **Run the Application:**
    ```bash
    mvn spring-boot:run
4. **Test the API Endpoints:**
   
   Use Postman to test the API. For example, to add a new book:

   ```http
   POST /api/books
   Content-Type: application/json
   {
    "title": "Book1",
    "author": "Author1",
    "publicationYear": 2024,
    "isbn": "ISBN12345"
   }

## 🔗 API Endpoints

### Books

- **GET** `/api/books` - List all books
- **POST** `/api/books` - Add a new book
- **GET** `/api/books/{id}` - Get book details by ID
- **PUT** `/api/books/{id}` - Update book details by ID
- **DELETE** `/api/books/{id}` - Delete a book by ID

### Patrons

- **GET** `/api/patrons` - List all patrons
- **POST** `/api/patrons` - Add a new patron
- **GET** `/api/patrons/{id}` - Get patron details by ID
- **PUT** `/api/patrons/{id}` - Update patron details by ID
- **DELETE** `/api/patrons/{id}` - Delete a patron by ID

### Borrowing Records

- **POST** `/api/borrow/{bookId}/patron/{patronId}` - Allow a patron to borrow a book.
- **PUT** `/api/return/{bookId}/patron/{patronId}` - Record the return of a borrowed book by a patron.

## 🧪 Testing

Run unit tests with:

```bash
mvn test
```

## 🎯 Future Enhancements

* **User Authentication:** Add authentication and authorization for the API.
* **UI Integration:** Develop a user-friendly frontend.
* **Reporting:** Add reporting features for loans and returns.

## 🤝 Contribution

Contributions are welcome! Please open an issue or submit a pull request.

## 💬 Contact

For any questions or suggestions, feel free to reach out:

* **Email:** ahmedmohdy1999@gmail.com
* **GitHub:** [AhmedAbdelfattahMohdy](https://github.com/AhmedAbdelfattahMohdy)


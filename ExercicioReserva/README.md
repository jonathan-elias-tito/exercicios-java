# 🏨 Exercise: Hotel Reservation System (Custom Exceptions)

Java project focused on implementing business rule validations through **Custom Exceptions** (`DomainException`).

---

## 🎯 Key Concepts Applied

- **Exception Handling:** `try-catch` blocks, multiple `catch` handlers, and `RuntimeException`.
- **Custom Exceptions:** Created the `DomainException` class to delegate domain business logic validations away from the main application flow.
- **Date Manipulation:** Modern Java Date & Time API using `java.time.LocalDate` and `DateTimeFormatter`.
- **Encapsulation & Domain Rules:** Enforced validation logic directly inside entity constructors and methods.

---

## 📌 Business Rules Validated

1. Check-out date must strictly be after the check-in date.
2. Reservation updates are only allowed for future dates.
3. If any validation fails, the custom `DomainException` is caught gracefully without breaking or crashing the application.

---

## 🚀 How to Run

1. Import the `ExercicioReservaHotel` folder into your IDE (Eclipse, VS Code, or IntelliJ).
2. Run `application.Program.java`.
3. Input room number and dates in the `dd/MM/yyyy` format.
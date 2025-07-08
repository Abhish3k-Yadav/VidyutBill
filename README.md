# VidyutBill: Electricity Billing System

## Overview

VidyutBill is a Java-based desktop application for managing electricity billing operations. It provides a user-friendly interface for both administrators and customers to handle billing, payments, customer management, and reporting. The application uses Swing for the UI and MySQL for data storage.

## Features

- **User Authentication:** Admin and Customer login/signup with role-based access.
- **Customer Management:** Add, view, and update customer details.
- **Billing:** Calculate, generate, and view electricity bills.
- **Payments:** Pay bills online (opens Paytm in browser) and update payment status.
- **Reports:** View bill and payment history.
- **Utilities:** Quick access to Notepad and Calculator.
- **Modern UI:** Uses custom icons and images for a professional look.


## Setup Instructions

### Prerequisites

- **Java JDK 8 or newer** (Tested with JDK 21/2024)
- **MySQL Server**
- **MySQL Connector/J** (JAR included)
- (Optional) **JavaFX SDK** (if you want to use JavaFX features in the future)

### 1. Clone the Repository

```sh
git clone https://github.com/yourusername/VidyutBill.git
cd VidyutBill
```

### 2. Set Up the Database

- Open MySQL Workbench or your preferred client.
- Run the SQL script in `VM.sql` to create the required database and tables:

```sql
source VM.sql;
```

- Update the database credentials in `VidyutBill/src/vidyutbill/Conn.java` if needed.

### 3. Build and Run the Application

- Open the project in NetBeans, IntelliJ, or Eclipse.
- Add `mysql-connector-java-8.0.28.jar` and `rs2xml.jar` to your project libraries.
- Build and run the project.

#### **Run from Command Line**

```sh
javac -cp ".;mysql-connector-java-8.0.28.jar;rs2xml.jar" VidyutBill/src/vidyutbill/*.java
java -cp ".;mysql-connector-java-8.0.28.jar;rs2xml.jar;VidyutBill/src" vidyutbill.Login
```

### 4. Using the Application

- **Login:** Start as Admin or Customer. Default credentials can be set in the database.
- **Admin:** Access all features including customer and billing management.
- **Customer:** View and pay bills, update information.
- **Payments:** When paying a bill, the Paytm payment page opens in your browser. Complete the payment and return to the app.

## Database Schema

See `VM.sql` for full schema. Main tables:

- `login` (user authentication)
- `customer` (customer details)
- `meter_info` (meter details)
- `tax` (billing rates)
- `bill` (bills and payment status)

## Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

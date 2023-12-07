CREATE DATABASE IF NOT EXISTS libraryproject;

USE libraryproject;

CREATE TABLE IF NOT EXISTS book_description (
	BookDescID INT NOT NULL AUTO_INCREMENT,
	Title VARCHAR(140) NOT NULL,
    Author VARCHAR(50),
	Genre VARCHAR(25),
    Summary VARCHAR (300),
    ISBN VARCHAR(15) NOT NULL,
    PRIMARY KEY (BookDescID) 
);

CREATE TABLE IF NOT EXISTS book (
	BookID INT NOT NULL AUTO_INCREMENT,
	BookDescID INT NOT NULL,
	PRIMARY KEY (BookID),
	FOREIGN KEY (BookDescID) REFERENCES book_description (BookDescID) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS borrower (
	BorrowerID INT NOT NULL AUTO_INCREMENT,
    BorrowerFirstName VARCHAR(25) NOT NULL,
    BorrowerLastName VARCHAR(25) NOT NULL,
    PRIMARY KEY (BorrowerID)
);

CREATE TABLE IF NOT EXISTS borrowed_book (
	BorrowedBookID INT NOT NULL AUTO_INCREMENT,
    BookID INT NOT NULL,
    BorrowerID INT NOT NULL,
    CheckOutDate DATE NOT NULL,
    DueDate DATE NOT NULL,
    ReturnedDate DATE,
    PRIMARY KEY (BorrowedBookID),
    FOREIGN KEY (BookID) REFERENCES book(BookID) ON DELETE CASCADE,
    FOREIGN KEY (BorrowerID) REFERENCES borrower(BorrowerID) ON DELETE CASCADE
);

INSERT INTO borrower (BorrowerFirstName, BorrowerLastName) VALUES ("Alex", "Angler");
INSERT INTO borrower (BorrowerFirstName, BorrowerLastName) VALUES ("Bob", "Barker");
INSERT INTO borrower (BorrowerFirstName, BorrowerLastName) VALUES ("Carl", "Carlson");
INSERT INTO borrower (BorrowerFirstName, BorrowerLastName) VALUES ("Diana", "Driver");
INSERT INTO borrower (BorrowerFirstName, BorrowerLastName) VALUES ("Etna", "Eustis");

INSERT INTO book_description (Title, Author, Genre, Summary, ISBN) VALUES ("Treasure Island", "Robert Louis Stevenson", "Adventure", "pirates and buried gold.", "610014604");
INSERT INTO book_description (Title, Author, Genre, Summary, ISBN) VALUES ("The Hobbit", "J. R. R.  Tolkien", "Fantasy", "A quest to slay a dragon.", "1827184");
INSERT INTO book_description (Title, Author, Genre, Summary, ISBN) VALUES ("The Lord of the Rings", "J. R. R. Tolkien", "Fantasy", "A quest to destroy a magic ring", "1487587");
INSERT INTO book_description (Title, Author, Genre, Summary, ISBN) VALUES ("Don Quixote", "Miguel de Cervantes", "Adventure", "Chivalrous knight fights windmills", "PQ6323");
INSERT INTO book_description (Title, Author, Genre, Summary, ISBN) VALUES ("Dracula", "Bram Stoker", "Horrow", "A vampire wants a new home", "1447002");

INSERT INTO book (BookDescID) VALUES (1);
INSERT INTO book (BookDescID) VALUES (1);
INSERT INTO book (BookDescID) VALUES (2);
INSERT INTO book (BookDescID) VALUES (2);
INSERT INTO book (BookDescID) VALUES (3);
INSERT INTO book (BookDescID) VALUES (3);
INSERT INTO book (BookDescID) VALUES (4);
INSERT INTO book (BookDescID) VALUES (4);
INSERT INTO book (BookDescID) VALUES (5);
INSERT INTO book (BookDescID) VALUES (5);

INSERT INTO borrowed_book (BookID, BorrowerID, CheckOutDate, DueDate) VALUES (1, 1, "2023-12-07", "2023-12-15");
INSERT INTO borrowed_book (BookID, BorrowerID, CheckOutDate, DueDate, ReturnedDate) VALUES (3, 1, "2023-11-28", "2023-12-06", "2023-12-06");
INSERT INTO borrowed_book (BookID, BorrowerID, CheckOutDate, DueDate) VALUES (3, 2, "2023-12-07", "2023-12-15");
INSERT INTO borrowed_book (BookID, BorrowerID, CheckOutDate, DueDate) VALUES (4, 3, "2023-12-07", "2023-12-15");
INSERT INTO borrowed_book (BookID, BorrowerID, CheckOutDate, DueDate) VALUES (5, 4, "2023-12-07", "2023-12-07");


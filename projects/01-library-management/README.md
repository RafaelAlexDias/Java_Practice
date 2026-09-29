# 01 — Library Management System

Practical project that puts together classes, OOP, custom checked exceptions and the Stream API.

## Features

- Add / remove / find books (`library.Library`)
- Borrow and return books, throwing custom exceptions (`exceptions.BookAlreadyAvailableException`, `exceptions.BookNotFoundException`)
- Search and filter by author / genre (streams)
- Statistics: totals and grouping by genre / author (`library.LibraryStatistics`)
- Read-only access via a defensive copy (`Library.getBooks()` returns `List.copyOf`)

## File map

| File | Role |
|---|---|
| `src/library/Book.java` | Book model with auto-generated id |
| `src/library/Library.java` | In-memory book repository + operations |
| `src/library/LibraryStatistics.java` | Stream-based aggregates and groupings |
| `src/library/Main.java` | Demo of the whole flow |
| `src/exceptions/BookNotFoundException.java` | Checked exception for missing books |
| `src/exceptions/BookAlreadyAvailableException.java` | Checked exception for double returns |

## How to run

```powershell
& "C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.3\jbr\bin\javac.exe" -encoding UTF-8 -d out src/library/*.java src/exceptions/*.java
& "C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.3\jbr\bin\java.exe" -cp out library.Main
```
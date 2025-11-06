# Java Data Structures

![Java CI](https://github.com/faysal-mahmud925/java-data-structures/actions/workflows/maven.yml/badge.svg)

A collection of classic **Data Structures implemented in Java**, complete with **unit tests** and **continuous integration (CI)** via GitHub Actions.

---

## 🧩 Features
- Implementations of core data structures (e.g., Stack, Queue, LinkedList, Trees, Graphs)
- Unit tests powered by **JUnit 5**
- Automated build & test pipeline using **Maven**
- Continuous integration setup with **GitHub Actions**

---

## ⚙️ Project Structure
java-data-structures/
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com/example/
│ │ └── datastructures/
│ └── test/
│ └── java/
│ └── com/example/
│ └── datastructures/
├── pom.xml
└── README.md

---

## 🚀 Getting Started

### 1️⃣ Clone the repository
```bash
git clone https://github.com/faysal-mahmud925/java-data-structures.git
cd java-data-structures
2️⃣ Build and test with Maven
mvn clean test
🧪 Example: Stack Implementation
public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T value) { list.addFirst(value); }

    public T pop() { return list.removeFirst(); }

    public boolean isEmpty() { return list.isEmpty(); }
}
🧠 Tests
All data structures are tested with JUnit 5.
Example:
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    void testPushAndPop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        assertEquals(1, stack.pop());
    }
}
🔄 Continuous Integration
GitHub Actions automatically runs all tests on every commit or pull request.
See the workflow file here: .github/workflows/maven.yml
📚 Future Plans
Add sorting algorithms (Merge Sort, Quick Sort, etc.)
Add Graph traversal algorithms (DFS, BFS)
Improve test coverage
Add benchmarking for performance comparison
🧑‍💻 Author
Faysal Mahmud
📦 GitHub: faysal-mahmud925
🪪 License
This project is licensed under the MIT License — feel free to use and modify.

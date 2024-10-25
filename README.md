# Voting System API


Hi, I'm **Teja Chinitha**. I graduated from **Vellore Institute of Technology** in 2024 with a Bachelor of Technology degree in Computer Science. I have 1.2 years of experience in the software domain and have completed 3-4 internships in software engineering and Java backend development.

### My Coding Profiles
- [GitHub](https://github.com/Teja-07)
- [Leetcode](https://leetcode.com/Teja_07/)
- [GeeksforGeeks](https://auth.geeksforgeeks.org/user/chinthateja07)
- [HackerRank](https://www.hackerrank.com/profile/chinthateja07)

---

#### Technologies Used:

- **Java and Spring Boot**: The application is developed using Java Spring Boot, allowing for efficient handling of candidates and votes. It enables quick addition of candidates and ensures fast vote counting and retrieval, resulting in optimized performance.
  
- **RESTful Architecture and JSON Data Format**: The RESTful API architecture uses JSON format for adding candidates and casting votes. This API integrates seamlessly with various operations such as adding candidates, casting votes, and retrieving results, enhancing the user experience and real-time data accessibility.
  
- **Postman**: Postman is used to test API endpoints, ensuring that requests and responses are correct. It helps streamline the development process by efficiently validating API functionality and correctness during the implementation phase.

## Project: Voting System API

This project provides a simple voting system API that allows multiple users to vote for candidates. The system includes the following functionalities:


### Requirements

1. **`enterCandidate` API**  
   Takes a candidate's name as a parameter and saves it into a table with the vote count initialized to 0.
   ![image](https://github.com/user-attachments/assets/7a165006-c2d3-47b3-b10e-1d6617189f8b)


2. **`castVote` API**  
   Takes a candidate's name as a parameter, increments the vote count for the candidate, and returns the updated vote count.
   ![image](https://github.com/user-attachments/assets/63840103-fd09-4bee-b6b2-2e204e079f16)


3. **`countVote` API**  
   Takes a candidate's name as a parameter and returns the latest vote count for that candidate.
   ![image](https://github.com/user-attachments/assets/10dcffa4-6c2e-4d78-a732-ebe2345543b3)


4. **`listVote` API**  
   <img width="1407" alt="Screenshot 2024-10-24 at 7 26 54 PM" src="https://github.com/user-attachments/assets/b1c56e99-5df5-4e54-a53c-0d77b757121f">



5. **`getWinner` API**  
 <img width="1334" alt="Screenshot 2024-10-24 at 7 27 23 PM" src="https://github.com/user-attachments/assets/4c3d48e6-a5d6-4ff0-9c58-e0f6fd397675">


```markdown
#### How to Run VotesTracker API:

1. **Clone the Repository**: Clone the project to your local machine using the following command:
   ```bash
   git clone https://github.com/Teja-07/VotesTracker.git
   ```

2. **Navigate to the Directory**: Enter the cloned repository directory using the following command:
   ```bash
   cd VotesTracker
   ```

3. **Build the Project**: Build the project using one of the following commands:
   - For Maven:
     ```bash
     mvn clean install
     ```
   - For Gradle:
     ```bash
     gradle clean build
     ```
4. **Access VotesTracker**: Once the application is running, access VotesTracker through your web browser at:
   ```bash
   http://localhost:8080
   ```
```

# lab_exam - Direct JWT Token Generation

## Requirements
- JDK 17 or newer
- IntelliJ IDEA / Eclipse / Spring Tool Suite
- Maven (or use the IDE's bundled Maven)

## Run in IntelliJ IDEA
1. Extract `lab_exam.zip`.
2. Open IntelliJ IDEA and choose **Open**.
3. Select the extracted `lab_exam` folder (the folder containing `pom.xml`).
4. Allow Maven to import and download dependencies.
5. Open `src/main/java/com/example/lab_exam/LabExamApplication.java`.
6. Run `LabExamApplication`.

The generated JWT will appear in the Run console.

## Run from terminal
Open a terminal in the project folder and run:

```bash
mvn spring-boot:run
```

Or build an executable JAR:

```bash
mvn clean package
java -jar target/lab_exam-0.0.1-SNAPSHOT.jar
```

## Customize the JSON payload
Edit the `userJson` string in `LabExamApplication.java`.

## Customize the secret
Change `secretKey` in `LabExamApplication.java`. For HS256, use a secret with at least 32 bytes. This lab uses a simple hard-coded key for demonstration only. Do not hard-code secrets in real applications.

The token expires after one hour. JWT payloads are Base64URL-encoded, not encrypted, so do not put passwords or other sensitive data in them.

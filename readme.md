# Socket Programming Project

This project demonstrates socket programming in Java, featuring both echo and factorial servers and clients. It is designed to help understand the basics of network communication using sockets.

## Project Structure

The project consists of the following components:

- **EchoServer**: A server that echoes back any message sent by the client.
- **EchoClient**: A client that connects to the EchoServer and sends messages.
- **FactorialServer**: A server that calculates the factorial of a number sent by the client.
- **FactorialClient**: A client that connects to the FactorialServer and sends a number to compute its factorial.

## Setup Instructions

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor for Java development (e.g., IntelliJ IDEA, Eclipse, VS Code)

### Steps

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd SocketProgramming
   ```

2. **Compile the Java Files**:
   Navigate to the `src` directory and compile the Java files:
   ```bash
   cd src
   javac *.java
   ```

3. **Run the Servers and Clients**:
   Open separate terminal windows for each server and client.

## Usage Examples

### Echo Server and Client

1. **Start the EchoServer**:
   ```bash
   java EchoServer
   ```
   The server will start and wait for client connections on port 6000.

2. **Start the EchoClient**:
   ```bash
   java EchoClient
   ```
   The client will connect to the server and prompt you to enter a message. Type your message and press Enter. The server will echo back the message.

### Factorial Server and Client

1. **Start the FactorialServer**:
   ```bash
   java FactorialServer
   ```
   The server will start and wait for client connections on port 6001.

2. **Start the FactorialClient**:
   ```bash
   java FactorialClient
   ```
   The client will connect to the server and prompt you to enter a number. Type a number and press Enter. The server will compute the factorial of the number and send the result back to the client.

## Code Overview

### EchoServer

The `EchoServer` class creates a server socket that listens on port 6000. It accepts client connections and reads messages from the client. Each message is echoed back to the client.

### EchoClient

The `EchoClient` class creates a socket to connect to the `EchoServer` on port 6000. It allows the user to input messages, which are sent to the server. The client then reads and displays the echoed message from the server.

### FactorialServer

The `FactorialServer` class creates a server socket that listens on port 6001. It accepts client connections and reads a number from the client. The server computes the factorial of the number and sends the result back to the client.

### FactorialClient

The `FactorialClient` class creates a socket to connect to the `FactorialServer` on port 6001. It allows the user to input a number, which is sent to the server. The client then reads and displays the factorial result from the server.

## Notes

- Ensure that the server is running before starting the client.
- The default ports for the servers are 6000 (EchoServer) and 6001 (FactorialServer). You can change these ports in the respective server and client classes if needed.
- This project is intended for educational purposes to demonstrate socket programming concepts in Java.

#!/bin/bash

# Killing User Service running  on port 8081
kill -9 $(lsof -t -i:8761)

# Killing User Service running  on port 8081
kill -9 $(lsof -t -i:8081)

# Killing Hotel process running on port 8082
kill -9 $(lsof -t -i:8082)

# Kill Ratting service running  on port 8083
kill -9 $(lsof -t -i:8083)

# Kill Ratting service running  on port 8083
kill -9 $(lsof -t -i:8084)

# Kill Ratting service running  on port 8083
kill -9 $(lsof -t -i:8085)

echo "Processes on ports 8081, 8082, and 8083 killed."


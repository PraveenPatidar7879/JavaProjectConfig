#!/bin/bash

# Navigate to the Config Server folder and run mvn compile
cd CnfigServer/demo/ || exit
echo "Building Config Server..."
mvn spring-boot:run  > Config-Server.log 2>&1 &
MS1_PID=$!

# Navigate back to the original directory
cd ../../

cd Rating/demo/ || exit
echo "Building Ratings..."
mvn spring-boot:run  > microservice1.log 2>&1 &
MS2_PID=$!

# Navigate back to the original directory
cd ../../

# Navigate to the Hotel folder and run mvn compile
cd Hotel/demo/ || exit
echo "Building Hotel..."
mvn spring-boot:run  > microservice2.log 2>&1 &
MS3_PID=$!

# Navigate back to the original directory
cd ../../

# Navigate to the User folder and run mvn compile
cd User/demo/ || exit
echo "Building User..."
mvn spring-boot:run  > microservice3.log 2>&1 &
MS4_PID=$!

# Navigate back to the original directory
cd ../../

# Navigate to the User folder and run mvn compile
cd  Apigetway/demo/ || exit
echo "Building API gateway..."
mvn spring-boot:run  > API-Gateway.log 2>&1 &
MS5_PID=$!

# Navigate back to the original directory
cd ../../

# Navigate to the User folder and run mvn compile
cd ServiceRegistry/demo/ || exit
echo "Building Service Ragistry..."
mvn spring-boot:run  > Service_Ragistry.log 2>&1 &
MS6_PID=$!

# Navigate back to the original directory
cd ../../

# Wait for all microservices to finish (e.g., until the script is interrupted)mvn spring-boot:run
wait $MS1_PID
wait $MS2_PID
wait $MS3_PID
wait $MS4_PID
wait $MS5_PID
wait $MS6_PID

echo "All microservices have been stopped."

#!/bin/bash

# Navigate to the Config Server folder and run mvn compile
cd CnfigServer/demo/ || exit
echo "Building Config Server..."
mvn clean install

# Navigate back to the original directory
cd ../../

# Navigate to the Service Registry folder and run mvn compile
cd ServiceRegistry/demo/ || exit
echo "Building Service Ragistry..."
mvn clean install

# Navigate back to the original directory
cd ../../

cd Rating/demo/ || exit
echo "Building Ratings..."
mvn clean install 

# Navigate back to the original directory
cd ../../

# Navigate to the Hotel folder and run mvn compile
cd Hotel/demo/ || exit
echo "Building Hotel..."
mvn clean install

# Navigate back to the original directory
cd ../../

# Navigate to the User folder and run mvn compile
cd User/demo/ || exit
echo "Building User..."
mvn clean install 

# Navigate back to the original directory
cd ../../

# Navigate to the User folder and run mvn compile
cd  Apigetway/demo/ || exit
echo "Building API gateway..."
mvn clean install

# Navigate back to the original directory
cd ../../



echo "All microservices have been build"

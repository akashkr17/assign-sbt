# Overview

##### Simple Sbt based Project
This is the module which uses the scala version 2.12.12 and sbt version 1.4.4
This project has one root module and two sub module common and actor.
Actor sub module also dependent on common module



#  Library dependency for common
#### 1.embedded-kafka
#### 2.json4s
#### 3.scalactic

#  Test dependency common
#### 1.scalatest 
#### 2.mockito-scala 

#  Library dependency for actor
#### 1.akka-typed-actor
#### 2.akka-stream
#### 3.akka-persistence-typed

#  Test dependency actor
#### 1. akka-actor-testkit-typed 
#### 2.scalatest

#  Plugins
#### 1.project- codesquad-sbt-plugin
#### 2.sbt-scoverage


# Installation of Sbt and scala
#### 1.You must first install a JDK. We recommend AdoptOpenJDK JDK 8 or JDK 11.

#### 2.Next, install Sbt by typing the following commands:

```bash
echo "deb https://repo.scala-sbt.org/scalasbt/debian all main" | sudo tee /etc/apt/sources.list.d/sbt.list
echo "deb https://repo.scala-sbt.org/scalasbt/debian /" | sudo tee /etc/apt/sources.list.d/sbt_old.list
curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | sudo apt-key add
sudo apt-get update
sudo apt-get install sbt
```
#### 3.Verify the installation by running command:
```bash
sbt sbtversion
```

# Usage

#### 1. Clone the project.
```bash
git clone https://github.com/akashkr17/assign-sbt.git
```

#### 2.Start the sbt server using command
```bash
sbt
```
#### 3. This command compile the source code of the project
```bash
compile 
```


#### 4. This command take the compiled code and package it in its distributable format, such as a JAR.
```bash
package
```
#### 5.This is command for executing code .
```bash
 run
```

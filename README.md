
# Agile testing: TDD and BDD approaches using Jenkins, Maven, JUnit Selenium, JBehave and Serenity

## 1. Setup Jenking Server

Jenkins Server is contained in a Docker image. To setup an instance, you need to run the following steps:

* Having Docker installed and running on your host machine, run the following command under the project folder:

```
$ docker-compose up jenkins
```

* During initialization console will present the following: "Jenkins initial setup is required. An admin user has been created and a password generated". Copy that generated hash password, open [http://localhost:8000](http://localhost:8000) and enter it in order to finish the setup.

* Install Maven Plugin from the *Manane Jenkins/Manage Plugins* section

* Set enviroment variable `DISPLAY=:0` under *Manaje Jenkins/Configure System/Global properties* section

## 2. Enabling Display for chromedriver

* Login in the Jenkins docker container as root

```
$ docker exec -u 0 -it <CONTAINER_ID> bash
```

### 2.1 Installation requirements

Run the following commands (only the first time)

```
$ (root)$ apt-get update
$ (root)$ apt-get install libgconf-2-4
$ (root)$ apt-get --no-install-recommends install xvfb xorg
```

### 2.2 Start the in-memory display server

```
$ (root)$ Xvfb :0 -ac -screen 0 1024x768x24 &
```

## 3. Create a new item and run the test cases

Open the [Jenkins Admin](http://localhost:8080), log in, and follow the steps bellow:

* Enter an item name
* Select `Maven Project` and click in the OK button
* In the source code management section, select `Git`
* Under Repository URL, enter this GIT repository URL `https://github.com/santteegt/jenkins-automate-testing.git`
* In order to build the project, go to the project page and select either `Build now` option or `Build periodically` under the `Configure` menu option

## 4. Happy Hacking :)

Feel free to extend this test cases suite if you want to show up more scenarios that help to implement agile testing in a development team
 
## 5. License

See [Apache License 2.0](LICENSE)


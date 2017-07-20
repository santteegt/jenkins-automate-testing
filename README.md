
# Agile testing using Jenkins, BDD, Maven, JUnit & Selenium

## Setup Jenking Server

Jenkins Server is contained in a Docker image. To setup an instance, you need to run the following steps:

* Having Docker installed and running on your host machine, run the following command under the project folder:

```
$ docker-compose up jenkins
```

* During initialization console will present the following: "Jenkins initial setup is required. An admin user has been created and a password generated". Copy that generated hash password, open [http://localhost:8000](http://localhost:8000) and enter it in order to finish the setup.

* Install Maven Plugin from the *Manane Jenkins/Manage Plugins* section

# Agile testing: TDD and BDD approaches using Jenkins, Maven, JUnit Selenium, JBehave and Serenity

## Setup Jenking Server

Jenkins Server is contained in a Docker image. To setup an instance, you need to run the following steps:

* Having Docker installed and running on your host machine, run the following command under the project folder:

```
$ docker-compose up jenkins
```

* During initialization console will present the following: "Jenkins initial setup is required. An admin user has been created and a password generated". Copy that generated hash password, open [http://localhost:8000](http://localhost:8000) and enter it in order to finish the setup.

* Install Maven Plugin from the *Manane Jenkins/Manage Plugins* section

* Set enviroment variable `DISPLAY=:0` under *Manaje Jenkins/Configure System/Global properties* section

## Run terminal as root

```
$ docker exec -u 0 -it <CONTAINER_ID> bash
```

### Install requirements

```
$ (root)$ apt-get update
$ (root)$ apt-get install libgconf-2-4
$ (root)$ apt-get --no-install-recommends install xvfb xorg
$ (root)$ Xvfb :0 -ac -screen 0 1024x768x24 &
```
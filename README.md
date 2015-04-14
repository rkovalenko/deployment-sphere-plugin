Deployment-sphere
=======

Jenkins plugin to have a bird's eye view of your continuous deployment pipeline.

Status
------

[![Build Status](https://travis-ci.org/webdizz/deployment-sphere-plugin.png?branch=master)](https://travis-ci.org/webdizz/deployment-sphere-plugin)
[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/webdizz/deployment-sphere-plugin/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

Requirements environment:
------

1. Java 1.7
2. Git
3. Maven
4. Lombok

Steps to startup deployment-sphere-plugin:
------

1. Сlone plugin on your Computer, go there and run ./gradlew :pl:build
2. Then run ./gradlew :pl:server. By default Jetty will run on [http://localhost:8080/](http://localhost:8080/).

Add deployment-sphere-plugin to eclipce:
------

1. Install in IDE [lombok](http://projectlombok.org/download.html).
2. From Eclipce Marketplace lnstall Gradle IDE.
3. Before adding project into IDE go to deployment-sphere-plugin and run ./gradlew :pl:build.
4. In IDE go to Import -> Gradle-> Gradle Project select directory with project and click Build Model. After that just add it into IDE.

Jenkins configuration initial jobs:
------

1. Create New Item "Build".
  * Tick "This build is parameterized" with any name. As an example "**APP_PARAMETER**".
  * Add post-build Action "Collect Build Metadata" and "Application Name" put "**app-name**" in "Build version Pattern" put "**$APP_PARAMETER.{v}**"
2. Create New Item "Deploy".
  * Add post-build Action "Collect Deploy Metadata" in "Application name to deploy" put "**app-name**"

Building
--------
To build the plugin from source:

    ./gradlew :pl:build

To run Jenkins and test JPI:

    ./gradlew :pl:server

Build job-dsl.hpi to be installed in Jenkins:

    ./gradlew :pl:jpi

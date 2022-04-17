# Book store
Book Store application with Spring Boot

## What is Java Spring Boot?

![image](https://miro.medium.com/max/900/1*yrDm830mTFebJQ8D7SCyCw.jpeg)

Java Spring Framework (Spring Framework) is a popular, open source, enterprise-level framework for creating standalone, production-grade applications that run on the Java Virtual Machine (JVM).

Java Spring Boot (Spring Boot) is a tool that makes developing web application and microservices with Spring Framework faster and easier through three core capabilities:

1. Autoconfiguration
2. An opinionated approach to configuration
3. The ability to create standalone applications

These features work together to provide you with a tool that allows you to set up a Spring-based application with minimal configuration and setup.

![image](https://se.ewi.tudelft.nl/desosa2019/chapters/spring-boot/images/spring-boot/spring_versions.PNG)

## Why is Spring Framework so popular?

Spring Framework offers a dependency injection feature that lets objects define their own dependencies that the Spring container later injects into them. This enables developers to create modular applications consisting of loosely coupled components that are ideal for microservices and distributed network applications.

Spring Framework also offers built-in support for typical tasks that an application needs to perform, such as data binding, type conversion, validation, exception handling, resource and event management, internationalization, and more. It integrates with various Java EE technologies such as RMI (Remote Method Invocation), AMQP (Advanced Message Queuing Protocol), Java Web Services, and others. In sum, Spring Framework provides developers with all the tools and features the need to create loosely coupled, cross-platform Java EE applications that run in any environment.

![image](https://1.bp.blogspot.com/-4AdVIZp1Rjo/XpmsmctsJ1I/AAAAAAAAeP4/mNiycr0Np6Q_2G8mPFmaEFw_1fCvvr9MwCLcBGAsYHQ/w1200-h630-p-k-no-nu/Top%2B20%2BSpring%2BBoot%2BInterview%2BQuestions%2Bwith%2BAnswers.png)

## What Spring Boot adds to Spring Framework

As capable and comprehensive as Spring Framework is, it still requires significant time and knowledge to configure, set up, and deploy Spring applications. Spring Boot mitigates this effort with three important capabilities.

### Autoconfiguration
Autoconfiguration means that applications are initialized with pre-set dependencies that you don't have to configure manually. As Java Spring Boot comes with built-in autoconfiguration capabilities, it automatically configures both the underlying Spring Framework and third-party packages based on your settings (and based on best practices, which helps avoid errors). Even though you can override these defaults once the initialization is complete, Java Spring Boot's autoconfiguration feature enables you to start developing your Spring-based applications fast and reduces the possibility of human errors.

![image](https://www.tutorialandexample.com/wp-content/uploads/2020/02/Spring-Boot-Features.png)

### Opinionated approach
Spring Boot uses an opinionated approach to adding and configuring starter dependencies, based on the needs of your project. Following its own judgment, Spring Boot chooses which packages to install and which default values to use, rather than requiring you to make all those decisions yourself and set up everything manually.

You can define the needs of your project during the initialization process, during which you choose among multiple starter dependencies—called Spring Starters—that cover typical use cases. You run Spring Boot Initializr by filling out a simple web form, without any coding.

For example, the ‘Spring Web’ starter dependency allows you to build Spring-based web applications with minimal configuration by adding all the necessary dependencies—such as the Apache Tomcat web server—to your project. ‘Spring Security’ is another popular starter dependency that automatically adds authentication and access-control features to your application.

Spring Boot includes over 50 Spring Starters, and many more third-party starters are available.

### Standalone applications
Spring Boot helps developers create applications that just run. Specifically, it lets you create standalone applications that run on their own, without relying on an external web server, by embedding a web server such as Tomcat or Netty into your app during the initialization process. As a result, you can launch your application on any platform by simply hitting the Run command. (You can opt out of this feature to build applications without an embedded Web server.)

## Spring Boot vs. Spring Framework

![image](https://s3.ap-south-1.amazonaws.com/myinterviewtrainer-domestic/public_assets/assets/000/000/245/original/Difference_Between_Spring_and_Spring_Boot.png?1616150564)

Again, the biggest advantages of using Spring Boot versus Spring Framework alone are ease of use and faster development. In theory, this comes at the expense of the greater flexibility you get from working directly with Spring Framework.

But, in practice, unless you need or want to implement a very unique configuration, using Spring Booth is worth the tradeoff. You still are able to use Spring Framework’s very popular annotation system that lets you easily inject extra dependencies (not covered by Spring Starters) into your application. And, you still get access to all Spring Framework features, including easy event handling, validation, data binding, type conversion, and built-in security and testing capabilities. Bottom line, if your project’s scope is covered by even just one Spring Starter, Spring Boot can significantly streamline development.

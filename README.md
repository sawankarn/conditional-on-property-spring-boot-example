# How to use @ConditionalOnProperty annotation in Spring Boot?


In this tutorial, we'll examine the main **purpose of the @ConditionalOnProperty annotation**.

First, we'll start with a bit of background about what @ConditionalOnProperty is. Then we'll look at some practical examples to help understand how it works and what features it brings.

## 2. The Purpose of @ConditionalOnProperty

Typically, when developing Spring-based applications, **we need to create some beans conditionally based on the presence and value of a configuration property**.

For example, we may want to register a DataSource bean to point to a production or test database depending on if we set a property value to “prod” or “test.”

Fortunately, achieving this isn't as hard as it might look upon first glance. The Spring framework provides the @ConditionalOnProperty annotation precisely for this purpose.


### You can check the full tutorial on **[youtube](https://youtu.be/LVoSX9h42Qo)**

![enter image description here](https://img.youtube.com/vi/LVoSX9h42Qo/0.jpg)

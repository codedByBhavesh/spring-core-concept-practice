# Section 7 — Autowiring & Qualifier

##  Overview

This section covers **Dependency Injection using Spring Java Configuration**.

### Concepts Covered

* @Autowired`
* @Qualifier`
* Multiple beans of the same type
* Manual Dependency Injection
* @Configuration` and `@Bean`
* ApplicationContext`

###  @Autowired

`@Autowired` automatically injects a dependency.


@Autowired
@Qualifier("featureId1")
private Feature feature;


###  @Qualifier

When multiple beans of the same type exist, `@Qualifier` selects a specific bean.


@Bean
public Feature featureId() { ... }

@Bean
public Feature featureId1() { ... }


@Qualifier("featureId1")


This tells Spring to use the `featureId1` bean.

###  Manual DI

Dependency can also be provided manually:

obj.setFeature(featureId());


###  Java Configuration

Beans are created using:

@Configuration
@Bean


Spring container:

ApplicationContext context =
    new AnnotationConfigApplicationContext(AppConfig.class);


###  Key Learning

Learned how to use `@Autowired` for automatic DI, `@Qualifier` to select a specific bean, and manual DI to provide dependencies explicitly.

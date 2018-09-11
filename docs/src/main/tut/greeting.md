---
layout: page
title:  New Layout
section: newLayout
position: 1
---
# New Layout

This is a test project that will serve us simply to have an idea of the disposition of the new styles to be implemented and the way in which the projects or libraries that use these new layouts will appear.
Then we will perform two simple exercises to visualize the new styles of layouts that we are going to implement.

## Person

```tut:invisible
import Classes._
```

This is an example of how a code can be arranged in our new test layout.
First we can make an example to instanciate a class `Person` passing `name` and  `age` parameters and the function `sumary` will return a `String`  with the data of the person.

```tut:plain
val paolo = new Person("Paolo", 40)
paolo.summary
```

## Greeting

In this case we will perform a simple greeting using the class `Greeting` passing a `name` to say hello. 

```tut:plain
val greeting = new Greeting
greeting.sayHi(name = "Pepe")
```
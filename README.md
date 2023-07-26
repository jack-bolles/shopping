# Shopping Exercise
The problem (below) is trying to be relatively simple and focused as we're not trying to challenge your algorithmic abilities. We also want it to be easier for you to fit this in around your spare time. Most of all, we hope it's fun!

In the next stage of the recruiting process we would then work with this to add functionality to it.

## What We Want To See:
* Your clearest, most communicative, well factored, test-driven code.
* Ideally in Kotlin (Java is acceptable)
* Simple structures for any data repositories, e.g. Lists or Maps (no containers)
* Frequent commits, so that we can see how the tests and implementation evolve
* And, that you have a little fun with it!

## How to get going
In your terminal, `cd` to a working folder, then (replacing firstname.surname with your own):
```
$ mkdir shopping.surname.firstname
$ cd shopping.surname.firstname
$ gradle init
```

You'll be given a series of choices. Choose:
* **Project Type:** Library
* **Language:** Kotlin or Java
* **Build script DSL:** Groovy or Kotlin
* Feel free to hit Enter for defaults on remaining choices

Save this README in the root of that project.

Then: 

`$ git init` 

and commit the initial generated project.  

## How To Submit
Email us a git bundle:

``$ git bundle create shopping-exercise.bundle main`` 


## The Problem
We want you to implement a Shopping Basket library. It should be able to:
* add items
* remove items
* show the contents
* show the total bill and total VAT separately
* items can have VAT applied or not depending on their type

Spend as much time as you want (ideally no more than an hour or two). Feel free to exercise some creative freedom! There's no absolute right or wrong here. Just remember, we're looking for your best, clearest, most communicative, well-factored, test-driven code (rather than lots of functionality).

### Example Grocery Items
* Apples 
* Oranges
* Cola Can (Standard Rate VAT: 20%)
* Ice Cream (Standard Rate VAT:20%)
* Bread (Reduced Rate VAT: 5%)
* Fruit Cake (Reduced Rate VAT: 5%)

_(Assume zero-rated for VAT unless otherwise shown)_
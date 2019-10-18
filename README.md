A.
1. Sing method can be extracted into Singable interface and implemented if needed and it's easier to test
2. Both Chicken and Duck implement interface Soundable to make their own sound
3. Rooster is similar to the above. Rooster should extend from Chicken, sure we can create a class without inheritating from Chicken and implement necessary interfaces, but why?
4. I created a LiveNearType enum to determine what animal that parrot is living near to, each type has its own sound so we don't need to create multiple parrot classes with overriding methods

B.
1. I created a parent Fish class that implements Swimable interface (I assume that all fishes in the world can swim)
2. I created 2 classes Shark and Clownfish, extending from Fish, each with its own funtionality like hunt() or makeJoke(). Regarding their sizes and colors, I created class Size and Color, in parent Fish class, there are 2 properties color and size so that when init child class, these 2 are passed into constructor with fixed values
3. I created class Dolphin that does not extend from Fish but implements Swimable interface.

I ran out of time so could not finish other parts

Starting with Animal class that can run, eventually as the requirement changes throughout the test, I've extracted some functionalities into separate interfaces like Walkable, Flyable(not sure which animal can fly but I'll just leave it there), Soundable... This approach and constant refactoring help those models adapt to new changes, but I still want to raise question to our product owner that why the requirements are changing in such a fast pace.


# Image-Filter
Filtering an image with given RGB numbers

<p align="center">
  <img src="https://user-images.githubusercontent.com/74189776/184824550-2d2ea82a-aab6-4507-8edf-dbc5f1e2392c.png" alt="main screen"/>
</p>

# Guide

## What is this program for?

With this program we can change every single pixel's RGB value. For example I can change every single pixel's red value and add like 10 RGB value to them. This will affect every single pixel to be more red.

## So how does it work

<p align="center">
  <img src="https://user-images.githubusercontent.com/74189776/184825543-4dbf739f-ff6e-43e5-8dcb-31ee4ceb0a16.gif" alt="gif"/>
</p>

### RGB color model

The RGB color model is an additive color model in which the red, green, and blue primary colors of light are added together in various ways to reproduce a broad array of colors. The name of the model comes from the initials of the three additive primary colors, red, green, and blue.

### RGB24 and RGB32

This indirect scheme restricts the number of available colors in an image CLUT—typically 256-cubed (8 bits in three color channels with values of 0–255)—although each color in the RGB24 CLUT table has only 8 bits representing 256 codes for each of the R, G, and B primaries, making 16,777,216 possible colors. However, the advantage is that an indexed-color image file can be significantly smaller than it would be with only 8 bits per pixel for each primary.

### So?

So a pixel is made up of 4 components

* A : Alpha

* R : Red

* G : Green

* B : Blue

Alpha determines the transparency while Red, Green and Blue determines the color of a pixel.

Each of these 4 components (ARGB) has a value between 0 to 255. 0 means the component is missing while 255 means the component is fully present. We can represent the value 0 to 255 using 8 bits. so each component can be represented using 8 bits.

Therefore, we will need 32 bits to represent a pixel.

<p align="center">
  <img src="https://user-images.githubusercontent.com/74189776/184831240-6da6f214-6fe3-4c58-8142-5f52181ff851.png" alt="bit"/>
</p>

### Average of RGB

Simply if we get every pixel's RGB value and calculate average value ((R+G+B)/3) and set every R, G and B value as average, we will have a black and white image.

## How do we use the program?

So there is four boxes for ARGB values. Each of them has option of

* "*" : When chosen, it will multiply the value of chosen component.

* "/" : When chosen, it will mine the given value to the value of chosen component.

* "+" : When chosen, it will add the given value to the value of chosen component.

* "-" : When chosen, it will divide the value of chosen component.

* "Avrg" : When chosen, it will set the value of component to average for every pixel.

### Example

On this photo, we set every component to "avrg" so the photo became black and white.
<p align="center">
  <img src="https://user-images.githubusercontent.com/74189776/184834672-139da156-0288-489f-b6a1-b3d5c135559a.png" alt="black and white"/>
</p>

On this photo, we set red and blue value to "* 1.1" so the program will multiply every single pixel's red and blue value with 1.1. And also we set green value to average.
<p align="center">
  <img src="https://user-images.githubusercontent.com/74189776/184834701-46b4396d-7c42-463a-b8c1-0f8170fcb286.png" alt="alpha 1 red 1 1 green avrg blue 1 1"/>
</p>

# Results

<p align="center">
  <img src="https://user-images.githubusercontent.com/74189776/184836807-6796a2ff-62b1-4777-b111-c7f147bf13c7.png" alt="street1"/>
</p>

<p align="center">
  <img src="https://user-images.githubusercontent.com/74189776/184836706-22f03fbc-c771-44d0-8711-d38882964224.png" alt="car1"/>
</p>

<p align="center">
  <img src="https://user-images.githubusercontent.com/74189776/184836775-0547a9be-7fb5-4e79-8fb0-d110edfda554.png" alt="lake1"/>
</p>

<p align="center">
  <img src="https://user-images.githubusercontent.com/74189776/184836800-cc825b6c-b5de-4664-b543-e2a3362f719a.png" alt="rose1"/>
</p>

<p align="center">
  <img src="https://user-images.githubusercontent.com/74189776/184836758-ecedf332-70b9-4472-81d5-cdabe16be610.png" alt="girl1"/>
</p>

# References

https://en.wikipedia.org/wiki/RGB_color_model


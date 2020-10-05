# FastGauss

A quick way to calculate the cumulated density function of the normal distribution, that is,
the integral between -infinity and x of the normal distribution. Comes close to the speed of computing the sigmoid-function
in tests.

Based on

Hindawi Publishing Corporation Mathematical Problems in Engineering Volume 2012, Article ID 124029
doi:10.1155/2012/124029

by

Hector Vazquez-Leal,1 Roberto Castaneda-Sheissa,1 Uriel Filobello-Nino,1 Arturo Sarmiento-Reyes,2 and Jesus Sanchez Orea1

In tests the speed came close to the speed of calculating the value of the sigmoid-function at a certain point. I am interested in exploring normal distributions and their CDF in deep neural networks and comparing them ro RELU and Sigmoid.
